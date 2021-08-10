package AAA;

import java.util.ArrayList;
import java.util.List;

public class DadosdasOngs extends Ong{




	public DadosdasOngs(ArrayList<String> nome, ArrayList<String> areaDaAtuacao,
			ArrayList<String> contato, ArrayList<String> descricao) {
		super(nome, areaDaAtuacao, contato, descricao);
		// TODO Auto-generated constructor stub
	}

	public DadosdasOngs() {}


	
	
	public List<String> getNomeSaude() {
		nome.add("Tucca");
		nome.add("Saúde Criança");
		return nome;
	}
	
	public List<String> getContatoSaude() {
		contato.add("(11) 2522-5712\r\n" + 
				"https://www.tucca.org.br/");
		contato.add("Telefone: (21) 2512-1123\r\n" + 
				"");
		return contato;
	}
	
	public List<String> getDescricaoSaude() {
		areaDaAtuacao.add("A TUCCA (Associação para Crianças e Adolescentes com Câncer)"
				+ " foi fundada em 1998 por médicos, pais de pacientes e representantes da sociedade civil, "
				+ "com a proposta de elevar as taxas de cura e melhorar a qualidade de vida de crianças");
		
		areaDaAtuacao.add("Fundada em 1991, pela Dra. Vera Cordeiro, médica e clínica geral, "
				+ "com especialização em Psicossomática, a Associação Saúde Criança (ASC) tem a missão de "
				+ "promover a transformação de famílias em situação de vulnerabilidade social.\r\n" + 
				"O trabalho da instituição, localizada no Rio de Janeiro, é feito de forma multidisciplinar"
				+ " e integrada. Favorecendo o desenvolvimento humano, a instituição oferece programas que atuam "
				+ "nas 05 áreas: saúde, moradia, cidadania, renda e educação.\r\n" + 
				"");
		return areaDaAtuacao;
	}
	
	
	public List<String> getNomeTrabalho() {
		nome.add("Cruzando histórias");
		return nome;
	}
	
	public List<String> getContatoTrabalho() {
		contato.add("(11) 97033-6229");
		return contato;
	}
	
	public List<String> getDescricaoTrabalho() {
		areaDaAtuacao.add("Uma organização civil que escuta, acolhe e desenvolve mulheres que estão sem trabalho e renda.");
		return areaDaAtuacao;
	}
	
	public List<String> getNomeEducacao() {
		nome.add("Cruzando histórias");
		return nome;
	}
	
	public List<String> getContatoEducacao() {
		contato.add("0800 707 1027\r\n" + 
				"https://brazil.generation.org/");
		return contato;
	}
	
	public List<String> getDescricaoEducacao() {
		areaDaAtuacao.add("Nossa missão é transformar sistemas de educação para o "
				+ "emprego de maneira a preparar, colocar e apoiar pessoas em carreiras "
				+ "transformadoras que, de outra forma, seriam inacessíveis.");
		return areaDaAtuacao;
	}
	
	public List<String> getNomeCidadao() {
		nome.add("Moradia e Cidadania");
		nome.add("Amigos do Bem");
		nome.add("Tem Gente com Fome");
		nome.add("Amparaí");
		nome.add("Banco de Alimentos");
		return nome;
	}
	
	public List<String> getContatoCidadao() {
		contato = new ArrayList<String>();
		contato.add("https://moradiaecidadaniamg.org.br/sobre-nos");
		contato.add("\r\n" + 
				"https://www.amigosdobem.org/\r\n" + 
				"");
		contato.add("https://www.temgentecomfome.com.br/");
		contato.add("https://misturai.com/amparai/");
		contato.add("\r\n" + 
				"https://www.bancodealimentos.org.br/\r\n" + 
				"");
		return contato;
	}
	
	public List<String> getDescricaoCidadao() {
		areaDaAtuacao.add("ONG Moradia e Cidadania - teve origem no Comitê"
				+ " da Ação da Cidadania criado em 1993 pelos empregados da Caixa Econômica Federal. É "
				+ "responsável por iniciativas como: educação, geração de trabalho e renda e apoio às ações de"
				+ " combate à fome e à miséria para comunidades de baixa renda");
		areaDaAtuacao.add("ONG criada há 27 anos se tornou um dos maiores grupos de voluntários ativos no país,"
				+ " ajudando mais de 75 mil pessoas nos estados de Alagoas, "
				+ "Ceará e Pernambuco e servindo mais de 180 mil refeições todos os meses.");
		areaDaAtuacao.add("A Coalizão Negra Por Direitos, em parceria com a Anistia Internacional, Oxfam Brasil, Redes da Maré,"
				+ " Ação Brasileira de Combate às Desigualdades, e outros, lançaram uma campanha para arrecadar "
				+ "fundos e para ações emergenciais no enfrentamento à fome, à miséria e à violência na pandemia de Covid-19.");
		areaDaAtuacao.add("Criado em 20 de março de 2020, o Amparaí tem como objetivo distribuir diariamente "
				+ "refeições para pessoas em situação de vulnerabilidade social em Porto Alegre");
		areaDaAtuacao.add("ONG ajuda a combater o desperdício e alimenta milhares de pessoas em situação de insegurança alimentar."
				+ " Você pode ajudar de forma pontual ou recorrente");
		return areaDaAtuacao;
	}
	
	public List<String> getNomeAnimais() {
		 nome.add("AMPARA Animal");
		 return nome;
	}
	
	public List<String> getContatoAnimais() {
		contato.add("https://amparanimal.org.br/");
		return contato;
	}
	
	public List<String> getDescricaoAnimais() {
		areaDaAtuacao.add("A AMPARA Animal (Associação de Mulheres Protetoras dos Animais Rejeitados e Abandonados) "
				+ "é uma OSCIP sem fins lucrativos que ajuda abrigos e protetores independentes com ração, medicamentos "
				+ "e atendimento veterinário.");
		return areaDaAtuacao;
	}
	
}
