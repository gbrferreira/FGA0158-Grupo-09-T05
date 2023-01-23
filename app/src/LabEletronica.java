package src;

public class LabEletronica extends laboratorio {
    
    private int qtdKits;

    public LabEletronica(int capacidade, String nome) {
        super(capacidade, nome);
    }

    public int getQtdKits() {
        return qtdKits;
    }
    public void setQtdKits(int qtdKits) {
        this.qtdKits = qtdKits;
    }
}
