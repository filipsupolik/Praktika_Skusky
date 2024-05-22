import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var garaz = new Garaz();
        garaz.pridajAuto(new Auto());
        garaz.pridajAuto(new Auto("AA123BC", "Mercedes", 3500, 2024, false));
        garaz.vypisAuta();
        try {
            garaz.zapisAuta();
            garaz.nacitajAuta();
            if (garaz.pocetAut() == 0) {
                System.out.println("V garazi mame aktualne ziadne auto.");
            } else if (garaz.pocetAut() == 1) {
                System.out.println("V garazi mame aktualne 1 auto.");
            } else if (garaz.pocetAut() < 5 && garaz.pocetAut() > 1) {
                System.out.println("V garazi mame aktualne " + garaz.pocetAut() + " auta");
            } else {
                System.out.println("V garazi mame aktualne " + garaz.pocetAut() + " aut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}