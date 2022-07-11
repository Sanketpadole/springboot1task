package com.springboot1.springboot1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot1.springboot1.Service.CourseService;
import com.springboot1.springboot1.entities.Course;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	public String home() {
		return "this is home page";
		
	}
	@GetMapping("/courses")
	
	public List<Course>getCourses()
	{
		return this.courseService.getCourses();
		
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}

}
