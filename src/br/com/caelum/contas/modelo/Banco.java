package br.com.caelum.contas.modelo;

import java.util.ArrayList;

public class Banco {
	private String nome;
	private int numero;
	// private Conta[] contas;
	
	private ArrayList<Conta> contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	

	/*public Conta[] getContas() {
		return contas;
	}
	
	public void adiciona(Conta c) {
		for(int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null){
				contas[i] = c;
				break;
			}
		}
	}*/
	
	public ArrayList<Conta> getContas() {
		return contas;
	}
	
	public void adiciona(Conta c) {
		contas.add(c);
	}
	
	public void mostraContas() {
		/*for	(int i = 0;	i < this.contas.length;	i++)	{
			if(contas[i] != null) {
				System.out.println("Conta na posição: "	+ (i+1));
				System.out.println(this.contas[i].toString());
				System.out.println("Saldo: "+ this.contas[i].getSaldo());
			}
		}*/
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		
	}
	

	public boolean contem(Conta conta) {
		/*for (int i = 0;	i < this.contas.length;	i++) {
			if(this.contas[i] == conta) {
				return true;
			}
		}*/
		return false;
	}
	
	public Conta pega(int x) {
		
		
		return null;
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorTitular(String Titular) {
		
		
		
		return null;
	}
	
	
}
