package Vetores;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		Scanner tec= new Scanner(System.in);
		int pontos[]= new int[5];
		int maiorPontuacao=0;
		for(int i=0;i<5;i++) {
			System.out.printf("Digite a %d� pontua��o:",(i+1));
			pontos[i]=tec.nextInt();
			if(pontos[i]>maiorPontuacao) {
				maiorPontuacao=pontos[i];
			}
		}
		System.out.println("A maior pontua��o foi:"+maiorPontuacao);
		tec.close();
		}
	}
