package dataAccess;

import entities.Product;

public class HibernateDataAccess implements ProductDao{
    public void add(Product product){
        System.out.println("Hibernate Veri Tabanına Eklendi.");
    }
}
