package exercicio2;

import java.util.Scanner;

public class ClasseAviao {

	private String cor;
	private String modelo;
	private int codigoAviao;
	
	public void cor( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("A cor do avi�o �: ");
		cor = leia.next();
		
	}
	
	public void modelo( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O Modelo �: " );
		modelo = leia.next();
	}
	
	public void codigo()
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o codigo do aviao: ");
		codigoAviao = leia.nextInt();
	}
	
	public void origem ()
	{
		System.out.println("Veio da Nova Zel�ndia");
	}
	
	public void mostrarTela ()
	{
	System.out.println("\n" + cor + " "+ "Modelo: "+  modelo +  " "+ "Codigo: " + codigoAviao);
	}
	
}
