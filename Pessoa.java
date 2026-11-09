package aula_0511;

public class Pessoa {
	private String nome;
	private Coracao coracao;

	public Pessoa(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Coracao(coracao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Coracao getCoracao() {
		return coracao;
	}

	public void setCoracao(Coracao coracao) {
		this.coracao = coracao;
	}

}
