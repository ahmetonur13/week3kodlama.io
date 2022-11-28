package dataAccess;

import entities.Product;

public class JdbcDataAccess implements ProductDao{
    public void add(Product product){
        System.out.println("JDBC Veri Tabanına Eklendi.");


    }
}
