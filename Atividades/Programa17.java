package Atividades;
import java.util.Scanner;

public class Programa17 {
    public static void main(String[] args) {
        
        // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        int fatorial = 1;

        for(int i=1;i<=num;i++){

            fatorial = fatorial * i;

        }

        System.out.printf("O fatorial desse número é: %d", fatorial);

        sc.close();
    }
}
