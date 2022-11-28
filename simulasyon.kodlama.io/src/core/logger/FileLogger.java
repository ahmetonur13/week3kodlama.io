package core.logger;

import entities.Product;

public class FileLogger implements Logger{
    public void logg(String data){
        System.out.println("Dosyalar Loglandı: "+data);

    }
}
