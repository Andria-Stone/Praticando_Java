package Atividades;
import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é PAR");
        }
        else{
            System.out.println("O número é ÍMPAR");
        }

        sc.close();
    }
}
