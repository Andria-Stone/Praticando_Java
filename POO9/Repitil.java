package POO9;

public class Repitil extends Animal {

    private String corEscama;

    public void locomover(){
        System.out.println("Rastejando");
    }

    public void alimentar(){
        System.out.println("Comendo");
    }

    public void emitirSom(){
        System.out.println("Som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    } 

    
}
