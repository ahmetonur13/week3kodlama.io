public class ProductManager {
    public void add(Product product){
        //ProductValidator=new ProductValidator();
        //bunun yerine ProductValidator'u static yaptık.
        // ststic olursa herkes böyle kullanır,new'lenemez.
        //
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");

        }else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
}
