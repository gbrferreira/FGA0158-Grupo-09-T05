package user;
import java.util.*;

public class Reserva {

    private String descricao;
    private int numero;
    private String horario;
    private int qtdPessoas;
    private static int cont;

    /* construtor da classe Reserva, a ordem dos atributos é a que deve ser pedida para o input do usuário */
    public Reserva (String d, int n, String h, int q ){
        this.descricao= d;
        this.numero= n;
        this.horario= h;
        this.qtdPessoas= q;
        cont ++;
        /*  O construtor possui uma variável estática contadora pra armazenar o número de objetos Reserva instanciados, que será usada como iterador para qlq operação com 
        a ArrayList das reservas */
    }
    public String calcHoraFreq(){
        return "BOBAO";
        //a fazer, necessario arraylist das reservas
    }
    
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String d) {
        this.descricao = d;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int n) {
        this.numero = n;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String h) {
        this.horario = h;
    }

    public void setQtdPessoas(int q){
        this.qtdPessoas = q;
    }
    public int getQtdPessoas (int qtdPessoas){
        return qtdPessoas;
    }
}