package trabav2;

import java.util.InputMismatchException;

public abstract class Restaurante {
	String nome;
	double nota;
	String lotacao ;
	public abstract int respostas(int resposta) throws InputMismatchException, ExceptionCustom;

}
