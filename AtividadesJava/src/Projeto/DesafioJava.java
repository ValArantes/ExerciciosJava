package Projeto;

import java.util.Scanner;

public class DesafioJava {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome, estado;
		int num1, num2, num3 = 0, num4=0, num5=0, num6=0, num7;
		
		System.out.println(".•*¨`*•. ☆ .•*¨`*•.\r\n"
				+ "Olá, nós somos a ONGdevs e esperamos que você esteja ótimo(a)!!!!\r\n"
				+ "✿•*¨`*•. (¯`v´¯) (¯`v´¯) .•*¨`*•✿\r\n"
				+ ". . . ✿•*¨`*•.¸(¯`v´¯)¸.•´*¨`*•✿ . . .\r\n");
		System.out.println("Iremos fazer algumas perguntas para que possamos te conhecer melhor :)");
		
		System.out.println();
		
		System.out.println("Por favor digite os seguintes dados para continuar" + "\nDigite o seu nome completo: ");
		nome=ler.next();
		
		System.out.println("Digite o seu estado: ");
		estado=ler.next();
		
		System.out.println();
		
		System.out.println("Seja muito bem vindo(a) " +nome + "\nIremos falar um pouco sobre o nosso projeto:" +"\nVocê já ouviu falar sobre a ONGdesvs?"
		+"\nÉ um projeto que chegou para fazer a diferença na vida das pessoas, com fundamento de apresentar as ONGS.\nO intuito é trazer visibilidade para incriveis "
		+ "projetos e consequentemente causar um grande impacto social com a tecnologia, ajudando um ao outro");
	
			
			System.out.println("Você sabe o que é uma ONG ? 1-SIM || 2-NÃO ");
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
			
			
			System.out.println("\nVocê já ajudou alguma? 1-SIM || 2-NÃO  ");
			num2=ler.nextInt();
    	
			while(num2 < 1 || num2 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num2 = ler.nextInt();
				
			}
			
			if (num2==1) {
				System.out.println("Gostaria de ajudar mais alguma ? 1-SIM || 2-NÃO ");
				num3=ler.nextInt();
			}
			
			if (num2==2) {
				System.out.println("Gostaria de ajudar alguma ? 1-SIM || 2-NÃO ");
				num3=ler.nextInt();
			}
			
			
			if (num6==1) {
				System.out.println("Tem preferência por algum setor de apoio? "); //vetores 
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
				
				System.out.println("Deseja se tornar um apoiador de uma ONG? 1-SIM || 2-NÃO ");
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
				System.out.println("Tem preferência por algum setor de apoio? " + "\n1-Saúde \n2-Trabalho \n3-Educação \n4-Cidadania \n5-Animais" ); //vetores ONG
		        num4=ler.nextInt();	
			
			}
			
			if (num4==1) {
				
				System.out.println("\nTucca - A TUCCA (Associação para Crianças e Adolescentes com Câncer) foi fundada em 1998 por médicos,pais de pacientes e representantes da sociedade civil, com a proposta de elevar as taxas de cura e melhorar a qualidade de vida de crianças e adolescentes carentes com câncer"
						+ "\nhttps://www.tucca.org.br/ ( (11) 2522-5712)");
				System.out.println("Para ajuda-lá basta acessar o site e realizar uma doação ");
				System.out.println("Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•\r\n"
						+ "*♡♥ ❇ ★ ♡♥ Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!  ☆ *•.¸ ♥❄\r\n"
						+ "♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥ ♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥¸");
				}
			
            if (num4==2) {
				
				System.out.println("Cruzando histórias - Uma organização civil que escuta, acolhe e desenvolve mulheres que estão sem trabalho e renda");
				System.out.println("Para ajuda-lá basta entrar em contato no telefone (11) 97033-6229 ");
				System.out.println("Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•\r\n"
						+ "*♡♥ ❇ ★ ♡♥ Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!  ☆ *•.¸ ♥❄\r\n"
						+ "♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥ ♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥¸");
				}
            
             if (num4==3) {
				
				System.out.println("Generation Brasil - Nossa missão é transformar sistemas de educação para o emprego de maneira a preparar, colocar e apoiar pessoas em carreiras transformadoras que, de outra forma, seriam inacessíveis" + "/nhttps://brazil.generation.org/ ( 0800 707 1027");
				System.out.println("Para ajuda-lá basta acessar o site e se tornar um contribuidor ");
				System.out.println("Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•\r\n"
						+ "*♡♥ ❇ ★ ♡♥ Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!  ☆ *•.¸ ♥❄\r\n"
						+ "♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥ ♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥¸");
				}
		
             if (num4==4) {
 				
 				System.out.println("ONG Moradia e Cidadania - teve origem no Comitê da Ação da Cidadania criado em 1993 pelos empregados da Caixa Econômica Federal. É responsável por iniciativas como: educação, geração de trabalho e renda e apoio às ações de combate à fome e à miséria para comunidades de baixa renda"+ "https://moradiaecidadaniamg.org.br/sobre-nos/");
 				System.out.println("Para ajuda-lá basta acessar o site e realizar uma doação ");
 				System.out.println("Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•\r\n"
 						+ "*♡♥ ❇ ★ ♡♥ Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!  ☆ *•.¸ ♥❄\r\n"
 						+ "♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥ ♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥¸");
 				}      
             
             if (num4==5) {
  				
  				System.out.println("AMPARA Animal - A AMPARA Animal (Associação de Mulheres Protetoras dos Animais Rejeitados e Abandonados) é uma OSCIP sem fins lucrativos que ajuda abrigos e protetores independentes com ração, medicamentos e atendimento veterinário."+ "\nhttps://amparanimal.org.br/");
  				System.out.println("Para ajuda-lá basta acessar o site e realizar uma doação ");
  				System.out.println("Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´ ♡♥ ❇ ★ ♡♥ ☆ `*•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•\r\n"
  						+ "*♡♥ ❇ ★ ♡♥ Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!  ☆ *•.¸ ♥❄\r\n"
  						+ "♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥ ♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥❄♥ ¸.•*´♡♥ ❇ ★ ♡♥ ☆ *•.¸ ♥❄♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥❄♥¸");
  				}       
             
             
			
			
		ler.close();
			
}
}