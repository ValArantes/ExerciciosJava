package Estoque;

	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

	public class Exercicio3 {
	
	
	public static void main(String[] args) 
		{
			Collection <String> estoque = new ArrayList<String>();
			estoque.add("T�nis");
			estoque.add("Camisa");
			estoque.add("Cal�a");
			estoque.add("Bermuda");
			estoque.add("Blusa");
			System.out.println("ESTOQUE: "+estoque);
			estoque.remove("T�nis");
			System.out.println("ESTOQUE: "+estoque);
			Collection<String> estoque2 = Arrays.asList("Chuteira","Mei�o");
			estoque.addAll(estoque2);
			System.out.println("ESTOQUE: "+estoque);

		}
	}

