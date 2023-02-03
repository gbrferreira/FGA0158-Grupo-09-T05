package src;
public class Usuario {

    private int matricula;
    private String senha;
    private String nome;
    private String email;

    public void pedirReserva(){

    }

    public void calcularHistorico(){
        //system.out.println("Histórico do usuário: \n");
        //system.out.println(contReserva + "reservas já foram solicitadas pelo usuário. \n");
        //system.out.println(contReservaAceita + "reservas solicitadas pelo usuário foram aceitas. \n");
        //system.out.println("contReservaNegada" + "reservas solicitadas pelo usuário foram negadas. \n");
    }
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
