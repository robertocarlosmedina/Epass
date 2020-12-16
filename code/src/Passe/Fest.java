package Passe;
import java.util.ArrayList;
/**
 * @author roby
 * */
public class Fest extends Sazonal {
	private String nomeEvent;
	private String dateInico;
	private String dateFim;
	private double saldoFest;
	private final double precoViagem = 40;
	private ArrayList<String> saldoBilhete = new ArrayList<String>();
	
	/**
	 * Metedo contrutos para a classe
	 * @param cod
	 * @param sal
	 * @param data 
	 * */
	public Fest(int cod, double sal, String data) {
		super(cod, sal, data);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metedo getNomeEvent
	 * @return nomeEvent 
	 * */
	public String getNomeEvent() {
		return nomeEvent;
	}
	/**
	 * Metedo payTravel
	 * */
	public void payTravel() {
		this.pagarViagem(this.precoViagem);
	}
	/**
	 * Metedo setNomeEvent
	 * @param nomeEvent
	 * */
	public void setNomeEvent(String nomeEvent) {
		this.nomeEvent = nomeEvent;
	}
	/**
	 * Metedo getDateInicio
	 * @return dateInicio
	 * */
	public String getDateInico() {
		return dateInico;
	}
	/**
	 * Metedo setDateInicio
	 * @param dateInicio 
	 * */
	public void setDateInico(String dateInicio) {
		this.dateInico = dateInicio;
	}
	/**
	 * Metedo getDateFim
	 * @return dateFim
	 * */
	public String getDateFim() {
		return dateFim;
	}
	/**
	 * Metedo setDateFim
	 * @param dateFim 
	 * */
	public void setDateFim(String dateFim) {
		this.dateFim = dateFim;
	}
	/**
	 * Metedo  getSaldoFest
	 * @return saldoFest
	 * */
	public double getSaldoFest() {
		return saldoFest;
	}
	/**
	 * Metedo  setSaldoFest
	 * @param saldoFest
	 * */
	public void setSaldoFest(double saldoFest) {
		this.saldoFest += saldoFest;
	}
	/**
	 * Metedo getSaldoBilhete
	 * @return saldoBilhete
	 * */
	public ArrayList<String> getSaldoBilhete() {
		return saldoBilhete;
	}
	/**
	 * Metedo setSaldoBilhete
	 * @param saldoBilhete
	 * */
	public void setSaldoBilhete(ArrayList<String> saldoBilhete) {
		this.saldoBilhete = saldoBilhete;
	}
}
