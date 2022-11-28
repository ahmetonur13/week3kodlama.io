public class CostumerManager {
    private ICostumerDal costumerDal;

      public CostumerManager(ICostumerDal costumerDal) {
          this.costumerDal = costumerDal;
          //ikinci yol.
      }
    //ICostumerDal costumerDal;
    //ilk yol.
      public void add() {
          //iş kodları yazılır.
          costumerDal.add();
      }

}





