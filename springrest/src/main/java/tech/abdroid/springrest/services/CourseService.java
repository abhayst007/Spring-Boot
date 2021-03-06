package tech.abdroid.springrest.services;

import java.util.List;

import tech.abdroid.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course editCourse(long courseId,Course course);
}
