package POO7;

public class Programa {
public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();

    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Cláudio");
    p4.setNome("Fabiana");

    System.out.println(p1.toString());
}
}
