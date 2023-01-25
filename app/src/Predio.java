package src;
import java.util.*;

public class Predio {
    
    private int qtdSalas;
    //private Date horario;
    private String nome;

    //construtor
    public Predio(int qtdSalas, String nome){
        this.nome=nome;
        this.qtdSalas=qtdSalas;
    }
    
    public int getQtdSalas() {
        return qtdSalas;
    }
    public void setQtdSalas(int qtdSalas) {
        this.qtdSalas = qtdSalas;
    }
    /*public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
