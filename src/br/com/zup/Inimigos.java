package br.com.zup;

public class Inimigos {
    private String nome;
    private double vida;

    public Inimigos(String nome, double vida) {
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
        setNome(novoNome);
    }

    public double receberDano (double dano){

    }

    public void exibirVida (){
        System.out.println("Voce tem "+ getVida()+ " vidas");
    }
}
