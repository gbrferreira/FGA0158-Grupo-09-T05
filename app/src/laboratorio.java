package src;

public class laboratorio extends Sala {
    private String tipo;
    private static int cont;

    //construtor
    public laboratorio(int capacidade, String nome, String tipo) {
        super(capacidade, nome);
        this.tipo=tipo;
        cont++;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
