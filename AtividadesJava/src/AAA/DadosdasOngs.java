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
		nome.add("Sa�de Crian�a");
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
		areaDaAtuacao.add("A TUCCA (Associa��o para Crian�as e Adolescentes com C�ncer)"
				+ " foi fundada em 1998 por m�dicos, pais de pacientes e representantes da sociedade civil, "
				+ "com a proposta de elevar as taxas de cura e melhorar a qualidade de vida de crian�as");
		
		areaDaAtuacao.add("Fundada em 1991, pela Dra. Vera Cordeiro, m�dica e cl�nica geral, "
				+ "com especializa��o em Psicossom�tica, a Associa��o Sa�de Crian�a (ASC) tem a miss�o de "
				+ "promover a transforma��o de fam�lias em situa��o de vulnerabilidade social.\r\n" + 
				"O trabalho da institui��o, localizada no Rio de Janeiro, � feito de forma multidisciplinar"
				+ " e integrada. Favorecendo o desenvolvimento humano, a institui��o oferece programas que atuam "
				+ "nas 05 �reas: sa�de, moradia, cidadania, renda e educa��o.\r\n" + 
				"");
		return areaDaAtuacao;
	}
	
	
	public List<String> getNomeTrabalho() {
		nome.add("Cruzando hist�rias");
		return nome;
	}
	
	public List<String> getContatoTrabalho() {
		contato.add("(11) 97033-6229");
		return contato;
	}
	
	public List<String> getDescricaoTrabalho() {
		areaDaAtuacao.add("Uma organiza��o civil que escuta, acolhe e desenvolve mulheres que est�o sem trabalho e renda.");
		return areaDaAtuacao;
	}
	
	public List<String> getNomeEducacao() {
		nome.add("Cruzando hist�rias");
		return nome;
	}
	
	public List<String> getContatoEducacao() {
		contato.add("0800 707 1027\r\n" + 
				"https://brazil.generation.org/");
		return contato;
	}
	
	public List<String> getDescricaoEducacao() {
		areaDaAtuacao.add("Nossa miss�o � transformar sistemas de educa��o para o "
				+ "emprego de maneira a preparar, colocar e apoiar pessoas em carreiras "
				+ "transformadoras que, de outra forma, seriam inacess�veis.");
		return areaDaAtuacao;
	}
	
	public List<String> getNomeCidadao() {
		nome.add("Moradia e Cidadania");
		nome.add("Amigos do Bem");
		nome.add("Tem Gente com Fome");
		nome.add("Ampara�");
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
		areaDaAtuacao.add("ONG Moradia e Cidadania - teve origem no Comit�"
				+ " da A��o da Cidadania criado em 1993 pelos empregados da Caixa Econ�mica Federal. � "
				+ "respons�vel por iniciativas como: educa��o, gera��o de trabalho e renda e apoio �s a��es de"
				+ " combate � fome e � mis�ria para comunidades de baixa renda");
		areaDaAtuacao.add("ONG criada h� 27 anos se tornou um dos maiores grupos de volunt�rios ativos no pa�s,"
				+ " ajudando mais de 75 mil pessoas nos estados de Alagoas, "
				+ "Cear� e Pernambuco e servindo mais de 180 mil refei��es todos os meses.");
		areaDaAtuacao.add("A Coaliz�o Negra Por Direitos, em parceria com a Anistia Internacional, Oxfam Brasil, Redes da Mar�,"
				+ " A��o Brasileira de Combate �s Desigualdades, e outros, lan�aram uma campanha para arrecadar "
				+ "fundos e para a��es emergenciais no enfrentamento � fome, � mis�ria e � viol�ncia na pandemia de Covid-19.");
		areaDaAtuacao.add("Criado em 20 de mar�o de 2020, o Ampara� tem como objetivo distribuir diariamente "
				+ "refei��es para pessoas em situa��o de vulnerabilidade social em Porto Alegre");
		areaDaAtuacao.add("ONG ajuda a combater o desperd�cio e alimenta milhares de pessoas em situa��o de inseguran�a alimentar."
				+ " Voc� pode ajudar de forma pontual ou recorrente");
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
		areaDaAtuacao.add("A AMPARA Animal (Associa��o de Mulheres Protetoras dos Animais Rejeitados e Abandonados) "
				+ "� uma OSCIP sem fins lucrativos que ajuda abrigos e protetores independentes com ra��o, medicamentos "
				+ "e atendimento veterin�rio.");
		return areaDaAtuacao;
	}
	
}
