    public class Produto {
        private String nome;
        private double preco;
        Data dataValidade;

        public Produto(String nome, double preco, Data dataValidade) {
            this.nome = nome;
            this.preco = preco;
            this.dataValidade = dataValidade;
        }
        public Data getDataValidade() {
            return dataValidade;
        }

        public void setDataValidade(Data dataValidade) {
            this.dataValidade = dataValidade;
        }
        public boolean estaVencido(Data data) {
            if (dataValidade == null || data == null) {
                return false;
            }
            if (dataValidade.getAno() < data.getAno()) {
                return true;
            } else if (dataValidade.getAno() == data.getAno()) {
                if (dataValidade.getMes() < data.getMes()) {
                    return true;
                } else if (dataValidade.getMes() == data.getMes()) {
                    if (dataValidade.getDia() < data.getDia()) {
                        return true;
                    }
                }
            }
            return false;
        }
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
        @Override
        public String toString() {
            return "Produto:\n" +
                    "  Nome: " + nome + "\n" +
                    "  Preço: " + preco + "\n" +
                    "  Data de Validade: " + (dataValidade != null ? dataValidade.toString() : "N/A");
        }

        
        

    }
