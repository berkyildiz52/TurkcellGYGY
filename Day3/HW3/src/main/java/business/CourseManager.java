package business;

import data.access.CourseDao;
import entities.Course;
import logging.BaseLogger;

import java.util.HashSet;
import java.util.Set;

public class CourseManager {

    private CourseDao courseDao;
    private Set<String> existingCourseNames = new HashSet<>();
    BaseLogger logger;

    public CourseManager(CourseDao courseDao, BaseLogger logger) {

        this.courseDao = courseDao;
        this.logger = logger;
    }

    public void add(Course course) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("Price can't be less than 0");
        }
        if (existingCourseNames.contains(course.getName())) {
            throw new Exception("Course with name \"" + course.getName() + "\" already exists.");
        }
        try {
            courseDao.add(course);
            existingCourseNames.add(course.getName());
            logger.log("Course added successfully");
        } catch (Exception e) {
            logger.log("Error adding course: " + e.getMessage());
        }
    }

    public void update(Course course) {
        try {
            courseDao.update(course);
            logger.log("Course updated successfully");
        } catch (Exception e) {
            logger.log("Error updating course: " + e.getMessage());
        }
    }

    public void delete(Course course) {
        try {
            courseDao.delete(course);
            existingCourseNames.remove(course.getName());
            logger.log("Course deleted successfully");
        } catch (Exception e) {
            logger.log("Error deleting course: " + e.getMessage());
        }
    }


}
