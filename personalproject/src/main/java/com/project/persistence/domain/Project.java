package com.project.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Month;
	private String Team1;
	private int Score1;
	private int Score2;
	private String Team2;
	
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getTeam1() {
		return Team1;
	}
	public void setTeam1(String team1) {
		Team1 = team1;
	}
	public int getScore1() {
		return Score1;
	}
	public void setScore1(int score1) {
		Score1 = score1;
	}
	public int getScore2() {
		return Score2;
	}
	public void setScore2(int score2) {
		Score2 = score2;
	}
	public String getTeam2() {
		return Team2;
	}
	public void setTeam2(String team2) {
		Team2 = team2;
	}	
}