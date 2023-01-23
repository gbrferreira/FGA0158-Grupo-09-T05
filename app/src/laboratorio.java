package src;

public class laboratorio extends Sala {
    
    private String tipo;

    public laboratorio(int capacidade, String nome) {
        super(capacidade, nome);
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
