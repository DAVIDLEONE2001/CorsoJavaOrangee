package pippo3;

public class onLine extends acquista {

    @Override
    public String servizioAttivo() {
        String onLine="onLine";
        return onLine;
    }

    @Override
    public void compra(prodotto prodotto, int qnt) {
        super.setQuantitaSpesa(qnt);

        double spesa=prodotto.prezzo*qnt;
        System.out.println("il prezzo di "+prodotto.tipo+" tipo "+prodotto.nome+ " di quantita "+qnt+" e "+spesa +" e costa "+prodotto.prezzo+" al pezzo");

    }

}
