public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        BaseLogger[] loggers=new BaseLogger[]{new DataBaseLogger(),new EmailLogger(),new FileLogger()};
        for(BaseLogger logger:loggers){
            logger.log("Log Mesajı");
*/
        CostumerManager costumerManager=new CostumerManager(new FileLogger());
        costumerManager.add();


    }
}