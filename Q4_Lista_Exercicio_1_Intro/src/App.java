/*
Questão 4: Faça um algoritmo que leia a idade de uma pessoa expressa em dias e 
mostre-a expressa em anos, meses e dias. 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int total, anos, meses, dias, diasrestantes;
        java.util.Scanner Ler = new Scanner(System.in);

        System.out.println("Digite a idade em dias para converter em anos, meses e dias.");
        total = Ler.nextInt();

        anos = total/365;
        diasrestantes = total - (anos*365);
        meses = diasrestantes/30;
        dias = diasrestantes - (meses*30);

        System.out.println("A idade em anos, meses e dias é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        
        
        Ler.close();

    }
}
