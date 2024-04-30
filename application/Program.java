package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Amazona;
import entities.Guerreiro;
import entities.Heroi;
import entities.Mago;
import utilities.Menu;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/* 
		 Guerreiro, mago e amazona.
		 todos vão ter: goldinicial, life inicial
		 cada classe vai ter: ataque, velocidade, defesa , frases especificas ao ganhar uma luta
		 */
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("A Busca pelo Artefato Perdido");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Bem vindo a Jebas Land. O maior desafio da sua vida o espera.");
		System.out.println();
		System.out.println("Crie seu Herói antes de começar a sua aventura:");
		System.out.println("Qual a classe do seu herói?");
		System.out.println();
		System.out.print("[1] - Guerreiro     [2] - Mago     [3] - Amazona\n");
		int opClasse = sc.nextInt();
		while (opClasse < 1 || opClasse > 3) {
			System.out.println("Opção Inválida. Digite novamente.");
			System.out.println();
			System.out.print("[1] - Guerreiro     [2] - Mago     [3] - Amazona\n");
			opClasse = sc.nextInt();
		}
		System.out.print("Digite o seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		Heroi heroi;
		switch (opClasse) {
		case 1:
			heroi = new Guerreiro(nome);
			break;
		case 2:
			heroi = new Mago();
			break;
		case 3:
			heroi = new Amazona();
			break;
		}
		System.out.println("Herói criado ! Prepara-se para a aventura, ela começa aqui!");
		// solicitar o nome
		// criar um switch e colocar o construtor especifico da classe
		// construir os construtores de classe
		
		Menu menu = new Menu(sc);
		menu.showMenu();
		int op = menu.getOp();
		while (op != 0) {
			switch (op) {
			case 1:
				menu.showMenuCidade();
				op = menu.getOp();
				while (op != 0) {
					switch (op) {
						case 1:
							System.out.println("aaaaaaaa");
							menu.showMenuCidade();
							op = menu.getOp();
							break;
					}
				}
				menu.showMenu();
				op = menu.getOp();
				break;
			}
		}
		System.out.println();
		System.out.println("GAME OVER");
		
		sc.close();
	}

}
