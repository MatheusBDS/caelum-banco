package br.com.caelum.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;
import br.com.caelum.javafx.api.main.OlaMundo;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class TestaContas {
	public static void main(String[] args) {
		/*Conta c1 = new Conta();
		Data data = new Data();
		
		c1.setTitular("Matheus");
		c1.setNumero(8591);
		c1.setAgencia("2546-8");
		c1.deposita(150.00);
		c1.setDataAbertura(data);
		
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		c1.deposita(100.00);
		System.out.println("Saldo atual: " + c1.getSaldo());
		System.out.println("Rendimento Mensal: " + c1.calculaRendimento());
		*/
		
		SistemaBancario.mostraTela(true);
		//TelaDeContas.main(args);
		
	}
}
