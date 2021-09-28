package pippo2;

public class main {
    public static void main(String[] args) {

        prodotto segale= new alimento("pane","segale",3);
        prodotto regina= new noAlimento("scottex","regina",0.3);
        acquista primo=new consegna();
        segale.calcolaPrezzo();
        regina.calcolaPrezzo();
        prodotto.stampaTot();

        acquista mario =new onLine();
        mario.compra(segale,5);mario.StampaT();
        mario.calcolaPrezzo();




    }
}
