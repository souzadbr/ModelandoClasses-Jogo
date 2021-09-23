package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Magos mago = new Magos("Sei lá ", 200, 50);
        Rasteiros rasteiros = new Rasteiros("Rastejante", 300, 60);

        double danoDoInimigo = rasteiros.aplicarDano();
        double danoDoHeroi = mago.aplicarMagia();

        //Testando dano do Rastejante

        System.out.println("Vida do "+ rasteiros.getNome()+ " - " +rasteiros.exibirVida());
        rasteiros.receberDano(danoDoHeroi);
        rasteiros.receberDano(danoDoHeroi);
        rasteiros.receberDano(danoDoHeroi);
        rasteiros.receberDano(danoDoHeroi);
        System.out.println("Vida do "+ rasteiros.getNome()+ " - " +rasteiros.exibirVida());

        //Testando dano no Mago Sei lá
        System.out.println("Vida do "+ mago.getNome()+ " - " +mago.exibirVida());
        mago.receberDano(danoDoInimigo);
        mago.receberDano(danoDoInimigo);
        mago.receberDano(danoDoInimigo);
        mago.receberDano(danoDoInimigo);
        System.out.println("Vida do "+ mago.getNome()+ " - " +mago.exibirVida());


    }
}
