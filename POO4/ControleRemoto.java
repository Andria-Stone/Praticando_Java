package POO4;

public class ControleRemoto implements Controlador {

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Construtor
    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    //Métodos acessores
    private int getVolume() {
        return this.volume;
    }


    private void setVolume(int volume) {
        this.volume = volume;
    }


    private boolean getLigado() {
        return this.ligado;
    }


    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    private boolean getTocando() {
        return this.tocando;
    }


    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println("----------MENU----------");
        System.out.println("Esté ligado? " + this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.println(this.getVolume());
        for(int i=1; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}