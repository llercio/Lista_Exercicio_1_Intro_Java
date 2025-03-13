/*
Questão 1: Construa um algoritmo que, tendo como dados de entrada dois pontos 
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula 
que efetua tal cálculo é: 
d = √(𝑥2−𝑥1)²+(𝑦2−𝑦1)²
*/
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        double x1, x2, y1, y2, d;
        java.util.Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        x1=Ler.nextDouble();

        System.out.println("Digite o valor de x2: ");
        x2=Ler.nextDouble();

        System.out.println("Digite o valor de y1: ");
        y1=Ler.nextDouble();

        System.out.println("Digite o valor de y2: ");
        y2=Ler.nextDouble();

        d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.println("A distância entre os pontos é: " + d);

        Ler.close();
    }
}
