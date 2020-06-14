//Feito por Vinicius Moura Arag�o.
package trabav2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal extends Exception {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws InputMismatchException, IndexOutOfBoundsException, ExceptionCustom {
		String garcomAtual;
		Local local = new Local();
		@SuppressWarnings("resource")
		Scanner prompt = new Scanner(System.in);
		Usuario cliente = new Usuario();
		Gar�om garcom = new Gar�om();
		Gerente gerente = new Gerente();
		int comidaSelecionado = 0;
		double id = 0;
		boolean cont = true;
		
		System.out.println("Vamos nos se cadastrar! Preciso saber algumas informa��es suas primeiro para prosseguir-mos. \nPor favor, diga seu sexo: ");
		cliente.setSexo(prompt.nextLine());
		System.out.println("Certo.. sexo " + cliente.getSexo() + ". Agora diga seu nome, pode ser s� o primeiro nome mesmo.");
		cliente.setNome(prompt.nextLine());
		System.out.println("Prazer, " + cliente.getNome() + ", agora s� mais uma coisa, sua idade.\nN�o se preocupe com isso, sou s� um programa, n�o vou te julgar...");
		do {
			try {
				cliente.setIdade(prompt.nextInt());
				cont = false;
			} catch (InputMismatchException e) {
				System.err.println("Sua idade deveria ser um n�mero");
				prompt.nextLine();
			}
		} while (cont);
		cont = true;
		System.out.println("Tudo pronto " + cliente.getNome() + "! Agora vamos comer em algum restaurante, eu n�o tenho muitas op��es... \nmas eu acredito que voc� deve gostar de algum desses...");
		System.out.println("Tenho 3 op��es: Hard Rock Cafe(1), Coco Bambu(2) ou Outback(3), qual voc� gostaria de ir?");
		do {
			try {
				local.respostas(prompt.nextInt());
				cont = false;
			}
			catch (InputMismatchException e) {
				System.err.println("Use numeros >:[");
				prompt.nextLine();
			} 
			catch (ExceptionCustom e) {
				System.err.println("Use numeros de 1 a 3");
				prompt.nextLine();
			}		
		} while (cont);
		cont = true;
		System.out.println("Humm..." + local.lugar + "... �tima escolha!");
		System.out.println("O gerente do restaurante � " + gerente.Identificacao(gerente.id));
		System.out.println("Chame um numero qualquer...(Serve para chamar um gar�om)");
		do {
			try {
				System.out.println("Voc� chamou " + garcom.Identificacao(id = prompt.nextDouble()));
				cont = false;
			} catch (InputMismatchException e) {
				System.err.println("Haha.. boa, mas voc� precisa usar NUMEROS! de novo...");
				prompt.nextLine();
			}
		} while (cont);
		cont = true;
		garcomAtual = garcom.Identificacao(id);
		System.out.println(garcomAtual + " diz: Ol� eu sou " + garcomAtual + " e hoje realizarei seus pedidos! \nAqui no " + local.lugar + " trabalhamos com " + local.especialidade + " e nossos sabores s�o: ");
		System.out.println(local.mostraSabores());
		System.out.println(garcomAtual + " diz: Qual destes pratos voc� gostaria de provar?");
		do {
			try {
				System.out.println(garcomAtual + " diz: huum..." + local.sabores[comidaSelecionado = local.prompt.nextInt() - 1] + "... � uma boa escolha, � um dos que mais saem aqui na casa!");
				cont = false;
			} catch (IndexOutOfBoundsException e) {
				System.err.println("Epa, n�o temos essa op��o... tente de novo.");
				prompt.nextLine();
			} catch (InputMismatchException e) {
				System.err.println("Numeros, por favor...");
				prompt.nextLine();
			}
		} while (cont);
		cont = true;
		System.out.println(garcomAtual + " est� indo pegar sua comida...");
		System.out.println("Voc� espera felizmente pela sua comida, olha ao seu redor e observa a decora��o do " + local.lugar + ", algo bem chique..");
		System.out.println("Logo mais " + garcomAtual + " vem trazendo sua comida..." );
		System.out.println("Desculpe por deix�-lo esperando, aqui est� seu pedido, Bom apetite. Disse " + garcomAtual);
		System.out.println("o " + local.sabores[comidaSelecionado] + " parece uma delicia");
		System.out.println("Voc� comeu o " + local.especialidade + ", o sabor � muito delicioso, voc� nunca comeu uma comida t�o gostosa como essa...");
		System.out.println(garcomAtual + " diz: e ent�o..." + cliente.getNome() + ", gostou da comida? Qual nota voc� avaliaria?");
		local.nota = prompt.nextDouble();
		if(local.nota < 5) {
			System.out.println(garcomAtual + " diz: Puxa vida, me desculpe por isso :(, ser� que podemos melhorar em algo?");
			prompt.nextLine();
			System.out.println(garcomAtual + " diz: Tudo bem, na proxima vez eu farei o possivel para sua experi�ncia seja a melhor possivel! Volte sempre que quiser.");
		}
		else if(local.nota == 5) {
			System.out.println(garcomAtual + " diz: Hum... talvez algo n�o tenha sa�do como planejado... voc� poderia me dizer em como podemos melhorar?");
			prompt.nextLine();
			System.out.println(garcomAtual + " diz: Obrigado pelo feedback, na proxima vez faremos o melhor para conseguir o 10! Volte sempre que quiser.");
		}
		else if (local.nota > 5 && local.nota < 10) {
			System.out.println(garcomAtual + " diz: Muito obrigado pela boa avalia��o! Tem alguma coisa que eu poderia ser feita para melhorar esta nota?");
			prompt.nextLine();
			System.out.println(garcomAtual + " diz: Obrigado pelo feedback! Volte sempre que quiser.");
		}
		else if(local.nota >= 10) {
			System.out.println("Oh! *-* muito obrigado!!! Fico muito feliz por isso! Por favor volte sempre que o senhor quiser!");
		}
		else {
			System.out.println("Negativo? s�rio? ;-;");
		}
		
		System.out.println("Bem " + cliente.getNome() + " espero que tenha gostado da experi�ncia de comer neste restaurante, se quiser entrar em outro restaurante � s�\n reiniciar este  programa e selecionar outra op��o.");
		System.out.println("Obrigado por testar meu programa, se tiver gostado, acesse meu Github: https://github.com/bsqqq");
	}

}
