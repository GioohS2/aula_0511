package aula_0511;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Universidade universidade = new Universidade("Fatec");
		
		
		Estudante estudante = new Estudante("Giovanna", universidade);
		
		
		System.out.println("Estudante:" + estudante.getNome() + "\nUniversidade: " + universidade.getNome());

	}

}
