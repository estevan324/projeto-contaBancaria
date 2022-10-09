package utils;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public ContaBancaria(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		realizarDeposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void realizarDeposito(double valor) {
		saldo += valor;
	}
	
	public void realizarSaque(double valor) {
		saldo -= valor + 5;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: %.2f", numero,
				titular, saldo);
	}
}
