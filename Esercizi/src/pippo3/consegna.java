package pippo2;

public class consegna extends acquista {


    @Override
    public String servizioAttivo() {
        String consegna="consegna";
        return consegna;
    }

    @Override
    public void compra(prodotto prodotto, int qnt) {
        double spesa=prodotto.prezzo*qnt;
        System.out.println("il prezzo di "+prodotto.tipo+" tipo "+prodotto.nome+ " di quantita "+qnt+" e "+spesa +" e costa "+prodotto.prezzo+" al pezzo");

    }
}
