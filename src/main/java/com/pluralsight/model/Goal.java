package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="Goals")
/*
@NamedQueries({
	@NamedQuery(name=Goal.FIND_GOAL_REPORTS, query = "Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " +
			"from Goal g, Exercise e where g.id = e.goal.id"),
		@NamedQuery(name = Goal.FIND_ALL_GOALS, query="Select g from Goal g")
})
*/ // No need with Spring Jpa..
public class Goal {
	
	public static final String FIND_ALL_GOALS = "findAllGoals";
	public static final String FIND_GOAL_REPORTS = "findGoalReports";
	
	@Id
	@GeneratedValue
	@Column(name="GOAL_ID")
	private Long id;
	
	@Range(min = 1, max = 999)
	@Column(name="MINUTES")
	private int minutes;
	
	@OneToMany(mappedBy="goal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Exercise> exercises = new ArrayList<Exercise>();
	
	
	// @Range(min = 1, max = 1000000000)
	private int claimNumber;

	private String customerName;

	private String customerAddress;
	
	private String insuranceCarrier;
	private String claimType;

	public int getClaimNumber() {
		return claimNumber;
	}

	public String getClaimType() {
		return claimType;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public Long getId() {
		return id;
	}

	public String getInsuranceCarrier() {
		return insuranceCarrier;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setClaimNumber(int claimNumber) {
		this.claimNumber = claimNumber;
	}
	
	
	
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInsuranceCarrier(String insuranceCarrier) {
		this.insuranceCarrier = insuranceCarrier;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
