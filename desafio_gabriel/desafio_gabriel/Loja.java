
public class Loja {
  private Produto[] estoqueProdutos;

  public boolean insereProduto(Produto produto) {
    if (estoqueProdutos == null || produto == null) {
      return false;
    }
    for (int i = 0; i < estoqueProdutos.length; i++) {
      if (estoqueProdutos[i] == null) {
        estoqueProdutos[i] = produto;
        return true;
      }
    }
    return false; // Não há espaço livre
  }

  public void imprimeProdutos() {
    if (estoqueProdutos == null || estoqueProdutos.length == 0) {
      System.out.println("Nenhum produto cadastrado.");
      return;
    }
    boolean temProduto = false;
    for (Produto p : estoqueProdutos) {
      if (p != null) {
        System.out.println(p);
        temProduto = true;
      }
    }
    if (!temProduto) {
      System.out.println("Nenhum produto cadastrado.");
    }
  }

  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;


  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  // Construtor sem salario 
  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[capacidadeEstoque];
  }

  // Construtor com salario
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao, int capacidadeEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[capacidadeEstoque];
  }
  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Data getDataFundacao() {
    return dataFundacao;
  }

  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalarioBaseFuncionario() {
    return this.salarioBaseFuncionario;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public double gastosComSalario() {
    if (salarioBaseFuncionario == -1) {
      return -1;
    }
    return quantidadeFuncionarios * salarioBaseFuncionario;
  }

  public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }
  
  // Retorna o array de estoque (usado pelo validador)
  public Produto[] getEstoqueProdutos() {
    return this.estoqueProdutos;
  }

  // Remove produto pelo nome (retorna true se removido)
  public boolean removeProduto(String nomeProduto) {
    if (estoqueProdutos == null || nomeProduto == null) {
      return false;
    }
    for (int i = 0; i < estoqueProdutos.length; i++) {
      if (estoqueProdutos[i] != null && nomeProduto.equals(estoqueProdutos[i].getNome())) {
        estoqueProdutos[i] = null;
        return true;
      }
    }
    return false;
  }

  public char tamanhoDaLoja() {
    if (quantidadeFuncionarios < 10) {
      return 'P';
    } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
      return 'M';
    } else if (quantidadeFuncionarios > 31) {
      return 'G';
    } else {
      // Caso não se encaixe em nenhuma condição (teoricamente impossível)
      return '?';
    }
  }
  
  @Override
  public String toString() {
    String estoqueStr = "";
    if (estoqueProdutos != null && estoqueProdutos.length > 0) {
      int count = 0;
      for (Produto p : estoqueProdutos) {
        if (p != null) {
          estoqueStr += "\n    " + p.toString();
          count++;
        }
      }
      if (count == 0) {
        estoqueStr = "Nenhum produto cadastrado";
      }
    } else {
      estoqueStr = "Nenhum produto cadastrado";
    }
    return "Loja:\n" +
        "  Nome: " + nome + "\n" +
        "  Funcionários: " + quantidadeFuncionarios + "\n" +
        "  Salário base: " + salarioBaseFuncionario + "\n" +
        "  Endereço: " + (endereco != null ? endereco.toString() : "N/A") + "\n" +
        "  Data de Fundação: " + (dataFundacao != null ? dataFundacao.toString() : "N/A") + "\n" +
        "  Estoque de Produtos: " + estoqueStr;
  }


}
