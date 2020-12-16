package Passe;

/**
 * @author Roberto Medina
 * */
public abstract class Sazonal extends Epass {
	protected String chave;
	
	/**
	 * Metedo construtor para a classe
	 * @param cod
	 * @param sal
	 * @param data
	 * */
	public Sazonal(int cod, double sal, String data) {
		super(cod, sal, data);
		this.setChave(data, cod);
	}	
	/**
	 * Metedo getChave
	 * @return chave
	 * */
	public String getChave() {
		return chave;
	}
	/**
	 * Metedo setChave
	 * @param dataEmi
	 * @param cod
	 * */
	public void setChave(String dataEmi, int cod) {
		String  auxA6="";
        String[]  auxB3, auxB4;

       auxB3 = dataEmi.split(" ");
       auxB4 = auxB3[1].split("");
       if (auxB4.length == 2) {
    	   auxA6 = auxB4[0];
       }
       else {
    	   auxA6 = auxB4[0] + auxB4[1];
       }
       if(auxB3[0].equals("Jan")) {
    	   this.chave = auxB3[2]+"-01-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Fev")) {
    	   this.chave =  auxB3[2]+"-02-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Mar")) {
    	   this.chave =  auxB3[2]+"-03-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Apr")) {
    	   this.chave =  auxB3[2]+"-04-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("May")) {
    	   this.chave =  auxB3[2]+"-05-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Jun")) {
    	   this.chave =  auxB3[2]+"-06-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Jul")) {
    	   this.chave =  auxB3[2]+"-07-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Aug")) {
    	   this.chave =  auxB3[2]+"-08-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Sep")) {
    	   this.chave =  auxB3[2]+"-09-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Oct")) {
    	   this.chave =  auxB3[2]+"-10-"+auxA6+ cod;
       }
       else if(auxB3[0].equals("Nov")) {
    	   this.chave =  auxB3[2]+"-11-"+auxA6+ cod;
       }
       else{
    	   this.chave =  auxB3[2]+"-12-"+auxA6+ cod;
       }	
	}
	
}
