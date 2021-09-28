package pippo3;

public class onLine extends acquista{
    public onLine(prodotto acquisto, int qunatita) {
        super(acquisto, qunatita);
    }

    @Override
    public String servizio() {
        super.setScontoServizio(2);
        return "onLine";
    }
}
