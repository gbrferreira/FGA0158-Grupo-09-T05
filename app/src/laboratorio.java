package src;

public class laboratorio extends Sala {
    private String tipo;
    public laboratorio(int capacidade, String nome, String tipo) {
        super(capacidade, nome);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
