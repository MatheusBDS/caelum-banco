package br.com.caelum.main;

import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("João da Silva");
		gerente.setSenha(4231);
		gerente.setSalario(5000);
		System.out.println(gerente.getBonificacao());
	}
}
