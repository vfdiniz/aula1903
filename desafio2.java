package aula1903;

import java.util.Scanner;

public class desafio2 {
public static void main(String[] args) {
	//DECLARANDO VARIAVEL
	int geracao;
	
	//entrada
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Informe a sua data de nascimento");
	geracao = ler.nextInt();
	
	ler.close();
	
	if (geracao >= 2010) {
		System.out.println("Geração Alpha");
		
	} else if (geracao >= 1997) {
		System.out.println("Geração Z");
	} else if (geracao >= 1981) {
		System.out.println("Geração Y");
	} else if (geracao >= 1966) {
		System.out.println("Geração X");
	} else if (geracao >= 1946) {
		System.out.println("");
		}
		
	}
}
