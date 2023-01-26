package src;

public class Coordenador extends Usuario {
    private static int cont;
    public Coordenador(int matricula, String apelido, String senha, String nome, String email, String id, int acesso) {
        super(matricula, apelido, senha, nome, email, id, acesso);
        cont++;
    }

    public void aceitarReserva(){
        // a fazer
    }

    public void criarTurma(){
        // a fazer
    }

    public void editarTurma(){
        // a fazer
    }
}
