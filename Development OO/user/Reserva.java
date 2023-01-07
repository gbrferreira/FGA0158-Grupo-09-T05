package user;
import java.util.*;

public class Reserva {

    private String descricao;
    private int numero;
    private Date horario;
    private Date horarioMaisFreq;

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
    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public Date getHorarioMaisFreq() {
        return horarioMaisFreq;
    }
    public void setHorarioMaisFreq(Date horarioMaisFreq) {
        this.horarioMaisFreq = horarioMaisFreq;
    }
}