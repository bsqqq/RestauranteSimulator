package trabav2;

public class ExceptionCustom extends Exception {
	public String getMessage() {
		return "Opa, voc� s� tem 3 op��es de 1 a 3, n�o pode usar numeros maiores que 3 nem numeros menores que 1.";
	}
	public String getMessage2() {
		return "Por favor, use numeros somente entre 0 a 10";
	}
}
