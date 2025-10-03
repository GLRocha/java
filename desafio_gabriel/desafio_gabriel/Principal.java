    import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            Loja loja = null;
            Produto produto = null;
            
            while (true) {
                System.out.println("MENU:");
                System.out.println("(1) criar uma loja");
                System.out.println("(2) criar um produto");
                System.out.println("(3) sair");
                System.out.print("Escolha uma opção: ");
                int opcao;
                try {
                    opcao = Integer.parseInt(sc.nextLine());
                } 
                catch (Exception e) {
                    opcao = -1;
                }
                if (opcao == 1) {
                    // Criar Loja
                    System.out.print("Nome da loja: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade de funcionários: ");
                    int qtdFunc = Integer.parseInt(sc.nextLine());
                    System.out.print("Salário base do funcionário: ");
                    double salarioBase = Double.parseDouble(sc.nextLine());

                    System.out.println("--- Endereço ---");
                    System.out.print("Rua: ");
                    String rua = sc.nextLine();
                    System.out.print("Número: ");
                    String numero = sc.nextLine();
                    System.out.print("Complemento: ");
                    String complemento = sc.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = sc.nextLine();
                    System.out.print("Estado: ");
                    String estado = sc.nextLine();
                    System.out.print("País: ");
                    String pais = sc.nextLine();
                    System.out.print("CEP: ");
                    String cep = sc.nextLine();
                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    System.out.println("--- Data de Fundação ---");
                    System.out.print("Dia: ");
                    int diaFund = Integer.parseInt(sc.nextLine());
                    System.out.print("Mês: ");
                    int mesFund = Integer.parseInt(sc.nextLine());
                    System.out.print("Ano: ");
                    int anoFund = Integer.parseInt(sc.nextLine());
                    Data dataFundacao = new Data(diaFund, mesFund, anoFund);

                    loja = new Loja(nome, qtdFunc, salarioBase, endereco, dataFundacao);
                    System.out.println("----------------");
                    System.out.println("Informações da loja:");
                    System.out.println("Nome: " + loja.getNome() + "\nQuantidade de funcionários: " + qtdFunc
                            + "\nSalário base do funcionário: " + salarioBase + "\n" + endereco + "\nData de Fundação: "
                            + dataFundacao);
                    System.out.println("Loja criada com sucesso!");
                    System.out.println("----------------");

                } 
                else if (opcao == 2) {
                    // Criar Produto
                    System.out.print("Nome do produto: ");

                    String nomeProd = sc.nextLine();
                    System.out.print("Preço: ");

                    double preco = Double.parseDouble(sc.nextLine());
                    System.out.println("--- Data de Validade ---");
                    System.out.print("Dia: ");

                    int diaVal = Integer.parseInt(sc.nextLine());
                    System.out.print("Mês: ");

                    int mesVal = Integer.parseInt(sc.nextLine());
                    System.out.print("Ano: ");

                    int anoVal = Integer.parseInt(sc.nextLine());
                    Data dataValidade = new Data(diaVal, mesVal, anoVal);

                    produto = new Produto(nomeProd, preco, dataValidade);
                    if (produto != null) {
                        Data dataReferencia = new Data(20, 10, 2023);
                        if (produto.estaVencido(dataReferencia)) {
                            System.out.println("----------------");
                            System.out.println("Nome do produto: " + produto.getNome() + "\nPreço: " + produto.getPreco());
                            System.out.println("PRODUTO VENCIDO");
                            System.out.println("Data de validade: " + produto.getDataValidade());
                            System.out.println("Data de Referência: " + dataReferencia);
                            System.out.println("Cadastre um produto válido!\n");
                            break;
                        } 
                        else {
                            System.out.println("----------------");
                            System.out.println("PRODUTO NÃO VENCIDO");
                            System.out.println("Produto criado com sucesso!");
                            System.out.println("----------------");
                        }
                    }
                } 
                else if (opcao == 3) {
                    break;
                } 
                else {
                    System.out.println("Opção inválida");
                    System.out.println("----------------");
                }
            }
            if (loja != null) {
                System.out.println(loja);
            }
            sc.close();
        }
    }
