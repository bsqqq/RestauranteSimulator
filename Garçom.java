package trabav2;
import java.util.InputMismatchException;

public class Gar�om extends Funcionario {
	double idSalvo = id;
	public String Identificacao(double index) throws InputMismatchException {
		id = index % 9;
		 nome[0] = "Jo�o Paulo";
		 nome[1] = "Jorge Lu�z";
		 nome[2] = "Eric Jacquin";
		 nome[3] = "Arthur Cavalcante";
		 nome[4] = "Vinicius Studart, O Major";
		 nome[5] = "voc� mesmo (um clone de uma realidade paralela)";
		 nome[6] = "o desenvolvedor deste programa";
		 nome[7] = "Get�lio Vargas";
		 nome[8] = "uma entidade superior";
		 nome[9] = "Salt Bae";
		return nome[(int) id];
	}
	
}
