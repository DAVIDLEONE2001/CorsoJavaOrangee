package CalcolatriceBasic;

public class moltiplicazione extends Operazione{

	@Override
	public int esegui() {
		int moltiplicazione= this.operando1*this.operando2;
		return moltiplicazione;
	}

}
