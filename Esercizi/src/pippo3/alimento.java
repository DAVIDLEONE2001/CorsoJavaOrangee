package pippo2;

public class alimento extends prodotto{
    public alimento(String tipo,String nome, float prezzo) {
        super.tipo= tipo;
        super.prezzo=prezzo;

        super.nome=nome;
        super.setPercentualeSconto(5);

    }





    @Override
    void sconto() {
        this.setSconto(false);
    }


}
