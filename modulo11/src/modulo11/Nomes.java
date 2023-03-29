package modulo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;



public class Nomes {
	
	public static void main(String[] args) {
		//ordenaNomes();
		nomeGenero();
	}

	private static void ordenaNomes() {
		
		System.out.println("*******OrdenaNomes*******");
		Scanner scanner = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		System.out.println("Escreva os nomes:");
		String nome = scanner.next();
		String[] resposta = nome.split(",");
		for(int i = 0; i < resposta.length;i++) {
			nomes.add(i, resposta[i]);
		}
		nomes.sort(null);
		System.out.println("Nomes:" + nomes.toString());
		
	}
	
	private static void nomeGenero() {
		System.out.println("********Nome e Genero********");
		Scanner scanner = new Scanner(System.in);
		List<String> mulher = new ArrayList<>();
		List<String> homem = new ArrayList<>();
		System.out.println("Escreva nome-sexo (Joao-m): "); 
		String res = scanner.next();
		String[] resSplit = res.split(",");
		for(int i = 0; i<resSplit.length; i++) {
			if(resSplit[i].contains("-f")) {
				mulher.add(resSplit[i]);
			}else {
				homem.add(resSplit[i]);
			}
		}
		
		System.out.println("Lista Mulheres: " + mulher.toString());
		System.out.println("Lista Homens: " + homem.toString());
		
	}
	
}
