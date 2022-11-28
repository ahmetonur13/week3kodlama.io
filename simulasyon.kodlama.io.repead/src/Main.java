import business.ProductManager;
import core.logging.DataBaseLogging;
import core.logging.EmailLogging;
import core.logging.FileLogging;
import core.logging.Logging;
import dataAccess.JdbcDataAccess;
import dataAccess.ProductDao;
import entities.Product;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product=new Product("Programlamaya Giriş İçin Temel Kurs","Engin Demiroğ",1334,100,"Yazılıma Yeni Başlayanlar İçin Temel Kurs");
        Logging[] logging=new Logging[]{new FileLogging(),new EmailLogging(),new DataBaseLogging()};
        ProductManager productManager=new ProductManager(new JdbcDataAccess(),logging);
        productManager.add(product);






    }
}