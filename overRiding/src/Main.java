public class Main {
    public static void main(String[] args) {
        BaseCrediManager[]baseCrediManagers=new BaseCrediManager[]{new OgertmenKrediManager(),new TarımCrediManager(),new OgernciCrediManager()};
        for(BaseCrediManager baseCrediManager:baseCrediManagers){
            System.out.println(baseCrediManager.hesapla(1000));
        }
    }
}