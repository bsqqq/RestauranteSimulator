package trabav2;

public class ExceptionCustom extends Exception {
	public String getMessage() {
		return "Opa, você só tem 3 opções de 1 a 3, não pode usar numeros maiores que 3 nem numeros menores que 1.";
	}
	public String getMessage2() {
		return "Por favor, use numeros somente entre 0 a 10";
	}
}
