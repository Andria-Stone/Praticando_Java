package Atividades;
import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {

        //Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

         Scanner sc = new Scanner(System.in);

         System.out.println("Quantos minutos? ");
         int minutos = sc.nextInt();

         if (minutos <= 100){
            System.out.print("Valor a pagar: R$ 50,00");
         }
         else{
            double valor = 50 + (minutos - 100)* 2;
            System.out.printf("O valor a pagar: R$ %.2f", valor);
         }

         sc.close();
    }
}
