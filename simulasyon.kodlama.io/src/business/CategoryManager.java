package business;

import core.logger.Logger;
import dataAccess.CategoryDao;
import dataAccess.ProductDao;
import entities.Category;
import entities.Product;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
        this.loggers = loggers;
        this.categoryDao=categoryDao;

        }
        public void add(Category category) {
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.logg(category.getCategoryName());
        }


    }



    }

