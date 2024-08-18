package Atividades;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {

        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números: ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.printf("A soma dos números é = %d", soma);

        sc.close();
    }
}
