package Atividades;
import java.util.Scanner;

public class Programa9 {
    public static void main(String[] args) {

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São Múltiplos!");
        }else{
            System.out.println("Não são Múltiplos!");
        }

        sc.close();
    }
}
