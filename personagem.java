package desafio3;

import java.util.Scanner;

public class personagem {
public static void main(String[] args) {
	//CHAMAR O SCANNER
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite o nome do personagem: ");
	String nomePersonagem = scanner.nextLine();
	System.out.print("Digite a pontuação de força (1 a 100): ");
	int nivel = scanner.nextInt();
	String categoria;
	//PROCESSAMENTO
	if (nivel >= 81) {
	categoria = "Lendario";
	} else if (nivel >= 51) {
	categoria = "Elite";
	} else if (nivel >= 21) {
	categoria = "Guerreiro";
	} else if (nivel >= 1) {
	categoria = "Iniciante";
	} else {
	categoria = "Erro: Pontuação fora do intervalo válido";
	}
	System.out.println("Personagem: " + nomePersonagem);
	System.out.println("Classificação: " + categoria);
	scanner.close();
}
}
