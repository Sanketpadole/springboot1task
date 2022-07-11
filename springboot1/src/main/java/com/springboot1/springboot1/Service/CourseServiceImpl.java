package com.springboot1.springboot1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot1.springboot1.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course>list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java core course","this course contains basics of java"));
		list.add(new Course(4343,"spring boot course","creating rest api using spring boot"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
