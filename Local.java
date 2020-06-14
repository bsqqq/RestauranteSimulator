package trabav2;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
import java.util.Scanner;
public class Local extends Restaurante{
	Scanner prompt = new Scanner(System.in);

	public String lugar;
	private String imprime;
	public String especialidade;
	public String[] sabores = new String[6];
	
	public int respostas(int resposta) throws InputMismatchException, ExceptionCustom, IndexOutOfBoundsException {
		if(resposta == 1) {
			lugar = "Hard Rock Cafe";
			especialidade = "Hamburgeres"; 
			sabores[0] = "1. Tradicional"; 
			sabores[1] = "2. Bacon";
			sabores[2] = "3. Vegetariano";
			sabores[3] = "4. A moda da casa"; 
			sabores[4] = "5. Bluecheese Burger";
			sabores[5] = "6. Crispy Burger";
		}
		else if(resposta == 2) {
			lugar = "Coco Bambu";
			especialidade = "Frutos do mar"; 
			sabores[0] = "1. Peixe frito"; 
			sabores[1] = "2. Camar�o internacional";
			sabores[2] = "3. Fil� de peixe com crosta de p�o"; 
			sabores[3] = "4. Bacalhau de Tra�ra";
			sabores[4] = "5. Sushi";
			sabores[5] = "6. Iscas de Peixe";
		}
		else if(resposta == 3) {
			lugar = "Outback";
			especialidade = "Churrascos"; 
			sabores[0] = "1. Fil� de carne com arroz e fritas"; 
			sabores[1] = "2. Medalh�o ao molho madeira apimentado e batata r�stica"; 
			sabores[2] = "3. Picanha recheiada no molho ingl�s"; 
			sabores[3] = "4. Coroa de cebola empanada com molho da casa";
			sabores[4] = "5. Maminha a moda da casa";
			sabores[5] = "6. Tutano cozido";
		}
		
		else {
			throw new ExceptionCustom();
		}
		return resposta;
	}
	
	public String mostraSabores() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(sabores[i]);
		}
		return imprime;
	}
	
	
}

