/*
Questão 3: Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias. 
*/
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        double anos, meses, dias, total;
        java.util.Scanner Ler = new Scanner(System.in);

        System.out.println("Digite a idade em anos, meses e dias.");
        anos = Ler.nextDouble();
        meses = Ler.nextDouble();
        dias = Ler.nextDouble();

        total = (anos*365) + (meses*30) + dias;

        System.out.println("A idade em dias é: " + total);

        Ler.close();
    }
}