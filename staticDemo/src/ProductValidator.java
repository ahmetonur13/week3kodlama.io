public class ProductValidator {
    public ProductValidator(){
        System.out.println("yapıcı calıştı.");
    }static {
        System.out.println("Static yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if(product.prince>0&&!product.name.isEmpty()){
            return true;

        }else {
            return false;
        }

    }
}
