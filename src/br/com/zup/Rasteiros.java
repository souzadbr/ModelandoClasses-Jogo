package br.com.zup;

public class Rasteiros extends Inimigos {
    private double danoEspinho;

    public Rasteiros(String nome, double vida, double danoEspinho) {
        super(nome, vida);
        this.danoEspinho = danoEspinho;
    }

    public double getDanoEspinho() {
        return danoEspinho;
    }

    public void setDanoEspinho(double danoEspinho) {
        this.danoEspinho = danoEspinho;
    }

    //metodo aplicar dano
    public double aplicarDano(double dano){

    }
}
