package business;

import data.access.CategoryDao;
import entities.Category;
import logging.BaseLogger;

import java.util.HashSet;
import java.util.Set;

public class CategoryManager {

    private CategoryDao categoryDao;

    private Set<String> existingCategoryNames = new HashSet<>();
    BaseLogger logger;

    public CategoryManager(CategoryDao categoryDao, BaseLogger logger) {

        this.categoryDao = categoryDao;
        this.logger = logger;
    }

    public void add(Category category) throws Exception {
        if (existingCategoryNames.contains(category.getName())) {
            throw new Exception("Category with name \"" + category.getName() + "\" already exists.");
        }
        try {
            categoryDao.add(category);
            existingCategoryNames.add(category.getName());
            logger.log("Category added successfully");
        } catch (Exception e) {
            logger.log("Error adding category: " + e.getMessage());
        }
    }

    public void update(Category category) {
        try {
            categoryDao.update(category);
            logger.log("Category updated successfully");
        } catch (Exception e) {
            logger.log("Error updating category: " + e.getMessage());
        }
    }

    public void delete(Category category) {
        try {
            categoryDao.update(category);
            existingCategoryNames.remove(category.getName());
            logger.log("Category deleted successfully");
        } catch (Exception e) {
            logger.log("Error deleting category: " + e.getMessage());
        }
    }
}
