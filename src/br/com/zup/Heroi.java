package br.com.zup;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String trocarNome(String novoNome){
      nome = novoNome;
       return nome;
    }

    public double receberDano (double dano){
       vida = vida - dano;
       return vida;
    }

    public void exibirVida (){
        System.out.println("As vidas são: "+ vida);
    }
}
