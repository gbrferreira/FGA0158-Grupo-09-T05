package src;

public class LabEletronica extends laboratorio {
    
    private int qtdKits;

    public LabEletronica(int capacidade, String nome,int qtdKits,String tipo) {
        super(capacidade, nome,tipo);
        this.qtdKits=qtdKits;

    }

    public int getQtdKits() {
        return qtdKits;
    }
    public void setQtdKits(int qtdKits) {
        this.qtdKits = qtdKits;
    }
}
