package pippo;

public class cartaIgenica extends Vendita{
    public cartaIgenica(int quantita) {
        super(quantita);
    }

    @Override
    public boolean setAlimento(boolean alimento) {
        return false;
    }

    @Override
    public void PrezzoProdotto() {
        setPrezzo(2);
    }
}
