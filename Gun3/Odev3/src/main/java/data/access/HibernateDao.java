package data.access;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {


    @java.lang.Override
    public void add(Category category) {
        System.out.println("Category added via Hibernate: " + category.getName());
    }

    @java.lang.Override
    public void update(Category category) {
        System.out.println("Category updated via Hibernate: " + category.getName());
    }

    @java.lang.Override
    public void delete(Category category) {
        System.out.println("Category deleted via Hibernate: " + category.getName());
    }

    @java.lang.Override
    public void add(Course course) {
        System.out.println("Course added via Hibernate: " + course.getName());
    }

    @java.lang.Override
    public void update(Course course) {
        System.out.println("Course updated via Hibernate: " + course.getName());
    }

    @java.lang.Override
    public void delete(Course course) {
        System.out.println("Course deleted via Hibernate: " + course.getName());
    }

    @java.lang.Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added via Hibernate: " + instructor.getName());
    }

    @java.lang.Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated via Hibernate: " + instructor.getName());
    }

    @java.lang.Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor deleted via Hibernate: " + instructor.getName());
    }

}
