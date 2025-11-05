public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    // Construtores que incluem a capacidade do estoque (último parâmetro)
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara,
            int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Data do Alvará: " + (dataAlvara != null ? dataAlvara.toString() : "N/A");
    }
}
