package src;

public class LabInformatica extends laboratorio{
    
    private int qtdComputadores;
    private static int cont;

    public LabInformatica(int capacidade, String nome, int qtdComputadores,String tipo) {
        super(capacidade, nome,tipo);
        this.qtdComputadores=qtdComputadores;
        cont++;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }
    public void setQtdComputadores(int qtdComputadores) {
        this.qtdComputadores = qtdComputadores;
    }
}
