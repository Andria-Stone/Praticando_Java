package POO9;

public class Programa {
    public static void main(String[] args) {
        

        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Canguru c = new Canguru();

        m.setPeso(35.6);
        m.alimentar();
        m.locomover();

        p.alimentar();
        p.locomover();

        c.alimentar();
        c.locomover();
        
    }
}
