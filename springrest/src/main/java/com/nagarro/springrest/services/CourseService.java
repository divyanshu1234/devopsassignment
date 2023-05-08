package com.nagarro.springrest.services;

import java.util.List;

import com.nagarro.springrest.model.Course;

public interface CourseService {

	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}
