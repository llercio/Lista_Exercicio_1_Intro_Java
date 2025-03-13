/*
Questão 6: Faça um algoritmo que leia o tempo de duração de um evento em uma 
fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int segundosEscolhidos, horas, minutos, segundos;

        java.util.Scanner Ler = new Scanner(System.in);

        System.out.println("Digite a duração do evento em segundos.");
        segundosEscolhidos = Ler.nextInt();

        horas = segundosEscolhidos / 3600;
        segundos = segundosEscolhidos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Tempo de duração do evento: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

        Ler.close();

    }
}
