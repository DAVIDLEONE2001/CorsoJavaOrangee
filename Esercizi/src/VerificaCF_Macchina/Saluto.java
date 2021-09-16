package VerificaCF_Macchina;

public class Saluto extends Persona{
    public Persona salutato;

    public Saluto(Persona salutato) {

        this.salutato = salutato;
    }

    public String Saluta(){
        String Ing="hi"+salutato;
        return Ing;
    }
}
