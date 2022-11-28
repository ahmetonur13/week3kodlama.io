public class BaseLogger {
    public void log(String message){
        //log komutu ile logger.log çağrısına message cevabı verilir.
        // Aynı şekilde add komutundaki product.add gibi.
        System.out.println("Defoult BaseLogger: "+ message);

    }
}
