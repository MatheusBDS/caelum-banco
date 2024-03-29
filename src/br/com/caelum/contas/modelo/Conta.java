package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{
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
			throw new IllegalArgumentException("Voc� tentou sacar" + 
												" um valor negativo!");
		}if(valor > this.saldo) {
			throw new SaldoInsuficienteException(valor);
		}else {
			this.saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou depositar"+
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
		dados += "\nN�mero: " + this.numero;
		dados	+=	"\nData de Abertura: "	+	this.dataAbertura.formatada();
		
		return dados;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	
	@Override
	public String toString() {
		return "[titular=" + this.titular + ", numero=" + this.numero 
				+ ", agencia=" + this.agencia + "]";
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
}
