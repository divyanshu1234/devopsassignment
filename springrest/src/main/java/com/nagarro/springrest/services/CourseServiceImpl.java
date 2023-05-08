package com.nagarro.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.springrest.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(13, "java ", "course for java"));
		list.add(new Course(14, "python ", "course for python"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	public Course getCourse(long courseId) {
		Course c =null;
		for(Course course:list) {
			if(course.getId() == courseId) {
				c=course;
			}
		}
		return c;
		
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	

}
