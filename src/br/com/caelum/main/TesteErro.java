package br.com.caelum.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do main");
		
	}
	
	static void metodo1() {
		System.out.println("inicio metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("inicio metodo2");
		ContaCorrente cc = new ContaCorrente();
		for (int i = 0; i <= 15; i++) {
			try {
			cc.deposita(i+1000);
			System.out.println(cc.getSaldo());
			if(i == 5) {
				cc = null;
			}
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		}
		
		System.out.println("fim do metodo2");
		
	}
	
}
