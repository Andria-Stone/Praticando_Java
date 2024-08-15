import java.util.Locale;
import java.util.Scanner;

public class Programa20 {
    public static void main(String[] args) {

        //Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;

        do{

            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fah = 9.0*celsius /5.0+32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fah);

            System.out.print("Deseja repetir [s/n]? ");
            resposta = sc.next().charAt(0);

        } 
        while (resposta != 'n');

        sc.close();

        }
 }

