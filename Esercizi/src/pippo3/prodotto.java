package pippo3;

public abstract class prodotto {
    private String tipo;
    private String nome;
    private double prezzo;

    public prodotto(String tipo, String nome, double prezzoo) {

        this.tipo= tipo;
        this.nome=nome;
        this.prezzo=prezzoo;


    }
    abstract int scontoProdotto();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    /*public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }*/
}
