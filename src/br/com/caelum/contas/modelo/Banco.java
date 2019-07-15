package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	

	public Conta[] getContas() {
		return contas;
	}
	
	public void adiciona(Conta c) {
		for(int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null){
				contas[i] = c;
				break;
			}
		}
	}
	
	public void mostraContas() {
		for	(int i = 0;	i < this.contas.length;	i++)	{
			if(contas[i] != null) {
				System.out.println("Conta na posição: "	+ (i+1));
				System.out.println(this.contas[i].toString());
				System.out.println("Saldo: "+ this.contas[i].getSaldo());
			}
		}
	}
	
	public boolean contem(Conta conta) {
		for (int i = 0;	i < this.contas.length;	i++) {
			if(this.contas[i] == conta) {
				return true;
			}
		}
		return false;
	}
}
