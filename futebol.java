package desafio4;

import java.util.Random;
import java.util.Scanner;

public class futebol {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	System.out.println("Escolha um canto para chutar:");
	System.out.println("1 - Esquerda");
	System.out.println("2 - Meio");
	System.out.println("3 - Direita");

	int escolhaJogador = scanner.nextInt();

	int escolhaGoleiro = random.nextInt(3) + 1; // Gera um número aleatório entre 1 e 3

	System.out.println("O goleiro pulou para o canto " + escolhaGoleiro);

	if (escolhaJogador != escolhaGoleiro) {
	System.out.println("GOOOOL!");
	} else {
	System.out.println("Defendeu!");
	}

	scanner.close();
	

}
}
