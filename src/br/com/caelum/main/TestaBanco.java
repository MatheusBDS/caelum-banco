package br.com.caelum.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 999);
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Batman");
		c1.setNumero(1);
		c1.setAgencia("1000");
		c1.deposita(100000);
		banco.adiciona(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular("Coringa");
		c2.setNumero(1);
		c2.setAgencia("1000");
		c2.deposita(890000);
		banco.adiciona(c2);
		
		/*
		Conta c3 = new ContaCorrente();
		c3.setTitular("EU");
		c3.setNumero(3);
		c3.setAgencia("1000");
		c3.deposita(125365);
		banco.adiciona(c3);
		*/
		
		banco.mostraContas();
		
	}

}
