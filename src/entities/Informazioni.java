package entities;

public class Informazioni {
    private int durataInMinuti;
    private String numeroChiamato;

    public Informazioni(int durataInMinuti, String numeroChiamato) {
        this.durataInMinuti = durataInMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurataInMinuti() {
        return durataInMinuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }


    public String toString() {
        return "Durata: " + durataInMinuti + " minuti, Numero chiamato: " + numeroChiamato;
    }
}
