package trabav2;
import java.lang.Math;
import java.util.InputMismatchException;

public class Gerente extends Funcionario{	
	double id = Math.round((100*(Math.random())) % 9);
	
	public String Identificacao(double index) throws InputMismatchException {
		index = id % 9;
		 nome[0] = "Jo�o Paulo";
		 nome[1] = "Jorge Lu�z";
		 nome[2] = "Lucas De Moura";
		 nome[3] = "Arthur Cavalcante";
		 nome[4] = "Vinicius Studart, O Major";
		 nome[5] = "voc� mesmo (um clone de uma realidade paralela)";
		 nome[6] = "o desenvolvedor deste programa";
		 nome[7] = "Get�lio Vargas";
		 nome[8] = "uma entidade superior";
		 nome[9] = "Daniel Chagas";
		 return nome[(int) id];
	}
}

