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
	@NamedQuery(name = "getUserWorkoutByUserAndWorkoutId", query = "from UserWorkout ud where ud.user.id =:user_id and ud.workout.id=:workout_id")
	})
@Entity
@Table(name = "user_workout")
public class UserWorkout {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "workout_id")
	private Workout workout;
	
	@Column(name = "assignby")
	private int assignedby;

	
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

	
	public Workout getWorkout() {
		return workout;
	}

	public void setWorkout(Workout workout) {
		this.workout = workout;
	}

	
	public int getAssignedby() {
		return assignedby;
	}

	public void setAssignedby(int assignedby) {
		this.assignedby = assignedby;
	} 
	
	
}
