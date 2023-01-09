package user;
import java.util.*;

public class Reserva {

    private String descricao;
    private int numero;
    private String horario;
    private String horarioMaisFreq;

    public int calculaHorarioMaisFrequente(){
        // a fazer
        return 10;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorarioMaisFreq() {
        return horarioMaisFreq;
    }
    public void setHorarioMaisFreq(String horarioMaisFreq) {
        this.horarioMaisFreq = horarioMaisFreq;
    }
}