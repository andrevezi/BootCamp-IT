package meli.exercicio.produtos;

public class Pereciveis extends Produto {

    private int diasParaVencer;

    public Pereciveis(int diasParaVencer, String nome, double preco) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int qtdeDeProdutos) {
        double result = qtdeDeProdutos * this.getPreco();
        if (diasParaVencer == 1) {
            result = (qtdeDeProdutos * getPreco()) * 0.25;
        } else if (diasParaVencer == 2) {
            result = (qtdeDeProdutos * getPreco()) * 0.33;
        } else if (diasParaVencer == 3) {
            result = (qtdeDeProdutos * getPreco()) * 0.50;
        }
        return result;

    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
