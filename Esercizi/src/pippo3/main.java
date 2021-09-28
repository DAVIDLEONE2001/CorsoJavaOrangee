package pippo3;




public class main {
    public static void main(String[] args) {

        prodotto segale=new alimento("pane","segale",1);
        acquista mario =new consegna(segale,1000);
        mario.calcolaAcquisti();
        System.out.println(segale.getPrezzo());

    }}
