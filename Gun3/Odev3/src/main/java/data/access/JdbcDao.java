package data.access;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao {


    @java.lang.Override
    public void add(Category category) {
        System.out.println("Category added via JDBC: " + category.getName());
    }

    @java.lang.Override
    public void update(Category category) {
        System.out.println("Category updated via JDBC: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category deleted via JDBC: " + category.getName());
    }

    @java.lang.Override
    public void add(Course course) {
        System.out.println("Course added via JDBC: " + course.getName());
    }

    @java.lang.Override
    public void update(Course course) {
        System.out.println("Course updated via JDBC: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted via JDBC: " + course.getName());
    }

    @java.lang.Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added via JDBC:" + instructor.getName());
    }

    @java.lang.Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated via JDBC: " + instructor.getName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor deleted via JDBC: " + instructor.getName());
    }

}
