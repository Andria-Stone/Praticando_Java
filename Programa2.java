import java.util.Locale;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {

        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        double pi =  3.14159;

        System.out.print("Informe o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("A área do círculo é igual a: %.4f", area);


        sc.close();
    }
    
}
