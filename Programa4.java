import java.util.Locale;
import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número: ");
        int num = sc.nextInt();

        System.out.println("Horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.println("R$ por hora: ");
        double valor = sc.nextDouble();

        double salario = horas * valor;

        System.out.printf("Número = %d%nSalário = R$ %.2f", num, salario);

        
        sc.close();
        
    }
}
