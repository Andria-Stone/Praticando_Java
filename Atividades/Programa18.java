package Atividades;
import java.util.Scanner;

public class Programa18 {
    public static void main(String[] args) {

        // Ler um número inteiro N e calcular todos os seus divisores.
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        for(int i=1; i <=num ;i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
