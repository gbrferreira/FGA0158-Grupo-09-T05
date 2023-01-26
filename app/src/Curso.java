package src;

public class Curso {

    private String nome;
    private int qtdAlunos;
    private static int cont;

    //construtor
    public Curso(String nome,int qtdAlunos){
        this.nome=nome;
        this.qtdAlunos=qtdAlunos;
        cont++;
    }

    public int calcularQtdAlunos(){
        //a fazer
        return 5;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

}
