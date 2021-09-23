package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Heroi heroi = new Heroi("SuperMan",10);

        heroi.getNome();
        System.out.println(heroi.getNome());
        heroi.setNome("Supergirl");
        System.out.println(heroi.getNome());
        heroi.exibirVida();
        heroi.receberDano(2);
        System.out.println(heroi.getVida());

    }
}
