package aula_0511;

public class PrinciPal {

	public static void main(String[] args) {
		
		Motor motor = new Motor("EA211");
		
		Carro carro = new Carro("Polo", motor);
		
		System.out.println("Carro: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
		
	}

}
