import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import data.access.HibernateDao;
import data.access.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.BaseLogger;
import logging.DatabaseLogger;
import logging.FileLogger;


public class Main {
    public static void main(String[] args) throws Exception {

        BaseLogger fileLogger = new FileLogger();
        BaseLogger dbLogger = new DatabaseLogger();

        Category category1 = new Category(1, "Programming");
        Category category2 = new Category(2, "Web Development");
        Category category3 = new Category(3, "Data Science");
        Category category4 = new Category(4, "Programming");


        CategoryManager categoryManager = new CategoryManager(new JdbcDao(), dbLogger);
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);
        categoryManager.update(category2);
        categoryManager.delete(category3);
        //categoryManager.add(category4);


        Course course1 = new Course(1, "Java Programming", "Learn Java ", 49.99);
        Course course2 = new Course(3, "Python for Beginners", "Explore the basics ", 39.99);
        Course course3 = new Course(4, "Python for Beginners", "Start your Python journey ", 29.99);
        Course course4 = new Course(5, "Machine Learning", "Learn the essentials ", -19.99);
        Course course5 = new Course(2, "Web Development", "Master web development ", 59.99);


        CourseManager courseManager = new CourseManager(new JdbcDao(), dbLogger);
        courseManager.add(course1);
        courseManager.add(course2);
        //courseManager.add(course3);
        //courseManager.add(course4);
        courseManager.add(course5);
        courseManager.update(course5);
        courseManager.delete(course5);


        Instructor instructor1 = new Instructor(1, "Halit Enes Kalaycı");
        Instructor instructor2 = new Instructor(2, "Engin Demirog");

        InstructorManager instructorManager = new InstructorManager(new HibernateDao(), fileLogger);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.update(instructor1);
        instructorManager.delete(instructor2);


    }
}
