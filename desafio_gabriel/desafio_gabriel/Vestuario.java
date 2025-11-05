public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    // Construtores que incluem a capacidade do estoque (último parâmetro)
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            boolean produtosImportados, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}
