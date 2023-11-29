import entities.Rettangolo;
import entities.Informazioni;
import entities.Sim;
public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 7);

        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();

        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();

        stampaDueRettangoli(r1, r2);
    }



    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();
        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();

        int sommaAree = r1.calcolaArea() + r2.calcolaArea();
        int sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    public class Main2 {
        public static void main(String[] args) {
            Sim miaSIM = new Sim("1234567890");

            Informazioni chiamata1 = new Informazioni(5, "1234567891");
            miaSIM.effettuaChiamata(chiamata1);

            Informazioni chiamata2 = new Informazioni(3, "1234567892");
            miaSIM.effettuaChiamata(chiamata2);

            Informazioni chiamata3 = new Informazioni(1, "1234567893");
            miaSIM.effettuaChiamata(chiamata3);

            Informazioni chiamata4 = new Informazioni(1, "1234567893");
            miaSIM.effettuaChiamata(chiamata4);

            miaSIM.aggiornaCredito(5.0);

            miaSIM.stampaDati();
        }
    }


}
