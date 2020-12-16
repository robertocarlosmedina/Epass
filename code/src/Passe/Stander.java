package Passe;

/**
 * @author roby
 * */
public abstract class Stander extends Epass{
	protected String chave;
	protected int nrViagens;
	protected Titular person;
	protected int pontos;
	
	
	/**
	 * Metedo construtor para a classe
	 * @param cod
	 * @param sal
	 * @param data
	 * */
	public Stander(int cod, double sal, String data) {
		super(cod, sal, data);
		this.nrViagens = 0;
		this.pontos=0;
		person = new Titular();
	}
	/**
	 * Metedo getChave
	 * @return chave
	 * */
	public String getChave() {
		return this.chave;
	}
	/**
	 * Metedo  getNrViagens
	 * @return nrViagens
	 * */
	public int getNrViagens() {
		return this.nrViagens;
	}
	/**
	 * Metedo setChave
	 * @param nome
	 * @param dataNasc
	 * @param cod
	 * */
	public void setChave(String nome, String dataNasc, int cod) {
		String auxA3, auxA4, auxA5="", auxA6="";
        String[] auxB1, auxB2, auxB3, auxB4;
        StringBuffer rev1, rev2;
        int i;

        auxB1 = nome.split(" ");
        if(auxB1.length > 1){
            auxA3 = auxB1[0];auxA4 = auxB1[auxB1.length-1];
        }
        else{
            auxA3 = auxB1[0]; auxA4 = "";
       }
       auxB2 = auxA3.split("");
       auxB3 = auxA4.split("");

       if(auxB2.length > 4){
           for (i=0;i<5;i++){
               auxA6 += auxB2[i];
           }
           rev1 = new StringBuffer(auxA6);
           rev1.reverse();
       }
       else{
           rev1 = new StringBuffer(auxA3);
           rev1.reverse();
       }

       if(auxB3.length > 4){
           for (i=0;i<5;i++){
               auxA5 += auxB3[i];
           }
           rev2 = new StringBuffer(auxA5);
           rev2.reverse();

       }
       else{
           rev2 = new StringBuffer(auxA4);
           rev2.reverse();
       }
       auxB3 = dataNasc.split(" ");
       auxB4 = auxB3[1].split("");
       if (auxB4.length == 2) {
    	   auxA6 = auxB4[0];
       }
       else {
    	   auxA6 = auxB4[0] + auxB4[1];
       }
       if(auxB3[0].equals("Jan")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-01-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Fev")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-02-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Mar")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-03-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Apr")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-04-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("May")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-05-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Jun")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-06-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Jul")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-07-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Aug")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-08-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Sep")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-09-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Oct")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-10-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Nov")) {
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-11-"+auxA6+ cod;
       }
       else{
    	   this.chave = rev1.toString() + rev2.toString() + auxB3[2]+"-12-"+auxA6+ cod;
       }
    }
	/**
	 * Metedo setNrViagens 
	 * */
	public void setNrViagens() {
		this.nrViagens += 1;
		int i=0;
		if(this.nrViagens >= 10) {
			while(i<=(Math.floor(this.nrViagens/10))){
				this.setPontos();
			}
		}
	}
	
	// Metedos da classe titular 
	/**
	 * Metedo getNrIdentifi
	 * @return nrIdentifi
	 * */
	public int getNrIdentifi() {
		return person.getNrIdentifi();
	}
	/**
	 * Metedo getDataEmisssaoDoc
	 * @return dataEmissao
	 * */
	public String getDataEmissaoDoc() {
		return person.getDataEmissaoDoc();
	}
	/**
	 * Metedo getNocionalidade
	 * @return nacionalidade
	 * */
	public String getNacionalidade() {
		return person.getNacionalidade();
	}
	/**
	 * Metedo getIdade
	 * @return idade
	 * */
	public int getIdade() {
		return person.getIdade();
	}
	/**
	 * Metedo getTipoEsc
	 * @return tipoEsc
	 * */
	public String getTipoEsc() {
		return person.getTipoEsc();
	}
	/**
	 * Metedo getDataNascimento
	 * @return dateNasc
	 * */
	public String getDataNascimento() {
		return person.getDateNasc();
	}
	/**
	 * Metedo  setDataNascimento
	 * @param date
	 * */
	public void setDataNascimento(String date) {
		person.setDateNac(date);
	}
	/**
	 * Metedo setCodigo
	 * @param codigo
	 * */
	public void setCodigo(String codigo) {
		person.setCodigo(codigo);;
	}
	/**
	 * Metedo setNrIdentifi
	 * @param nrIdentifi
	 * */
	public void setNrIdentifi(int nrIdentifi) {
		person.setNrIdentifi(nrIdentifi);;
	}
	/**
	 * Metedo setDataEmissaoDoc
	 * @param dataEm
	 * */
	public void setDataEmissaoDoc(String dataEm) {
		person.setDataEmissaoDoc(dataEm);;
	}
	/**
	 * Metedo  setNacionalidade
	 * @param nacionalidade
	 * */
	public void setNacionalidade(String nacionalidade) {
		person.setNacionalidade(nacionalidade);;
	}
	/**
	 * Metedo setIdade
	 * @param dataNasc
	 * @param dataAtual
	 * */
	public void setIdade(String dataNasc, String dataAtual) {
		String[] aux1, aux2;
		String aux3, aux4;
		int idade;
		aux1 = dataNasc.split(" ");
		aux2 = dataAtual.split(" ");
		aux3 = aux1[2]; aux4 = aux2[2];
		idade = Integer.parseInt(aux4)-Integer.parseInt(aux3);
		person.setIdade(idade);
	}
	/**
	 * Metedo getNome
	 * @return nome
	 * */
	public String getNome() {
		return person.getNome();
	}
	/**
	 * Metedo getDate
	 * @return dateEmissao
	 * */
	public String getDate() {
		return person.getDataEmissaoDoc();
	}
	/**
	 * Metedo  getTelefone
	 * @return telefone
	 * */
	public int getTelefone() {
		return person.getTelefone();
	}
	/**
	 * Metedo getMorada
	 * @return morada
	 * */
	public String getMorada() {
		return person.getMorada();
	}
	/**
	 * Metedo getEmail
	 * @return email
	 * */
	public String getEmail() {
		return person.getEmail();
	}
	/**
	 * Metedo setNome
	 * @param nome
	 * */
	public void setNome(String nome) {
		person.setNome(nome);;
	}
	/**
	 * Metedo setDate
	 * @param date 
	 * */
	public void setDate(String date) {
		person.setDataEmissaoDoc(date);;
	}
	/**
	 * Metedo setTelefone
	 * @param telefone
	 * */
	public void setTelefone(int telefone) {
		person.setTelefone(telefone);
	}
	/**
	 * Metedo setMorada
	 * @param morada
	 * */
	public void setMorada(String morada) {
		person.setMorada(morada);;
	}
	/**
	 * Metedo setEmial
	 * @param email 
	 * */
	public void setEmail(String email) {
		person.setEmail(email);
	}
	/**
	 * Metedo  seTipoDoc
	 * */
	public void setTipoDoc() {
		person.setTipoDoc();
	}
	/**
	 * Metedo getPontos
	 * @return pontos 
	 * */
	public int getPontos() {
		return pontos;
	}
	/**
	 * Metedo setPontos 
	 * */
	public void setPontos() {
		this.pontos += 1;
	}
	/**
	 * Metedo  usePontos
	 * @return true
	 * @return false
	 * */
	public boolean usePontos() {
		if(this.pontos >= 100) {
			this.pontos -= 40;
			return true;
		}
		else {
			return false;
		}
	}
	
}
