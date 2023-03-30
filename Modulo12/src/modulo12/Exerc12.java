package modulo12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		nomeGenero();
	}
	
	private static void nomeGenero() {
		
		for(int i =0; i < 5; i++) {
		System.out.println("Digite o seu nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.next();
		System.out.println("Digite o seu gênero: ");
		String genero = s.next();
		Map<String, String> pessoa = new HashMap<>();
		pessoa.put(nome, genero);
		System.out.println("pessoas:" + pessoa.toString());
		}
	}
}
