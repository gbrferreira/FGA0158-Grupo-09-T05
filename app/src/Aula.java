package src;
import java.util.*;

public class Aula {
    private Date horario;
    private static int cont;

    //construtor
    public Aula(Date horario){
        this.horario=horario;
        cont++;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}
