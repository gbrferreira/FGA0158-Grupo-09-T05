package src;

public class Sala {
    //atributos da classe
    private int capacidade;
    private String nome;
    private int frequenciaReserva;

    //construtor
    public Sala(int capacidade, String nome){ //construtor para criar objetos mais fácil na main
       this.nome=nome;
       this.capacidade=capacidade;
    }

    //getters and setters
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFrequenciaReserva() {
        return frequenciaReserva;
    }
    public void setFrequenciaReserva(int frequenciaReserva) {
        this.frequenciaReserva = frequenciaReserva;
    }

    //métodos
    public int calcularFrequencia(){
        //a fazer
        return 5;
    }




}
