public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtores que incluem a capacidade do estoque (último parâmetro)
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            double seguroEletronicos, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Construtores antigos (mantidos para compatibilidade)
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Seguro de Eletrônicos: " + seguroEletronicos;
    }
}
