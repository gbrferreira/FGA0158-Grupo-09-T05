package src;

public class Turma {
    
    private String disciplina;
    private int numero;
    private int vagas;
    private static int cont;

    //construtor
    public Turma(String disciplina,int numero,int vagas){
        this.disciplina=disciplina;
        this.numero=numero;
        this.vagas=vagas;
        cont++;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

}
