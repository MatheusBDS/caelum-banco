package br.com.caelum.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		double media = 0;
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			System.out.println(conta.getSaldo());
			
			media += conta.getSaldo();
			
		}
		
		media /= contas.length;
		
		System.out.println("Média dos Saldos: " + media);
				
	}

}
