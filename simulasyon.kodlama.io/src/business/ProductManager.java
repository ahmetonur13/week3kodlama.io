package business;

import core.logger.Logger;
import dataAccess.ProductDao;
import entities.Product;

import java.util.List;
import java.util.Locale;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    //private List<Logger>logger;


    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao=productDao;
        this.loggers=loggers;

    }

    public void Add(Product product) throws Exception {
        //sadece kurallar.
        if(product.getCourseUnitPrice()<0){
            throw new Exception("Ürünün Fiyatı 0'dan Küçük Olamaz.");
        }
        //if(product.getCourseName().equals(product.getCourseName())){
           // throw new Exception("Kurs İsmi Tekrar Edemez.");
        //}

        productDao.add(product);
        //veri tabanına eklenmesini bu sağladı.
        for(Logger logger:loggers){
           logger.logg(product.getCourseName());
        }
    }

}
