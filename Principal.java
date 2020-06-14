//Feito por Vinicius Moura Aragão.
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
		Garçom garcom = new Garçom();
		Gerente gerente = new Gerente();
		int comidaSelecionado = 0;
		double id = 0;
		boolean cont = true;
		
		System.out.println("Vamos nos se cadastrar! Preciso saber algumas informações suas primeiro para prosseguir-mos. \nPor favor, diga seu sexo: ");
		cliente.setSexo(prompt.nextLine());
		System.out.println("Certo.. sexo " + cliente.getSexo() + ". Agora diga seu nome, pode ser só o primeiro nome mesmo.");
		cliente.setNome(prompt.nextLine());
		System.out.println("Prazer, " + cliente.getNome() + ", agora só mais uma coisa, sua idade.\nNão se preocupe com isso, sou só um programa, não vou te julgar...");
		do {
			try {
				cliente.setIdade(prompt.nextInt());
				cont = false;
			} catch (InputMismatchException e) {
				System.err.println("Sua idade deveria ser um número");
				prompt.nextLine();
			}
		} while (cont);
		cont = true;
		System.out.println("Tudo pronto " + cliente.getNome() + "! Agora vamos comer em algum restaurante, eu não tenho muitas opções... \nmas eu acredito que você deve gostar de algum desses...");
		System.out.println("Tenho 3 opções: Hard Rock Cafe(1), Coco Bambu(2) ou Outback(3), qual você gostaria de ir?");
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
		System.out.println("Humm..." + local.lugar + "... Ótima escolha!");
		System.out.println("O gerente do restaurante é " + gerente.Identificacao(gerente.id));
		System.out.println("Chame um numero qualquer...(Serve para chamar um garçom)");
		do {
			try {
				System.out.println("Você chamou " + garcom.Identificacao(id = prompt.nextDouble()));
				cont = false;
			} catch (InputMismatchException e) {
				System.err.println("Haha.. boa, mas você precisa usar NUMEROS! de novo...");
				prompt.nextLine();
			}
		} while (cont);
		cont = true;
		garcomAtual = garcom.Identificacao(id);
		System.out.println(garcomAtual + " diz: Olá eu sou " + garcomAtual + " e hoje realizarei seus pedidos! \nAqui no " + local.lugar + " trabalhamos com " + local.especialidade + " e nossos sabores são: ");
		System.out.println(local.mostraSabores());
		System.out.println(garcomAtual + " diz: Qual destes pratos você gostaria de provar?");
		do {
			try {
				System.out.println(garcomAtual + " diz: huum..." + local.sabores[comidaSelecionado = local.prompt.nextInt() - 1] + "... É uma boa escolha, é um dos que mais saem aqui na casa!");
				cont = false;
			} catch (IndexOutOfBoundsException e) {
				System.err.println("Epa, não temos essa opção... tente de novo.");
				prompt.nextLine();
			} catch (InputMismatchException e) {
				System.err.println("Numeros, por favor...");
				prompt.nextLine();
			}
		} while (cont);
		cont = true;
		System.out.println(garcomAtual + " está indo pegar sua comida...");
		System.out.println("Você espera felizmente pela sua comida, olha ao seu redor e observa a decoração do " + local.lugar + ", algo bem chique..");
		System.out.println("Logo mais " + garcomAtual + " vem trazendo sua comida..." );
		System.out.println("Desculpe por deixá-lo esperando, aqui está seu pedido, Bom apetite. Disse " + garcomAtual);
		System.out.println("o " + local.sabores[comidaSelecionado] + " parece uma delicia");
		System.out.println("Você comeu o " + local.especialidade + ", o sabor é muito delicioso, você nunca comeu uma comida tão gostosa como essa...");
		System.out.println(garcomAtual + " diz: e então..." + cliente.getNome() + ", gostou da comida? Qual nota você avaliaria?");
		local.nota = prompt.nextDouble();
		if(local.nota < 5) {
			System.out.println(garcomAtual + " diz: Puxa vida, me desculpe por isso :(, será que podemos melhorar em algo?");
			prompt.nextLine();
			System.out.println(garcomAtual + " diz: Tudo bem, na proxima vez eu farei o possivel para sua experiência seja a melhor possivel! Volte sempre que quiser.");
		}
		else if(local.nota == 5) {
			System.out.println(garcomAtual + " diz: Hum... talvez algo não tenha saído como planejado... você poderia me dizer em como podemos melhorar?");
			prompt.nextLine();
			System.out.println(garcomAtual + " diz: Obrigado pelo feedback, na proxima vez faremos o melhor para conseguir o 10! Volte sempre que quiser.");
		}
		else if (local.nota > 5 && local.nota < 10) {
			System.out.println(garcomAtual + " diz: Muito obrigado pela boa avaliação! Tem alguma coisa que eu poderia ser feita para melhorar esta nota?");
			prompt.nextLine();
			System.out.println(garcomAtual + " diz: Obrigado pelo feedback! Volte sempre que quiser.");
		}
		else if(local.nota >= 10) {
			System.out.println("Oh! *-* muito obrigado!!! Fico muito feliz por isso! Por favor volte sempre que o senhor quiser!");
		}
		else {
			System.out.println("Negativo? sério? ;-;");
		}
		
		System.out.println("Bem " + cliente.getNome() + " espero que tenha gostado da experiência de comer neste restaurante, se quiser entrar em outro restaurante é só\n reiniciar este  programa e selecionar outra opção.");
		System.out.println("Obrigado por testar meu programa, se tiver gostado, acesse meu Github: https://github.com/bsqqq");
	}

}
