package Atividades;
import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args) {

        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar?");
        int num = sc.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            if(x >=10 & x <=20){
                in++;
            }
            else{
                out++;
                
            }
        }

        System.out.printf("%d estão dentro do intervalo [10,20]%n",in);

        System.out.printf("%d estão fora do intervalo [10,20]",out);

        sc.close();
    }
}
