package src;

public class LabInformatica extends laboratorio{
    
    private int qtdComputadores;

    public LabInformatica(int capacidade, String nome, int qtdComputadores,String tipo) {
        super(capacidade, nome,tipo);
        this.qtdComputadores=qtdComputadores;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }
    public void setQtdComputadores(int qtdComputadores) {
        this.qtdComputadores = qtdComputadores;
    }
}
