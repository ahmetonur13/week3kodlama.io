public abstract class GameCalculator {
    //abstract sınıflar asla new'lenemez.
    public abstract void hesapla();
    //abstract yaparsan her inheritance kendi hesaplamasını yazmak zorundadır.
    public final void gameover(){
        //final yaparsan asla override edilemez.
        //abstract class olduğu için olduğu gibi kullanılması diğer inheritance!ler için zorunludur.
    System.out.println("Oyununuz Bitti.");
    }
}