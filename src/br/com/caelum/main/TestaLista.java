package br.com.caelum.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<>();
		Random gerador = new Random();
		
		for(int i = 0; i < 2; i++) {
			
			Conta conta = new ContaCorrente();
			
			conta.setAgencia("1234");
			conta.setNumero(0000+(i+1));
			conta.setTitular("TITULAR"+(i+1));
			conta.deposita(gerador.nextDouble()*5000);
			
			contas.add(conta);
			
		}
		
		// System.out.println(contas);
		
		Set<Conta> contas1 = new LinkedHashSet<>();
		
		
		for(int i = 0; i < 2; i++) {
			
			Conta conta = new ContaCorrente();
			
			conta.setAgencia("1234");
			conta.setNumero(0000+(i+1));
			conta.setTitular("TITULAR"+(i+1));
			conta.deposita(gerador.nextDouble()*5000);
			
			contas1.add(conta);
			
		}
		
		// System.out.println(contas1);
		
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(mapaDeContas.values());
		
		
	}
}
