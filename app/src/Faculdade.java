package src;

public class Faculdade {
    
    private String nome;
    private String endereco;
    private static int cont;

    //construtor
    public Faculdade(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
        cont++;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
