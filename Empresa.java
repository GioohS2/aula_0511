package aula_0511;

public class Empresa {
	private String nome;
	private Departamento departamento;

	public Empresa(String nome, String departamento) {
		this.nome = nome;
		this.departamento = new Departamento(departamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
