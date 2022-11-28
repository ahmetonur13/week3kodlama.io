public class Product {
    private int id;
    private String name;
    private int unitPrice;
    private String descriptions;
    private int stockAmount;
    private String colors;
    private String code;


    public Product(int id,int unitPrice,String name,String descriptions,String code,String colors,int stockAmount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.code = code;
        this.colors = colors;
        this.stockAmount = stockAmount;
        this.descriptions = descriptions;
    }

    public Product() {
        System.out.println("Yapıcı blok çalıştı.");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}