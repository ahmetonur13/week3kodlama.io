public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CostumerManager costumerManager=new CostumerManager();
        costumerManager.dataBaseManager=new MySqlDataBase();
        costumerManager.getCostumer();
    }
}