package POO3;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        //this.status = true;
        this.setStatus(true);

        if(tipo == "cc"){
            //this.saldo = 50;
            this.setSaldo(50);
        }
        else if(tipo == "cp"){
            //this.saldo = 150;
            this.setSaldo(150);
        }
        else{
            System.out.println("Opção Inválida!");
        }

        }

    public void fecharConta(){
        if(this.getSaldo() > 0 ){
            System.out.println("Conta com dinheiro, Não pode ser fechada");
        }
        else if(this.getSaldo() < 0){
            System.out.println("A conta pois está em débito");
        }
        else{
            this.setStatus(false);
        }
        
    }

    public void depositar(float valor){
       if(this.getStatus()){
        //this.saldo = this.saldo + valor;
        this.setSaldo(this.getSaldo() + valor);
       }
       else{
        System.out.println("Impossível depositar em uma conta fechada");
       }
    }

    public void sacar(float valor){
        if(this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            }
            else{
                System.out.println("Saldo insufuciente");
            }
        }
        else{
            System.out.println("Impossível sacar em uma conta fechada");
        }
    }

    public void pagarMensal(){
        float valor = 0;

        if( this.getTipo() == "cc"){
            valor = 12;
        }
        else if(this.getTipo() == "cp"){
            valor = 20;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo()- valor );
        } else{
            System.out.println("Inpossível pagar uma conta fechada");
        }
    }


}
