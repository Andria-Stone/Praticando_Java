package POO8;

public class Bolsista extends Aluno {

    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.nome);
    }

    @Override
    public void pagarMensal(){
        System.out.println(this.nome +" É bolsista! Pagamento facilitado");
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
