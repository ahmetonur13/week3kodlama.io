public class OgernciCrediManager extends BaseCrediManager {

    public double hesapla(double tutar) {
        //overridiable olmuş olur.hesapla ezilmiş oldu.
        //pubic final double yaparsan ezilmez.
        return tutar * 1.10;

    }
}