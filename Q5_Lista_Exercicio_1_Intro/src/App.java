/*
Questão 5: Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final 
deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, 
respectivamente.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float nota1, nota2, nota3, media;
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        java.util.Scanner Ler = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota e digite enter.");
        nota1 = Ler.nextFloat();

        System.out.println("Digite a sua segunda nota e digite enter.");
        nota2 = Ler.nextFloat();

        System.out.println("Digite a sua terceira nota e digite enter.");
        nota3 = Ler.nextFloat();

        media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(float)(peso1+peso2+peso3);

        System.out.printf("Sua média é: %.2f ", media);

        Ler.close();

    }
}
