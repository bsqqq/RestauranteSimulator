package trabav2;
import java.util.InputMismatchException;

public class Garçom extends Funcionario {
	double idSalvo = id;
	public String Identificacao(double index) throws InputMismatchException {
		id = index % 10;
		 nome[0] = "Sebastião Maia";
		 nome[1] = "Henrique Fogaça";
		 nome[2] = "Eric Jacquin";
		 nome[3] = "Gordon Ramsay";
		 nome[4] = "Paolla Carosella";
		 nome[5] = "você mesmo (um clone de uma realidade paralela)";
		 nome[6] = "o desenvolvedor deste programa";
		 nome[7] = "Getúlio Vargas";
		 nome[8] = "uma entidade superior";
		 nome[9] = "Salt Bae";
		 nome[10] = "Souma Yukihira";
		return nome[(int) id];
	}
	
}
