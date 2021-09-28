package pippo2;

public abstract class acquista {
private int quantitaSpesa;
   abstract public String servizioAttivo();
   abstract public void compra(prodotto prodotto, int qnt);

    public double acquista(){
        double spesaTot=prodotto.getSpesaTot();
        if (this.servizioAttivo()=="consegna") if (spesaTot < 50) {
            spesaTot = spesaTot + (spesaTot / 100) * 3;
        } else if (spesaTot > 99) spesaTot = spesaTot - (spesaTot / 100) * 3;

if (this.servizioAttivo()=="onLine"){
    spesaTot=spesaTot-(spesaTot/100)*3;}


        return spesaTot;
    }


    public void calcolaPrezzo() {
        double prezzoUnitario=prodotto.getPrezzo()*this.quantitaSpesa;if (prodotto.getPercentualeSconto()!=0){
            if(prodotto.isSconto() == true) prezzoUnitario= prezzoUnitario-(prezzoUnitario/100)*5;}
        if(prodotto.tipo=="pane"||prodotto.tipo=="Pane") prezzoUnitario= prezzoUnitario-(prezzoUnitario/100)*50;
        //  System.out.println("il prezzo di "+this.tipo+" tipo "+this.nome+ " di quantita "+this.quantita+" e "+prezzoUnitario +" e costa "+this.prezzo+" al pezzo");
        prodotto.setSpesaTot(prodotto.getSpesaTot() +prezzoUnitario);

    } String servizio=this.servizioAttivo();
    public void StampaT(){

        System.out.println("il totale dei servizi scontati ("+ this.servizioAttivo()+ ") e "+prodotto.getSpesaTot());
    }
    public int getQuantitaSpesa() {
        return quantitaSpesa;
    }

    public void setQuantitaSpesa(int quantitaSpesa) {
        this.quantitaSpesa = quantitaSpesa;
    }
}



