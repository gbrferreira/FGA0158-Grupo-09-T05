package src;

public class Aluno extends Usuario {
    private static int cont;
    private String projetoExtensao;
    private float ira;
    public Aluno(String projetoExtensao,float ira,int matricula,String apelido,String senha,String nome,String email,String id,int acesso){
        super(matricula,apelido,senha,nome,email,id,acesso);
        this.projetoExtensao=projetoExtensao;
        this.ira=ira;
        cont++;
    }

    public String getProjetoExtensao() {
        return projetoExtensao;
    }
    public void setProjetoExtensao(String projetoExtensao) {
        this.projetoExtensao = projetoExtensao;
    }
    public float getIra(float ira){
        return ira;
    }
    public void setIra(float ira){
        this.ira= ira;
    }
}
