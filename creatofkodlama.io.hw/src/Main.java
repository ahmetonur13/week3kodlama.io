import business.ProductManager;
import core.logging.DataBaseLogging;
import core.logging.EmailLogging;
import core.logging.FileLogging;
import core.logging.Logging;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;
public class Main {
    public static void main(String[] args) throws Exception {
        Product product1=new Product("Yazılım geliştirme 2022 JAVA","Engin Demiroğ",1300, "2022 JAVA Yazılımcı Geliştirme Kampına Hepinizi Bekleriz.",50);
        Product product2=new Product("Programlamaya Giriş İçin Temel Kurs","Engin Demiroğ",1334,"Yazılıma Yeni Başlayanlar İçin Temel Kurs",100);
        Product[] product=
        Logging[] logging=new Logging[]{new EmailLogging(),new FileLogging(),new DataBaseLogging()};
        ProductManager productManager=new ProductManager(logging,new HibernateProductDao());
        productManager.add();

        }


    }
