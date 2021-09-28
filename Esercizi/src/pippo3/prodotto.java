package pippo2;

public abstract class prodotto {
    protected static String tipo;
    protected String nome;
    protected static double prezzo;
    private int quantita;
    private static boolean sconto;
    private static double spesaTot;
    private static int percentualeSconto;




    public prodotto(String tipo, String nome, double prezzo) {

        this.tipo= tipo;
        this.prezzo=prezzo;
        this.nome=nome;

    }



    protected prodotto() {
    }

    abstract void sconto();


    public void calcolaPrezzo() {
double prezzoUnitario=this.prezzo*quantita;if (percentualeSconto!=0){
if(sconto=true) prezzoUnitario= prezzoUnitario-(prezzoUnitario/100)*5;}
if(tipo=="pane"||tipo=="Pane") prezzoUnitario= prezzoUnitario-(prezzoUnitario/100)*50;
      //  System.out.println("il prezzo di "+this.tipo+" tipo "+this.nome+ " di quantita "+this.quantita+" e "+prezzoUnitario +" e costa "+this.prezzo+" al pezzo");
spesaTot=spesaTot+prezzoUnitario;

    }




    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public static double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    public static boolean isSconto() {
        return sconto;
    }


    public void setSconto(boolean sconto) {
        this.sconto = sconto;
    }

  public static void stampaTot(){
      System.out.println("la spesa toale e "+spesaTot);

  }

    public static double getSpesaTot() {
        return spesaTot;
    }

    public static int getPercentualeSconto() {
        return percentualeSconto;
    }

    public void setPercentualeSconto(int percentualeSconto) {
        this.percentualeSconto = percentualeSconto;
    }

    public static void setSpesaTot(double spesaTot) {
        prodotto.spesaTot = spesaTot;
    }
}
