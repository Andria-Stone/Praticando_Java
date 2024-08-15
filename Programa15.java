import java.util.Locale;
import java.util.Scanner;

public class Programa15 {
    public static void main(String[] args) {

        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos testes deseja");
        int testes = sc.nextInt();

        for (int i=0; i<= testes; i++){
            
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double mediap = (a*2 + b*3 + c*5)/10;

            System.out.printf("Média  = %.1f", mediap);

        }

        





        sc.close();
    }
}
