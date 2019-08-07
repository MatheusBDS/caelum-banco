package br.com.caelum.main;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		long inicio1 = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fim1 = System.currentTimeMillis();
		
		long inicio2 = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim2 = System.currentTimeMillis();
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		long tempo1 = fim1 - inicio1;
		long tempo2 = fim2 - inicio2;
		System.out.println("Tempo gasto inserção: " + tempo1);
		System.out.println("Tempo gasto busca: " + tempo2);
		System.out.println("Tempo total gasto: " + tempo);
	}
}
