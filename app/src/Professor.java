package src;
import java.util.*;

public class Professor extends Usuario{
    private static int cont;
    private String formacao;
    private String projetoExtensao;
    private String sala;
    private Date horarioAtendimento;

    public Professor(String formacao,String projetoExtensao,String sala,Date horarioAtendimento,int matricula, String apelido, String senha, String nome, String email, String id, int acesso) {
        super(matricula, apelido, senha, nome, email, id, acesso);
        this.formacao=formacao;
        this.projetoExtensao=projetoExtensao;
        this.sala=sala;
        this.horarioAtendimento=horarioAtendimento;
        cont++;
    }


    public int calcAtendimentoRestante(){
        // a fazer
        return 5;
    }

    
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getProjetoExtensao() {
        return projetoExtensao;
    }
    public void setProjetoExtensao(String projetoExtensao) {
        this.projetoExtensao = projetoExtensao;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public Date getHorarioAtendimento() {
        return horarioAtendimento;
    }
    public void setHorarioAtendimento(Date horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }
}
