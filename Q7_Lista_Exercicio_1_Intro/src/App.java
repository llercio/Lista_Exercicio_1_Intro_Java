/*
Questão 7: O custo ao consumidor de um carro novo é a soma do custo de fábrica 
com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um algoritmo que leia o custo de fábrica de um carro e escreva o custo ao 
consumidor. 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double custoFabrica, custoConsumidor;
        double porcentagemDistribuidor = 0.28;
        double porcentagemImpostos = 0.45;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o custo de fábrica do veículo?");
        custoFabrica = entrada.nextDouble();

        custoConsumidor = custoFabrica+(custoFabrica*porcentagemDistribuidor)+(custoFabrica*porcentagemImpostos);

        System.out.println("O custo ao consumidor é " + custoConsumidor);

        entrada.close();
    }
}
