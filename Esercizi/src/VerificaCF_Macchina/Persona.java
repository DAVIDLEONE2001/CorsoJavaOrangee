package VerificaCF_Macchina;

public class Persona {

	private String nome;
	private String cogmome;
	private String cf;
	private String nomecognome;

	@Override
	public String toString() {
		return "Persona{" +
				"nome='" + nome + '\'' +
				", cogmome='" + cogmome + '\'' +
				", cf='" + cf + '\'' +
				'}';
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCogmome() {
		return cogmome;
	}

	public void setCogmome(String cogmome) {
		this.cogmome = cogmome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public boolean verificaCf() {

		if (this.cf == null) {
			System.out.println("inserire codice fiscale\n");
			return false;
		}

		if ((this.cf.length() == 16) && (this.cf.substring(0, 6).matches("[a-zA-Z]+"))) {

			System.out.println("il codice fiscale di " + this.nome + " è corretto\n");
			return true;

		} if ((this.cf.length() < 16) && (this.cf.substring(0, 6).matches("[a-zA-Z]+"))) {
			System.out.println("il codice fiscale di " + this.nome + " non è di lunghezza corretta è troppo corto\n");
			return false;}
		
		else if ((this.cf.length() > 15) && (this.cf.substring(0, 6).matches("[a-zA-Z]+"))) {
			System.out.println("il codice fiscale di " + this.nome + " non è di lunghezza corretta è troppo lungo\n");
			return false;}
		
	 else {
		System.out.println("il codice fiscale di " + this.nome + " non è corretto i primi sei caratteri non sono tutte lettere\n");
		return false;
		
		
	}


	}

	public String nomeCognome() {

		this.nomecognome = this.nome + " " + this.cogmome;
		return this.nomecognome;

	}


}
