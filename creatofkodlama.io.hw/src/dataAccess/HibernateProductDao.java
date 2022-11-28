package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao{
    public void Add(Product product){
        System.out.println("Hibernate Veri Tabanına Eklendi.");
    }
}
