package pippo3;

public class alimento extends prodotto{
    public alimento(String tipo, String nome, double prezzo) {
        super(tipo, nome, prezzo);
    }

    @Override
    int scontoProdotto() {
        return 5;
    }
}
