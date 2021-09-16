package VerificaCF_Macchina;

public class Macchina {
    private String modello;
    private long velocita;
    private long velocitaMax;
    private Persona proprietario;


    public Macchina(Persona proprietario) {
        this.velocita=400;
        this.proprietario = proprietario;

    }
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public long getVelocita() {
        return velocita;
    }

    public void setVelocita(long velocita) {
        this.velocita = velocita;
    }

    public long getVelocitaMax() {
        return velocitaMax;
    }

    public void setVelocitaMax(long velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

    public Persona getProprietario() {
        return proprietario;
    }

    public void setProprietario(Persona proprietario) {
        this.proprietario = proprietario;
    }


}
