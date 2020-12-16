package Passe;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author roby
 * */
public class Student extends Stander {
	private int anoEsc;
	private String nameEsc;
	private final int precoViagem = 20;
	private int viagensFree = 0;
	private String dataCarrega;
	private String dataEspira;
	private final int ValidadeSaldo = 30;
	private String nameEscola;
	private final String[] zonasPermitida = {"Cruz João Évora", "Belavista", "Fonte Françês",
										"Monte Sussego", "Chã de Marinha", "Mederalzin",
										"Vila Nova", "Pont D'agua", "Liceu Velho",
										"Fonte Inés", "Chã de Alecrim", "Espia", "Ribeira Bote",
										"Morada", "Passarão", "Fernando Pau"};
	
	/**
	 * Metedo construtor para a classe
	 * @param cod
	 * @param sal
	 * @param dataEmPass
	 * */
	public Student(int cod, double sal,String dataEmPass){
		super(cod, sal, dataEmPass);
		this.viagensFree = 4;
	}
	/**
	 * Metedo mesEmInt
	 * @param mes
	 * @return int
	 * */
	public int mesEmInt(String mes) {
		   if(mes.equals("Jan")) {
	    	   return 1;
	       }
	       else if(mes.equals("Fev")) {
	    	   return 2;
	       }
	       else if(mes.equals("Mar")) {
	    	   return 3;
	       }
	       else if(mes.equals("Apr")) {
	    	   return 4;
	       }
	       else if(mes.equals("May")) {
	    	   return 5;
	       }
	       else if(mes.equals("Jun")) {
	    	   return 6;
	       }
	       else if(mes.equals("Jul")) {
	    	   return 7;
	       }
	       else if(mes.equals("Aug")) {
	    	   return 8;
	       }
	       else if(mes.equals("Sep")) {
	    	   return 9;
	       }
	       else if(mes.equals("Oct")) {
	    	   return 10;
	       }
	       else if(mes.equals("Nov")) {
	    	   return 11;
	       }
	       else{
	    	   return 12;
	       }
	}
	/**
	 * Metedo validarPass
	 * @return true
	 * @return false
	 * */
	public boolean validoPass() {
		String[] aux1, aux2, aux3;
		String dataAtual;
		int mesE, diaE, anoE;
		int mesA, diaA, anoA;
		
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();
        DateFormat datForm2 = DateFormat.getDateInstance();
        dataAtual = datForm2.format(dataEmPass);
		
        aux1 = this.dataEspira.split(" ");
		aux2 = dataAtual.split(" ");
		aux3 = aux1[1].split("");
		if(aux3.length==2) {
			diaE = Integer.parseInt(aux3[0]);
		}
		else {
			diaE = Integer.parseInt(aux3[0]+aux3[1]);
		}
		anoE = Integer.parseInt(aux1[2]);
		mesE = mesEmInt(aux1[0]);
		
		aux3 = aux2[1].split("");
		if(aux3.length==2) {
			diaA = Integer.parseInt(aux3[0]);
		}
		else {
			diaA = Integer.parseInt(aux3[0]+aux3[1]);
		}
		anoA = Integer.parseInt(aux2[2]);
		mesA = mesEmInt(aux2[0]);
		
		if((mesE>mesA)||(anoE>anoA)) {
			return true;
		}
		else if((diaE>diaA)&&(mesE==mesA)) {
			return true;
		}
		else {
			return false;
		}	
	}
	/**
	 * Metedo useFreeTravel
	 * 
	 * */
	public void useFreeTravel() {
		this.viagensFree -= 1;
	}
	/**
	 * Metedo verificarZona
	 * @param zona
	 * @return true
	 * @return false
	 * */
	public boolean verificarZona(String zona) {
		int i=0;
		for(;i>(this.zonasPermitida.length-1);i++) {
			if(this.zonasPermitida[i].equals(zona)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * Metedo getAnoEsc
	 * @return anoEsc
	 * */
	public int getAnoEsc() {
		return anoEsc;
	}
	/**
	 * Metedo payTravel
	 * */
	public void payTravel() {
		this.pagarViagem(this.precoViagem);
	}
	/**
	 * Metedo getNomeEscola
	 * @return nameEscola
	 * */
	public String getNomeEscola() {
		return nameEscola;
	}
	/**
	 * Metedo getPreoViagem
	 * @return precoViagem
	 * */
	public int getPrecoViagem() {
		return precoViagem;
	}
	/**
	 * Metedo getViagensFree
	 * @return viagensFree
	 * */
	public int getViagensFree() {
		return viagensFree;
	}
	/**
	 * Metedo getDataCarrega
	 * @return dataCarrega
	 * */
	public String getDataCarrega() {
		return dataCarrega;
	}
	/**
	 * Metedo getDataEspira
	 * @return dataEspira
	 * */
	public String getDataEspira() {
		return dataEspira;
	}
	/**
	 * Metedo getValidadeSaldo
	 * @return ValidadeSaldo
	 * */
	public int getValidadeSaldo() {
		return ValidadeSaldo;
	}
	/**
	 * Metedo getZonasPermitidas
	 * */
	public void getZonasPermitida() {
		int i=0;
		System.out.println("   #Erro: Zona não permitidas: ");
		System.out.println("   \t#Zona permitidas: ");
		for(;i<(this.zonasPermitida.length-1);i++) {
			System.out.println("\t\t< "+(i+1)+" > "+this.zonasPermitida[i]);
		}
	}
	/**
	 * Metedo setAnoEsc
	 * @param anoEsc
	 * */
	public void setAnoEsc(int anoEsc) {
		this.anoEsc = anoEsc;
	}
	/**
	 * Metedo setNomeEscola
	 * @param nomeEscola
	 * */
	public void setNomeEscola(String nomeEscola) {
		this.nameEscola = nomeEscola;
	}
	/**
	 * Metedo setViagensFree
	 * */
	public void setViagensFree() {
		this.viagensFree = 4;
	}
	/**
	 * Metedo setDataCarrega
	 * @param dataCarrega
	 * */
	public void setDataCarrega(String dataCarrega) {
		this.dataCarrega = dataCarrega;
		this.setDataEspira(dataCarrega);
	}
	/**
	 * Metedo eBissexto
	 * @param ano
	 * */
	public static boolean eBissexto(int ano){
        if ((ano % 400) == 0){
            return true;
        }
        else if((ano % 4) == 0 && (ano % 100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }
	/**
	 * Metedo setDataEspira
	 * @param datacarg
	 * */
    public void setDataEspira(String datacarg) {
		int mes, dia, ano;
        String aux5;
		String[] aux2, aux4;
		aux2 = datacarg.split(" ");
        aux5 = aux2[1];
        aux4 = aux5.split("");
		ano = Integer.parseInt(aux2[2]);
        if (aux4.length == 2) {
    	   aux5 = aux4[0];
       }
       else {
    	   aux5 = aux4[0] + aux4[1];
       }
       dia = Integer.parseInt(aux5);
       mes = this.mesEmInt(aux2[0]);

       if (((dia+30)>31)&&(mes == 1) ||(mes == 3) || (mes == 5) ||(mes == 7) ||(mes == 8) ||(mes == 10)){
            dia = (dia+30)-31;
            mes += 1;
        }
        else if(((dia+30)>31)&&(mes == 12)){
            dia = (dia+30)-31;
            mes = 1;
            ano += 1;
        }
        else if (((dia+30)>30)&&(mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)){
            dia = (dia+30)-30;
            mes += 1;
        }
        else if (((dia+30)>29)&&(mes == 2)){
            if(eBissexto(ano) == true){
                dia = (dia+30)-29;
                mes += 1;
            }
            else{
                dia = (dia+30)-28;
                mes += 1;
            }
        }
        else{
            dia = dia + 30;
        }

       if(mes==1) {
    	   this.dataEspira = "Jan "+dia+", "+ano;
       }
       else if(mes==2) {
    	   this.dataEspira = "Fev "+dia+", "+ano;
       }
       else if(mes==3) {
    	   this.dataEspira = "Mar "+dia+", "+ano;
       }
       else if(mes==4) {
    	   this.dataEspira = "Apr "+dia+", "+ano;
       }
       else if(mes==5) {
    	   this.dataEspira = "May "+dia+", "+ano;
       }
       else if(mes==6) {
    	   this.dataEspira = "Jun "+dia+", "+ano;
       }
       else if(mes==7) {
    	   this.dataEspira = "Jul "+dia+", "+ano;
       }
       else if(mes==8) {
    	   this.dataEspira = "Aug "+dia+", "+ano;
       }
       else if(mes==9) {
    	   this.dataEspira = "Sep "+dia+", "+ano;
       }
       else if(mes==10) {
    	   this.dataEspira = "Oct "+dia+", "+ano;
       }
       else if(mes==11) {
    	   this.dataEspira = "Nov "+dia+", "+ano;
       }
       else{
    	   this.dataEspira = "Dec "+dia+", "+ano;
       }
    }
    /**
	 * Metedo getNameEsc
	 * @return nameEsc
	 * */
	public String getNameEsc() {
		return nameEsc;
	}
	/**
	 * Metedo setNameEsc
	 * @param nameEsc
	 * */
	public void setNameEsc(String nameEsc) {
		this.nameEsc = nameEsc;
	}
}
