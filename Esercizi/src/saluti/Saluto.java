package saluti;

public abstract class Saluto{
  private  String nome;


  public Saluto(String nome) {
   this.nome=nome;
      System.out.println(Forma()+ nome);
    }

    abstract public String Forma();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
