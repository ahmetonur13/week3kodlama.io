public class CostumerManager {
    private BaseLogger logger;

    public CostumerManager(BaseLogger logger) {
        this.logger=logger;

    }public void add(){
        System.out.println("Müsteri Eklendi");
        this.logger.log("log mesajı");
    }
}
