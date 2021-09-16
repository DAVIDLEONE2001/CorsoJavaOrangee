package VerificaCF_Macchina;



public class main {

	public static void main(String[] args) {

		Persona david = new Persona();
		Persona jimmy = new Persona();
		Persona mario = new Persona();
		Persona ciccio = new Persona();
		Persona andrea = new Persona();
		
		
		david.setNome("David");
		david.setCogmome("Leone");
		david.setCf("abcdef1234567890");
		System.out.println(david.nomeCognome());
		david.verificaCf();

		jimmy.setNome("Jimmy");
		jimmy.setCogmome("Fontana");
		jimmy.setCf("aacff13134502673");
		System.out.println(jimmy.nomeCognome());
		jimmy.verificaCf();

		ciccio.setNome("Ciccio");
		ciccio.setCogmome("Bianchi");
		ciccio.setCf("facdfff13452673");
		System.out.println(ciccio.nomeCognome());
		ciccio.verificaCf();
		
		andrea.setNome("Andrea");
		andrea.setCogmome("Ruiz");
		andrea.setCf("abcdef10234567890");
		System.out.println(andrea.nomeCognome());
		andrea.verificaCf();


		mario.setNome("Mario");
		mario.setCogmome("Bros");
		mario.setCf(null);
		System.out.println(mario.nomeCognome());
		mario.verificaCf();

	Macchina fiat = new Macchina(david);
		System.out.println(fiat.getProprietario().nomeCognome());
		Saluto Ciao = new Saluto(david);
		System.out.println(Ciao.Saluta());



	}

}
