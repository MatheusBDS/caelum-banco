package br.com.caelum.main;

import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new LinkedList<>();
		
		long inicio1 = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		long fim1 = System.currentTimeMillis();
		
		long inicio2 = System.currentTimeMillis();
		for (Integer posicao : teste) {
			teste.get(posicao);
		}
		long fim2 = System.currentTimeMillis();
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		double tempo1 = (fim1 - inicio1) / 1000.0;
		double tempo2 = (fim2 - inicio2) / 1000.0;
		System.out.println("Tempo de inserção: " + tempo1);
		System.out.println("Tempo de busca: " + tempo2);
		System.out.println("Tempo total gasto: " + tempo);
	}
}
