public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ProductManager productManager=new ProductManager();
        Product product=new Product();
        product.prince=13;
        product.id=1313;
        product.name="ahmet";
        productManager.add(product);
    }
}