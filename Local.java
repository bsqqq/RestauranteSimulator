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
			sabores[1] = "2. Camarão internacional";
			sabores[2] = "3. Filé de peixe com crosta de pão"; 
			sabores[3] = "4. Bacalhau de Traíra";
			sabores[4] = "5. Sushi";
			sabores[5] = "6. Iscas de Peixe";
		}
		else if(resposta == 3) {
			lugar = "Outback";
			especialidade = "Churrascos"; 
			sabores[0] = "1. Filé de carne com arroz e fritas"; 
			sabores[1] = "2. Medalhão ao molho madeira apimentado e batata rústica"; 
			sabores[2] = "3. Picanha recheiada no molho inglês"; 
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

