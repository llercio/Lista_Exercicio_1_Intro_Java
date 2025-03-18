/*
Um sistema de equações lineares do tipo: ax + by = c, dx + ey = f
Pode ser resolvido segundo as equações: x= c*e-b*f/a*e-b*d
Escreva um algoritmo que lê os coeficientes  a,b,c,d,e e f e calcula e mostra os valores de x e y.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a, b, c, d, e, f, x, y;

        Scanner coeficientes = new Scanner(System.in);

        System.out.println("Insira o coeficiente a.");
        a = coeficientes.nextDouble();

        System.out.println("Insira o coeficiente b.");
        b = coeficientes.nextDouble();

        System.out.println("Insira o coeficiente c.");
        c = coeficientes.nextDouble();

        System.out.println("Insira o coeficiente d.");
        d = coeficientes.nextDouble();

        System.out.println("Insira o coeficiente e.");
        e = coeficientes.nextDouble();
        
        System.out.println("Insira o coeficiente f.");
        f = coeficientes.nextDouble();
        
        x = ((c*e)-(b*f))/((a*e)-(b*d));
        y = ((a*f)-(c*d))/((a*e)-(b*d));
        
        System.out.println("O valor x é " + x + ". O valor de y é " + y);
        System.out.println("Deseja reiniciar o programa? Sim [Y] / Não [N]");

        coeficientes.close();
    }
}
