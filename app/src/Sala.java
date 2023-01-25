package src;

import javax.swing.plaf.TreeUI;

public class Sala {
    
    private int capacidade;
    private String nome;
    private int frequenciaReserva;
    private int qtdPessoas;


public static void main(String[] args) {
    calcCompatibilidadeDePessos();
}

    public void calcularFrequencia(){
        
    }

    public void calcCompatibilidadeDePessos(){
        if (qtdPessoas > capacidade){
            System.out.println("A sala não tem espaço suficiente para " + qtdPessoas + "pessoas.");
        }
    }
    
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
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

}
