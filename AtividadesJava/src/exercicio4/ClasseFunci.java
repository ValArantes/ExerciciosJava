package exercicio4;

import java.util.Scanner;

public class ClasseFunci {

	private String nome;
	private String modelo;
	private int salario;
	
	public void nome( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O nome do funcion�rio �: ");
		nome = leia.next();
		
	}
	
	public void salario()
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o salario do funcion�rio: ");
		salario = leia.nextInt();
	}
	
	public void mostrarTela ()
	{
	System.out.println("\n" + nome + " "+ "recebe " + salario +" reais por m�s.");
	}
	
}

