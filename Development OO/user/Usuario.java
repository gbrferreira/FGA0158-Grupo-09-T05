package user;
public class Usuario {

    private int matricula;
    private String apelido;
    private String senha;
    private String nome;
    private String email;
    private String id;
    private int acesso;

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
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getAcesso() {
        return acesso;
    }
    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }
}
