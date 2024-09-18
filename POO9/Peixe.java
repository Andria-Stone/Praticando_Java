package POO9;

public class Peixe extends Animal {

    private String corEscama;

    public void locomover(){
        System.out.println("Nadando");
    }

    public void alimentar(){
        System.out.println("Comendo substâncias");
    }

    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }

    public void soltarBolhar(){
        System.out.println("Soltar bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}

