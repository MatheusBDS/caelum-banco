package br.com.caelum.contas.modelo;

public class Cliente {
	String nome;
	String endereco;
	String cpf;
	int idade;
	
	public void mudaCpf(String cpf) {
		validaCpf(cpf);
		this.cpf = cpf;
	}
	
	public void validaCpf(String cpf) {
		
	}
}
