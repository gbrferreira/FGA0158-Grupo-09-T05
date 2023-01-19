package user;

public class Aluno extends Usuario {
    
    private String projetoExtensao;
    private float ira;

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
