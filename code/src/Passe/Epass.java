package Passe;
/**
 * @author roby*/
public abstract class Epass {
	protected int codigo;
	protected double saldo;
	protected String dataEmissaoPass;
	/**
	 * Metedo construtor
	 * @param cod
	 * @param sal
	 * @param data
	 * */
	public Epass(int cod, double sal, String data) {
		this.codigo = cod;
		this.dataEmissaoPass = data;
		this.saldo = sal;
	}
	/**
	 * Metedo pagarViagem
	 * @param preco
	 * */
	public void pagarViagem(double preco) {
		this.saldo = this.saldo - preco;
	}
	/**
	 * Metedo getCodigo
	 * @return codigo
	 * */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Metedo getSaldo
	 * @return saldo
	 * */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Metedo getDataEmissaoPass
	 * @return dataEmissaoPass
	 * */
	public String getDataEmissaoPass() {
		return this.dataEmissaoPass;
	}
	/**
	 * Metedo setCodigo
	 * @param codigo*/
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Metedo zeroSaldo
	 *Para Zerar o Saldo se preciso
	 **/
	public void zeroSaldo() {
		this.saldo = 0;
	}
	/**
	 * Metedo setSaldo
	 * @param saldo
	 * */
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
	/**
	 * Metedo setDataEmissaoPass
	 * @param dataEmissao
	 * */
	public void setDataEmissaoPass(String dataEmissao) {
		this.dataEmissaoPass = dataEmissao;
	}
	/**
	 * Metedo setTransferSaldo
	 * @param saldoTrans
	 * */
	public void setTransferSaldo(double saldoTrans) {
		this.saldo -= saldoTrans;
	}
}
