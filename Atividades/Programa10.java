package Atividades;
import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {

        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial:");
        int hInicial= sc.nextInt();

        System.out.print("Hora final: ");
        int hFinal = sc.nextInt();
    
        int duracao;

		if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
		}
		else {
			duracao = 24 - hInicial + hFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
