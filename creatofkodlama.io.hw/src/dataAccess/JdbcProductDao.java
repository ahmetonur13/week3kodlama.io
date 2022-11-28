package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao{
    public void Add(Product product) {
        System.out.println("JDBC Veri Tabanına Eklendi.");
    }
}
