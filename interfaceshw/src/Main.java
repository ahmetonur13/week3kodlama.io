public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //CostumerManager costumerManager=new CostumerManager();
        //costumerManager.costumerDal= new OracleCostumerDal();
        //ilk yöntem devamı.
        CostumerManager costumerManager=new CostumerManager(new MySqlCostumerDal());
        costumerManager.add();
        //ikinci yöntemin devamı.
        // tercih edilen yöntem.
    }
}