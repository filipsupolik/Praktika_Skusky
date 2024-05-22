import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var elektro = new Elektro();
        elektro.pridajNotebook("125EF556", new Notebook("Asus", "A225CV", 12.8, true));
        elektro.pridajNotebook("256TY852", new Notebook());
        System.out.println("Zadajte kod:");
        String kod = sc.nextLine();
        if (!elektro.obsahujeKod(kod)) {
            System.out.println("Zadajte znacku:");
            String znacka = sc.nextLine();
            System.out.println("Zadajte typ:");
            String typ = sc.nextLine();
            System.out.println("Zadajte uhlopriecku:");
            double uhlopriecka = sc.nextDouble();
            System.out.println("Zadajte ci dotykovy:");
            boolean dotykovy = sc.nextBoolean();
            elektro.pridajNotebook(znacka, new Notebook(znacka, typ, uhlopriecka, dotykovy));
        } else {
            System.out.println("Nemozes notebook pridat, takyto kod uz je v systeme.");
        }
        try {
            elektro.zapisNotebooky();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (elektro.pocetNotebookov() == 0) {
            System.out.println("V elektre mame aktualne ziadny notebook.");
        } else if (elektro.pocetNotebookov() == 1) {
            System.out.println("V elektre mame aktualne 1 notebook.");
        } else if (elektro.pocetNotebookov() < 5 && elektro.pocetNotebookov() > 1) {
            System.out.println("V elektre mame aktualne " + elektro.pocetNotebookov() + " notebooky");
        } else {
            System.out.println("V elektre mame aktualne " + elektro.pocetNotebookov() + " notebookov");
        }
    }
}