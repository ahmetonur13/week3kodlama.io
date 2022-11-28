package core.logging;

import entities.Product;

public class FileLogging implements Logging{
    public void logging(String data) {
        System.out.println("Dosya Loglandı."+data);
    }
}
