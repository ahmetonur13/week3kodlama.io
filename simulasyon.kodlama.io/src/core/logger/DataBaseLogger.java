package core.logger;

import entities.Product;

public class DataBaseLogger implements Logger {
    public void logg(String data) {
        System.out.println("DataBase Loglandı: "+data);


    }
}