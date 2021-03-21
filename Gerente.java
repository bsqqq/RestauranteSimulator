package trabav2;
import java.lang.Math;
import java.util.InputMismatchException;

public class Gerente extends Funcionario{	
	double id = Math.round((100*(Math.random())) % 9);
	
	public String Identificacao(double index) throws InputMismatchException {
		index = id % 9;
		 nome[0] = "Vinicius Moura Aragão";
		 nome[1] = "Guilherme Junqueira";
		 nome[2] = "Lucas De Moura";
		 nome[3] = "Felipe Deschamps";
		 nome[4] = "Rafael Sousa";
		 nome[5] = "você mesmo (um clone de uma realidade paralela)";
		 nome[6] = "Gabriel Pato";
		 nome[7] = "Julio Della Flora";
		 nome[8] = "uma entidade superior";
		 nome[9] = "Daniel Chagas";
		 return nome[(int) id];
	}
}

