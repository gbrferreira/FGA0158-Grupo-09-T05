package src;

public class Disciplina {
    
    private String nome;
    private int codigo;
    private static int cont;

    //construtor
    public Disciplina(String nome,int codigo){
        this.nome=nome;
        this.codigo=codigo;
        cont++;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
