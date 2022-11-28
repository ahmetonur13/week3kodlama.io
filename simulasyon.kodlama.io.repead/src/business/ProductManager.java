package business;

import core.logging.Logging;
import dataAccess.ProductDao;
import entities.Product;

import java.util.logging.Logger;

public class ProductManager {
    private ProductDao productDao;
    private Logging[] loggings;

    public ProductManager(ProductDao productDao,Logging[] logging) {
        this.productDao = productDao;
        this.loggings = logging;
    }

    public void add(Product product) throws Exception {
        //iş kuralları yazılır.
        if (product.getCourseUnitPrice() < 0) {
            throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz.");
        }
        productDao.add(product);
        for (Logging logging : loggings) {
            logging.logg(product.getCourseName());
        }
    }
}
