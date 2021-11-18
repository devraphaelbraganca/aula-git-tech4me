package programa;

import direcao.Carro;

public class Program {
    public static void main(String[] args){
        Carro c = new Carro();
        c.acelerar(10);
        int velocidadeAtingidade = c.getVelocidade();
        System.out.println("Velocidade atingida:: "+velocidadeAtingidade);
    }
} 