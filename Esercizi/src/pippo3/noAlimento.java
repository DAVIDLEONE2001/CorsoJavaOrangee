package pippo3;

public class noAlimento extends prodotto{
    public noAlimento(String tipo, String nome, double prezzo) {
        super(tipo, nome, prezzo);
    }

    @Override
    int scontoProdotto() {
        return 0;
    }
}
