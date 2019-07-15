package br.com.caelum.main;

public class TestaSplit {

	public static void main(String[] args) {
		String frase = "Uma mensagem qualquer";
		String[] palavras = frase.split(" ");
		
		for (String x : palavras) {
			System.out.println(x);
		}
	}

}
