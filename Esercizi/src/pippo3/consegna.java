

package pippo3;
import pippo3.acquista;



public class consegna extends acquista{
    public consegna(prodotto acquisto, int qunatita) {
        super(acquisto, qunatita);
    }

    @Override
    public String servizio() {
        if(super.getSpesa()<50)super.setMaggiorazioneServizio(2);
        if(super.getSpesa()>99)super.setScontoServizio(3);
        //else super.setScontoServizio(0);
        return "consegna";
    }
}
