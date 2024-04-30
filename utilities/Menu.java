package utilities;

import java.util.Scanner;

public class Menu {

	private Scanner scanner;
	private int op;

	public Menu(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}
	
	public void showMenu() {
		
		System.out.println();
		System.out.println("Escolha a opção desejada:");
		System.out.println();
		System.out.println("[0] - Ser um covarde e desistir\n"
						 + "[1] - Ir para cidade\n"
						 + "[2] - \n"
						 + "[3] - \n"
						 + "[4] - \n"
						 + "[5] - \n"
						 + "[6] - \n"
						 + "[7] - ");
		op = scanner.nextInt();
		
		while (op < 0 || op > 7) {
			System.out.println();
			System.out.println("Opção inválida. Digite novamente.");
			showMenu();
		}
	}
	
	public void showMenuCidade() {
		System.out.println();
		System.out.println("Bem vindo a Jeba Town. O que você deseja fazer: ");
		System.out.println();
		System.out.println("[0] - Sair da cidade.\n"
						 + "[1] - Ir no postinho de saúde.\n"
						 + "[2] - ir na loja de arma dos bolsonaristas\n"
						 + "[3] - Falar com o grande vidente");
		op = scanner.nextInt();
		
		while (op < 0 || op > 3) {
			System.out.println();
			System.out.println("Opção inválida. Digite novamente.");
			showMenuCidade();
		}
	}
	
}
