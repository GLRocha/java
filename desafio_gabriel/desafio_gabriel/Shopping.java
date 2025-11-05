public class Shopping {
	private String nome;
	private Endereco endereco;
	private Loja[] lojas;

	public Shopping(String nome, Endereco endereco, int capacidadeMaximaLojas) {
		this.nome = nome;
		this.endereco = endereco;
		this.lojas = new Loja[capacidadeMaximaLojas];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Loja[] getLojas() {
		return lojas;
	}

	public void setLojas(Loja[] lojas) {
		this.lojas = lojas;
	}

	public boolean insereLoja(Loja loja) {
		if (loja == null) {
			return false;
		}
		for (int i = 0; i < lojas.length; i++) {
			if (lojas[i] == null) {
				lojas[i] = loja;
				return true;
			}
		}
		return false;
	}

	public boolean removeLoja(String nomeLoja) {
		if (nomeLoja == null) {
			return false;
		}
		for (int i = 0; i < lojas.length; i++) {
			Loja l = lojas[i];
			if (l != null && nomeLoja.equals(l.getNome())) {
				lojas[i] = null;
				return true;
			}
		}
		return false;
	}

	public int quantidadeLojasPorTipo(String tipoLoja) {
		if (tipoLoja == null) return 0;
		int total = 0;
		for (Loja l : lojas) {
			if (l != null) {
				String nomeClasse = l.getClass().getSimpleName();
				if (nomeClasse.equalsIgnoreCase(tipoLoja)) {
					total++;
				}
			}
		}
		return total;
	}

	public Informatica lojaSeguroMaisCaro() {
		Informatica maisCaro = null;
		for (Loja l : lojas) {
			if (l instanceof Informatica) {
				Informatica inf = (Informatica) l;
				if (maisCaro == null || inf.getSeguroEletronicos() > maisCaro.getSeguroEletronicos()) {
					maisCaro = inf;
				}
			}
		}
		return maisCaro;
	}

	@Override
	public String toString() {
		String resultado = "Shopping:\n";
		resultado += "  Nome: " + nome + "\n";
		resultado += "  Endereço: " + (endereco != null ? endereco.toString() : "N/A") + "\n";
		resultado += "  Capacidade de lojas: " + (lojas != null ? lojas.length : 0) + "\n";
		resultado += "  Lojas cadastradas:\n";
		if (lojas != null) {
			boolean tem = false;
			for (Loja l : lojas) {
				if (l != null) {
					resultado += " - " + l.getNome() + "\n";
					tem = true;
				}
			}
			if (!tem) {
				resultado += "Nenhuma loja cadastrada\n";
			}
		}
		return resultado;
	}
}


