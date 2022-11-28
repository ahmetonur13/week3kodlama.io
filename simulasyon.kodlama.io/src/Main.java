import business.CategoryManager;
import business.InstructorManager;
import business.ProductManager;
import core.logger.DataBaseLogger;
import core.logger.EmailLogger;
import core.logger.FileLogger;
import core.logger.Logger;
import dataAccess.HibernateDataAccessDao;
import dataAccess.InstructorDao;
import dataAccess.JdbcDataAccessDao;
import entities.Category;
import entities.Instructor;
import entities.Product;

import java.util.Locale;//

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = new Logger[]{new EmailLogger(), new FileLogger(), new DataBaseLogger()};


        System.out.println("-----------KATEGORİLER------");
        Category category = new Category("PROGRAMLAMA");
        CategoryManager categoryManager = new CategoryManager(new HibernateDataAccessDao(), loggers);
        categoryManager.add(category);
        System.out.println("-----------EĞİTMEN----------");
        Instructor instructor = new Instructor("Engin DEMİROĞ");
        InstructorManager instructorManager = new InstructorManager(new HibernateDataAccessDao(), loggers);
        instructorManager.add(instructor);


        System.out.println("-----------KURSLAR---------");
        Product product1 = new Product("Yazılım geliştirme 2022 JAVA", instructor, 1313, "2022 JAVA Yazılımcı Geliştirme Kampına Hepinizi Bekleriz.", 50,category);
        Product product2 = new Product("Programlamaya Giriş İçin Temel Kurs", instructor, 1334, "Yazılıma Yeni Başlayanlar İçin Temel Kurs", 100,category);
        //Product product3 = new Product("Yazılım geliştirme 2022 JAVA", instructor, 1313, "2022 JAVA Yazılımcı Geliştirme Kampına Hepinizi Bekleriz.", 50,category);
        ProductManager productManager = new ProductManager(new JdbcDataAccessDao(), loggers);
        Product[] products = {product1, product2};
        for (Product product : products) {
            productManager.Add(product);
        }
    }
}
        //productManager.Add(product1);
        //productManager.Add(product2);
        //productManager.Add(product3);



