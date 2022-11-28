package core.logger;

import entities.Product;

public class EmailLogger implements Logger {
    public void logg(String data) {
        System.out.println("Email Loglandı: "+data);


    }
}