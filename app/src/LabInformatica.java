package src;

public class LabInformatica extends laboratorio{
    
    private int qtdComputadores;

    public LabInformatica(int capacidade, String nome) {
        super(capacidade, nome);
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }
    public void setQtdComputadores(int qtdComputadores) {
        this.qtdComputadores = qtdComputadores;
    }
}
