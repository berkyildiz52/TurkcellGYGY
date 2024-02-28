package business;

import data.access.InstructorDao;
import entities.Instructor;
import logging.BaseLogger;

public class InstructorManager {

    private InstructorDao instructorDao;
    BaseLogger logger;

    public InstructorManager(InstructorDao instructorDao, BaseLogger logger) {

        this.instructorDao = instructorDao;
        this.logger = logger;
    }

    public void add(Instructor instructor) {
        try {
            instructorDao.add(instructor);
            logger.log("Instructor added successfully");
        } catch (Exception e) {
            logger.log("Error adding instructor: " + e.getMessage());
        }
    }

    public void update(Instructor instructor) {
        try {
            instructorDao.update(instructor);
            logger.log("Instructor updated successfully");
        } catch (Exception e) {
            logger.log("Error updating instructor: " + e.getMessage());
        }
    }

    public void delete(Instructor instructor) {
        try {
            instructorDao.delete(instructor);
            logger.log("Instructor deleted successfully");
        } catch (Exception e) {
            logger.log("Error deleting instructor: " + e.getMessage());
        }
    }
}
