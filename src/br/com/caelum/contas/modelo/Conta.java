package br.com.caelum.contas.modelo;

public abstract class Conta {
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

	public abstract String getTipo();

	public void saca(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar" + 
												" um valor negativo!");
		}if(valor > this.saldo) {
			throw new SaldoInsuficienteException(valor);
		}else {
			this.saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar"+
												" um valor negativo");
		}else {
			this.saldo += valor;
		}
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	@Override
	public String toString() {
		return "[titular=" + this.titular + ", numero=" + this.numero 
				+ ", agencia=" + this.agencia + "]";
	}
}
