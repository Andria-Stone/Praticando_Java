package POO3;

public class Programa {
    public static void main(String[] args) {
        
        ContaBanco p1= new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Carlos");
        p1.abrirConta("cc");

        p1.depositar(100);

        //p1.sacar(50);

        p1.pagarMensal();

        p1.estadoAtual();

    }
    
}
