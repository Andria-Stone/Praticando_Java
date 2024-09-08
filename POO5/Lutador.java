public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos acessores

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        
        return categoria;
    }


    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }


    public int getVitorias() {
        return vitorias;
    }


    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }


    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getEmpates() {
        return empates;
    }


    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Método contrutor:

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos
    public void  apresentar(){
        System.out.println("--------------------");
        System.out.println("Lutador: "+ getNome());
        System.out.println("Origem: "+ getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println("Pesando "+ getPeso() + "kg");
        System.out.println("Ganhou: "+ getVitorias());
        System.out.println("Perdeu: "+ getDerrotas());
        System.out.println("Empatou: "+ getEmpates());
    }

    public void status(){
        System.out.println("STATUS");
        System.out.println(this.getNome());
        System.out.println("é um peso"+this.getCategoria());
        System.out.println(this.getVitorias()+ " vitórias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates()+ " empates");

    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
