package business;

import core.logging.Logging;
import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
    private Logging[] logging;
    private ProductDao[] productDaos;

    public ProductManager(Logging[] logging, ProductDao productDaos) {
        this.logging = logging;

    }


    public void add() throws Exception {
        Product product = null
                ;
        if (product.getCourseUnitPrice()<0) {
            throw new Exception("Ürünün Fiyatı 0'dan Küçük Olamaz.");
        }

        for (Logging loggings : logging) {
            loggings.logging(product.getCourseName());

        }

    }
}