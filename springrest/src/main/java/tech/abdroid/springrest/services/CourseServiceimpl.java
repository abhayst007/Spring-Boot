package tech.abdroid.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tech.abdroid.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core Course","this course contains basics of java."));
		list.add(new Course(4343,"Spring Boot Course","create rest api using spring boot"));
	}
	

	public List<Course> getCourses() {
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}


	@Override
	public Course editCourse(long courseId, Course course) {
		Course c = null;
		for(Course cr:list) {
			if(cr.getId()==courseId) {
				cr.setId(course.getId());
				cr.setTitle(course.getTitle());
				cr.setDesciption(course.getDesciption());
				c = cr;
			}
		}
		return c;
	}


}
