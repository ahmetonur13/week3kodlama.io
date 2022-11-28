public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product=new Product(13,19,"a","b","1334","d",13);
        product.setName("Macbook Pro");
        product.setColors("grey");
        product.setCode("1334");
        product.setUnitPrice(13000);
        product.setId(1335);
        product.setDescriptions("16gb ram");
        product.setStockAmount(13);
        ProductManager productManager=new ProductManager();
        productManager.add(product);
        System.out.println(product.getName());


    }




}