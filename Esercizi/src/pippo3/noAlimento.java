package pippo3;

public class noAlimento extends prodotto {


    public noAlimento(String tipo,String nome, double prezzo) {
        super.tipo= tipo;
        super.prezzo=prezzo;

        super.nome=nome;
        super.setPercentualeSconto(0);
    }



;



    @Override
    void sconto() {
        this.setSconto(false);
    }
}
