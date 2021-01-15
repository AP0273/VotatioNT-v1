package com.nt.votationt.forms;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleFormInsert {

	private String category;
	private String name;
	private String description;
	@JsonProperty(required = false)
	private LocalDateTime start_date;
	@JsonProperty(required = false)
	private LocalDateTime end_date;
	private String cpfProponent;
	private String password;

	public ScheduleFormInsert() {

	}

	public ScheduleFormInsert(ScheduleFormUpdate formu) {
		this.category = formu.getCategory();
		this.name = formu.getName();
		this.description = formu.getDescription();
		this.start_date = formu.getStart_date();
		this.end_date = formu.getEnd_date();
		this.cpfProponent = formu.getCpfProponent();
		this.password = formu.getPassword();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDateTime start_date) {
		this.start_date = start_date;
	}

	public LocalDateTime getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}

	public String getCpfProponent() {
		return cpfProponent;
	}

	public void setCpfProponent(String cpfProponent) {
		this.cpfProponent = cpfProponent;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
