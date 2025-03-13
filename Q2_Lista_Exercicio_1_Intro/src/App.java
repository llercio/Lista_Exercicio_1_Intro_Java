import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int A, B, C, R, S, D;
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A=Ler.nextInt();
        while(A<0) {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
            System.out.println("Digite novamente o valor de A.");
            A=Ler.nextInt();
        }

        System.out.println("Digite o valor de B: ");
        B=Ler.nextInt();
        while(B<0) {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
            System.out.println("Digite novamente o valor de B.");
            B=Ler.nextInt();
        }

        System.out.println("Digite o valor de C: ");
        C=Ler.nextInt();
        while(C<0) {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
            System.out.println("Digite novamente o valor de C.");
            C=Ler.nextInt();
        }

        R=(A+B)*(A+B);
        S=(int) Math.pow((B+C), 2);

        D=(R+S)/2;
        System.out.println("O valor encontrado = " + D);
        Ler.close();
    }
}
