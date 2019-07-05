package br.com.caelum.contas.modelo;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada() {
		return dia+"/"+mes+"/"+ano;
	}
}
