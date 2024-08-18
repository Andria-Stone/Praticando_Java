package Atividades;
import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {

        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("""
         Código     Especificação

            1 ---- Cachorro quente
            2 ---- X-Salada
            3 ---- X-Bacon
            4 ---- Torrada Simples
            5 ---- Refrigerante 
            
                """);

        System.out.print("Informe o código do seu pedido: ");
        int codigo =sc.nextInt();

        System.out.print("Quantidade? ");
        int quant = sc.nextInt();

        double total;

        if(codigo == 1){
            total = quant * 4;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if (codigo == 2){
            total = quant * 4.50;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if( codigo == 3){
            total = quant * 5;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if(codigo == 4){
            total = quant * 2;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if(codigo == 5){
            total = quant * 1.50;
            System.out.printf("Total = R$ %.2f", total);
        }
        else{
            System.out.print("Valor inválido");
        }
        

        sc.close();
    }
}
