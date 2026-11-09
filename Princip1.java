package aula_0511;

public class Princip1 {

	public static void main(String[] args) {
		
		Departamento departamento = new Departamento("Marketing");
		
		Empresa empresa = new Empresa("Microsoft", departamento);
		
		System.out.println("Empresa: " + empresa.getNome() + "\nDepartamento: " + departamento.getNome());
	}

}
