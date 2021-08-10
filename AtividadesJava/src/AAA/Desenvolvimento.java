package AAA;


import java.util.ArrayList;
import java.util.Scanner;



public class Desenvolvimento extends DadosdasOngs {



	public Desenvolvimento(ArrayList<String> nome,  ArrayList<String> areaDaAtuacao,
			ArrayList<String> contato, ArrayList<String> descricao) {
		super(nome,  areaDaAtuacao, contato, descricao);
		// TODO Auto-generated constructor stub
	}
	public Desenvolvimento() {
		// TODO Auto-generated constructor stub
	}
	String nome;
	
	 String email;
	int num1;
	int num2;
	int num3 = 0;
	int num4=0;
	int num5=0;
	int num6=0;
	Scanner ler = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	public void ApresentacaoInicial() {
		
		System.out.println(".•*¨`*•. ☆ .•*¨`*•.\r\n"
				+ "Olá, nós somos a ONGdevs e esperamos que você esteja ótimo(a)!!!!\r\n"
				+ "✿•*¨`*•. (¯`v´¯) (¯`v´¯) .•*¨`*•✿\r\n"
				+ ". . . ✿•*¨`*•.¸(¯`v´¯)¸.•´*¨`*•✿ . . .\r\n");
		System.out.println("Iremos fazer algumas perguntas para que possamos te conhecer melhor :)");
		delay(2000);
		System.out.println();
		
		System.out.println("Por favor digite os seguintes dados para continuar" + "\nDigite o seu nome completo: ");
		nome=ler.nextLine();
		
		System.out.println("Por favor digite o seu email");
		email = ler.nextLine();
		
		
	
		Pessoa pessoa = new Pessoa(nome, email);
	}
	
	
	
	
	
	
	
	
	public void Apresentar() {
		
		System.out.println();
		
		
		System.out.println("Seja muito bem vindo(a) " +nome + "\nIremos falar um pouco sobre o nosso projeto:" +"\nVocê já ouviu falar sobre a ONGdesvs?"
				+"\nÉ um projeto que chegou para fazer a diferença na vida das pessoas, com fundamento de apresentar as ONGS.\nO intuito é trazer visibilidade para incriveis "
				+ "projetos e consequentemente causar um grande impacto social com a tecnologia, ajudando um ao outro");
		delay(2000);
			
		    System.out.println("\nVocê sabe o que é uma ONG ? 1-SIM | 2-NÃO ");
			num1=ler.nextInt();
			
			while(num1 < 1 || num1 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num1 = ler.nextInt();
				
			}
			if (num1==1 || num1==2) {
				System.out.println("As ONGs são consideradas entidades privadas, mas sem fins lucrativos, "
						+ "uma vez que sua finalidade é exclusivamente de auxiliar a sociedade."
						+ "Atuando por meio de voluntários que se colocam à disposição para ajudar o próximo, as ONGs são verdadeiras entidades que promovem o bem ");
			}
			
			
			System.out.println("\nVocê já ajudou alguma? 1-SIM | 2-NÃO  ");
			num2=ler.nextInt();
    	
			while(num2 < 1 || num2 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num2 = ler.nextInt();
				
			}
			
			if (num2==1) {
				System.out.println("Gostaria de ajudar mais alguma ? 1-SIM | 2-NÃO ");
				num3=ler.nextInt();
			}
			
			if (num2==2) {
				System.out.println("Gostaria de ajudar alguma ? 1-SIM | 2-NÃO ");
				num3=ler.nextInt();
			}
			
			
			if (num6==1) {
				System.out.println("Tem preferência por algum setor de apoio? "); 
				Setores();
			}
			
			while(num3 < 1 || num3 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num3 = ler.nextInt();
				
			}
			
           if (num3==2) {
				
				System.out.println("Muito obrigado! Esperamos que retorne em breve caso mude de idéia :D ");
				
			}
           
			
			if (num3==1) {
				
				System.out.println("Deseja se tornar um apoiador de uma ONG? 1-SIM | 2-NÃO ");
				num5=ler.nextInt();
			}
			
			 while(num5 < 1 || num5 >= 3) {
					System.out.println("Digite o número correspondente a pergunta.");
					System.out.println("1 - SIM| 2 - NÃO:");
					num5 = ler.nextInt();
					
				}
			
			if (num5==2) {
				System.out.println("Muito obrigado! Esperamos que retorne em breve caso mude de idéia :D ");
			}
			
			if (num5==1) {
				System.out.println("Tem preferência por algum setor de apoio? " ); 
		        Setores();	
			
			}
			
	}
	
	
	public void Setores() {
		System.out.println(" Digite as opções:");
		System.out.println("1 - Saúde  ");
		System.out.println("2 - Trabalho ");
		System.out.println("3 - Educação ");
		System.out.println("4 - Cidadania ");
		System.out.println("5 - Animais");
		
		
		num1 = ler.nextInt();
		
		
		switch (num1){
		case 1:
			System.out.println( getNomeSaude().get(0));
			System.out.println( );
			System.out.println( getDescricaoSaude().get(0));
			break;
			
		case 2:
			System.out.println( getNomeTrabalho().get(0));
			System.out.println( );
			System.out.println( getDescricaoTrabalho().get(0));
			break;
			
		case 3:
			System.out.println( getNomeEducacao().get(0));
			System.out.println( );
			System.out.println( getDescricaoEducacao().get(0));
			break;
			
		case 4:
			for(int i = 0; i < 4;i++) {
				System.out.println("\n Ong NÂº "+i );
			System.out.println("Nome: "+ getNomeCidadao().get(i));
			System.out.println( );
			System.out.println( getDescricaoCidadao().get(i));}
			System.out.println("\n\n\n" );
			System.out.println("Qual das Ongs deseja ajudar?\nDigite o numero da ong: ");
			num1 = ler.nextInt();
			OngEscolhida(4, num1);
			
			break;
		
		case 5:
			System.out.println( getNomeAnimais().get(0));
			System.out.println( );
			System.out.println( getDescricaoAnimais().get(0));
			break;
		}	
		Agradecimento();
	}
	public static void delay(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public void OngEscolhida(int setor, int opcoes) {
		
		if(setor == 4) {
			if(opcoes == 0)System.out.println( getContatoCidadao().get(0));
			if(opcoes == 1)System.out.println( getContatoCidadao().get(1));
			if(opcoes == 2)System.out.println( getContatoCidadao().get(2));
			if(opcoes == 3)System.out.println( getContatoCidadao().get(3));
			}
			
			
			
		
		}
	
	public void Agradecimento() {
		System.out.println(".•*¨`*•.•*¨`*•Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!Enviaremos as informações por e-mail: " +email + ".•*¨`*•");
	}
		
	}
	
	
	
	
	
