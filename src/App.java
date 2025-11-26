import org.lessons.java.Aquila;
import org.lessons.java.Cane;
import org.lessons.java.Delfino;
import org.lessons.java.Passerotto;

public class App {
    public static void main(String[] args) throws Exception {
        Cane mioCane1 = new Cane("Wolf", 120, false);
        Passerotto mioPasserotto1 = new Passerotto("Pass", 12, true);
        Aquila miaAquila1 = new Aquila("Aqui", 70, 230);
        Delfino mioDelfino1 = new Delfino("Delfi", 200, 72);

        mioCane1.dormi();
        mioCane1.mangia();
        mioCane1.verso();
        System.out.println("-------------");
        mioPasserotto1.dormi();
        mioPasserotto1.mangia();
        mioPasserotto1.verso();
        System.out.println("-------------");
        miaAquila1.dormi();
        miaAquila1.mangia();
        miaAquila1.verso();
        System.out.println("-------------");
        mioDelfino1.dormi();
        mioDelfino1.mangia();
        mioDelfino1.verso();
        System.out.println("-------------");
    }
}
