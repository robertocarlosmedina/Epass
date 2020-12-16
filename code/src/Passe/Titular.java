package Passe;
/**
 * @author roby*/
public class Titular {
	private String nome;
	private String dateNasc;
	private int telefone;
	private String morada;
	private String email;
	private DocumentoID DocID;
	
	/**
	 * Metedo construtor para a classe
	 * */
	public Titular() {
		DocID = new DocumentoID();
	}
	
	
	// Evocando metedos da classe docomentoID
	/**
	 * Metedo getNrIdentifi
	 * @return nrIdentifi
	 * */
	public int getNrIdentifi() {
		return DocID.getNrIdentifi();
	}
	/**
	 * Metedo getDataEmissaoDoc
	 * @return dataEmissaoDoc
	 * */
	public String getDataEmissaoDoc() {
		return DocID.getDataEmissaoDoc();
	}
	/**
	 * Metedo getNacionalidade
	 * @return nacionalidade
	 * */
	public String getNacionalidade() {
		return DocID.getNacionalidade();
	}
	/**
	 * Metedo getIdade
	 * @return idade
	 * */
	public int getIdade() {
		return DocID.getIdade();
	}
	/**
	 * Metedo getTipoEsc
	 * @return tipoEsc
	 * */
	public String getTipoEsc() {
		return DocID.getTipoEsc();
	}
	/**
	 * Metedo setCodigo
	 * @param codigo
	 * */
	public void setCodigo(String codigo) {
		DocID.setCodigo(codigo);;
	}
	/**
	 * Metedo setTipoDoc
	 * */
	public void setTipoDoc() {
		DocID.setTipoEsc();
	}
	/**
	 * Metedo setNrIdentifi
	 * @param nrIdentifi
	 * */
	public void setNrIdentifi(int nrIdentifi) {
		DocID.setNrIdentifi(nrIdentifi);;
	}
	/**
	 * Metedo setDataEmissaoDoc
	 * @param dataEmi
	 * */
	public void setDataEmissaoDoc(String dataEmi) {
		DocID.setDataEmissaoDoc(dataEmi);;
	}
	/**
	 * Metedo setNacionalidade
	 * @param nacionalidade
	 * */
	public void setNacionalidade(String nacionalidade) {
		DocID.setNacionalidade(nacionalidade);;
	}
	/**
	 * Metedo setIdade
	 * @param idade
	 * */
	public void setIdade(int idade) {
		DocID.setIdade(idade);
	}
	
	//metedos da classe em questão
	/**
	 * Metedo getNome
	 * @return nome
	 * */
	public String getNome() {
		return nome;
	}
	/**
	 * Metedo getDateNasc
	 * @return dataNasc
	 * */
	public String getDateNasc() {
		return dateNasc;
	}
	/**
	 * Metedo getTelefone
	 * @return telefone
	 * */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * Metedo getMorada
	 * @return morada
	 * */
	public String getMorada() {
		return morada;
	}
	/**
	 * Metedo getEmail
	 * @return email
	 * */
	public String getEmail() {
		return email;
	}
	/**
	 * Metedo setNome
	 * @param nome
	 * */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metedo setDataNasc
	 * @param date
	 * */
	public void setDateNac(String date) {
		this.dateNasc = date;
	}
	/**
	 * Metedo setTelefone
	 * @param telefone
	 * */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * Metedo setMorada
	 * @param morada
	 * */
	public void setMorada(String morada) {
		this.morada = morada;
	}
	/**
	 * Metedo setEmail
	 * @param email
	 * */
	public void setEmail(String email) {
		this.email = email;
	}
}
