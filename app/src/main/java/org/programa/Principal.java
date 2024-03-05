package estoque;

import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		
		// Armazenar o input de cada entrada de variavel
		Scanner scann = new Scanner(System.in);
		Scanner scann1 = new Scanner(System.in);
		Scanner scann2 = new Scanner(System.in);
		Scanner scann3 = new Scanner(System.in);
		Scanner scann4 = new Scanner(System.in);
		
		// Cria o objeto 
		Pecas pecas = new Pecas();
		Estoque estoque = new Estoque();
		
        // Variavies para guardar o valor para classe Pecas
		int id;
		String desc;
		
		int op = 1;
		
		// Interação com usuario
		while (op!=0) {
			System.out.println("1: Inserir \n2: Remover \n3: Imprimir \n0: Sair");
			op = scann.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("ID -> ");
				id = scann1.nextInt(); // recebe o valor id
				pecas.setId(id); // armazena na classe Pecas
				
				System.out.println("Descrição -> ");
				desc = scann2.nextLine(); // recebe o valor desc
				pecas.setDesc(desc); // armazena na classe Pecas
				
				estoque.adicionar(pecas); //adicionar o valores para classe Estoque
				pecas = new Pecas();
				break;
			case 2:	
				estoque.listaPecas();
				System.out.println("Digite o ID da peça");
				op = scann3.nextInt();
				
				
				
				if (op == )
					System.out.println("REMOIDO");
				 else 
					System.out.println("NÂO EXISTENTE");
				break;
			case 3:
				estoque.listaPecas(); // Lista as pecas
				break;
			
			}
		}
	}
}
