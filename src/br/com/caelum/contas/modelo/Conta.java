package br.com.caelum.contas.modelo;

public class Conta {
	protected String titular;
	protected int numero;
	protected String agencia;
	protected double saldo;
	protected Data dataAbertura;
	protected static int totalDeContas;
	
	
	
	public Conta() {
		Conta.totalDeContas += 1;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public String getTipo() {
		return "Conta";
	}

	public void saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Valor maior que o disponível para saque!");
		}else {
			this.saldo -= valor;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento() {
		return this.saldo += this.saldo * 0.01;
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: "+ this.titular;
		dados += "\nNúmero: " + this.numero;
		dados	+=	"\nData de Abertura: "	+	this.dataAbertura.formatada();
		
		return dados;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}
