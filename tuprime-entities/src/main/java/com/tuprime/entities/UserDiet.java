package com.tuprime.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "getUserDietListByUserId", query = "from UserDiet ud where ud.user.id =:id"),
	@NamedQuery(name = "getUserDietByUserAndDietId", query = "from UserDiet ud where ud.user.id =:user_id and ud.diet.id=:diet_id")
	})
@Entity
@Table(name = "user_diet")
public class UserDiet {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "diet_id")
	private Diet diet;
	
	private int assignby;

	@Column(name = "id")	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	@Column(name = "assignby")
	public int getAssignby() {
		return assignby;
	}

	public void setAssignby(int assignby) {
		this.assignby = assignby;
	}
	
	
}
