package CalcolatriceBasic;

public class main {

	public static void main(String[] args) {

		Operazione somma = new somma();
		int ris = somma.calcola(20, 57);
		System.out.println("la somma � " + ris);

		Operazione sottrazione = new sottrazione();
		int ris1 = sottrazione.calcola(20, 57);
		System.out.println("la sottrazione � " + ris1);

		Operazione moltiplicazione = new moltiplicazione();
		int ris2 = moltiplicazione.calcola(20, 57);
		System.out.println("la moltiplicazione � " + ris2);

		Operazione divisione = new divisione();
		int ris3 = divisione.calcola(20, 10);
		System.out.println("la divisione � " + ris3);

		// TODO Auto-generated method stub

	}

}
