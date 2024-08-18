package Atividades;
import java.util.Scanner;

public class Programa16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de testes:");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            double divisao = (double) a / b;

            if (b == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.1f%n", divisao);
			}

        }

        sc.close();
    }
}
