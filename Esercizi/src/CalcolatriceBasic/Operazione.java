package CalcolatriceBasic;

public abstract class Operazione {

	 int operando1;
	 int operando2;
	

	public int calcola(int op1, int op2) {

		this.operando1 = op1;
		this.operando2 = op2;
		int risultato = this.esegui();
		return risultato;
	}

	abstract public int esegui();

}
