package entities;

public class Articolo {
    private int codiceArticolo;
    private String destinazioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(int codiceArticolo, String destinazioneArticolo, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.destinazioneArticolo = destinazioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }


    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDestinazioneArticolo() {
        return destinazioneArticolo;
    }

    public void setDestinazioneArticolo(String destinazioneArticolo) {
        this.destinazioneArticolo = destinazioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }
}

