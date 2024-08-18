package Atividades;
import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("O número é POSITIVO");
        }
        else{
            System.out.println("O número é NEGATIVO");

        }

        sc.close();
    }
}
