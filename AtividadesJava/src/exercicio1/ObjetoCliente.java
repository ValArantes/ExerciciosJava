package exercicio1;

import java.util.Scanner;

public class ObjetoCliente {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente people = new Cliente("Raimundo", "\nCPF: 400289220-55", "\nRua Cl�lia, 115");
		
		System.out.println(people.mostraTela());
		
		leia.close();
	}

}
