public class MySqlCostumerDal implements ICostumerDal,IRepository{
    //interfaceler birden fazla class'ı implemente edebilir.
    //extends'lerde sadece bir class'ı inherit edebilir.
    public void add() {
        System.out.println("Mysql veri tabanına eklendi.");

    }
}
