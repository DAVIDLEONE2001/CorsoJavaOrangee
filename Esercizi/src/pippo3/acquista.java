package pippo3;

public abstract class acquista {
    private prodotto acquisto;
    private int qunatita;
    private double spesa;
    static private int scontoServizio;
    private int maggiorazioneServizio;
    private double spesaScontata;

    public acquista(prodotto acquisto, int qunatita) {
        this.acquisto = acquisto;
        this.qunatita = qunatita;
        this.spesa = this.qunatita * acquisto.getPrezzo();

    }

    public abstract String servizio();


    public int getScontoServizio() {
        return scontoServizio;
    }

    public void setScontoServizio(int scontoServizio) {
        this.scontoServizio = scontoServizio;
    }

    public double getSpesa() {
        return this.spesa;
    }

    public int getMaggiorazioneServizio() {
        return maggiorazioneServizio;
    }

    public void setMaggiorazioneServizio(int maggiorazioneServizio) {
        this.maggiorazioneServizio = maggiorazioneServizio;
    }

    public void calcolaAcquisti() {
        spesaScontata = spesa;
        if (scontoServizio != 0)
            spesaScontata = spesa - (spesa / 100) * scontoServizio;
        else if (maggiorazioneServizio != 0)
            spesaScontata = spesaScontata + (spesa / 100) * maggiorazioneServizio;
        else if (acquisto.scontoProdotto() != 0)
            spesaScontata = spesaScontata - (spesa / 100) * acquisto.scontoProdotto();
        System.out.println(spesaScontata);
        if (scontoServizio == 0 && maggiorazioneServizio == 0 && acquisto.scontoProdotto() == 0)
            System.out.println(spesa);
    }
}
