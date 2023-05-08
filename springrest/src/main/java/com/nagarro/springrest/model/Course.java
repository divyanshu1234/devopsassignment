package com.nagarro.springrest.model;

public class Course {

	private long id;
	private String title;
	private String disc;
	/**
	 * @param id
	 * @param title
	 * @param disc
	 */
	public Course(long id, String title, String disc) {
		super();
		this.id = id;
		this.title = title;
		this.disc = disc;
	}
	/**
	 * 
	 */
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", disc=" + disc + ", getId()=" + getId() + ", getTitle()="
				+ getTitle() + ", getDisc()=" + getDisc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
