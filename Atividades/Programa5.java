package Atividades;
import java.util.Locale;
import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código da peça 1: ");
        int cod1 = sc.nextInt();

        System.out.print("Número de peças: ");
        int num1 = sc.nextInt();

        System.out.print("Valor unitário: ");
        double valor1 = sc.nextDouble();

        System.out.print("Código da peça: ");
        int cod2 = sc.nextInt();

        System.out.print("Número de peças: ");
        int num2 = sc.nextInt();

        System.out.print("Valor unitário: ");
        double valor2 = sc.nextDouble();

        double valorTotal = (num1 * valor1) + (num2 * valor2);

        System.out.printf("Valor a pagar: R$ %.2f", valorTotal);

        sc.close();
    }
}
