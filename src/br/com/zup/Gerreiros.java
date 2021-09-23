package br.com.zup;

public class Gerreiros extends Heroi {
    private double poderAtaque;

    public Gerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    //Metodo dano

    public double aplicarDano(double dano){

    }
}
