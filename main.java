import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import java.text.ParseException;

public class main{
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
    public static String setDataEspira(String datacarg) {
		int mes, dia, ano;
        String aux1, aux5;
		String[] aux2,  aux3, aux4;
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

       if(aux2[0].equals("Jan")) {
    	   mes = 1;
       }
       else if(aux2[0].equals("Fev")) {
    	   mes = 2;
       }
       else if(aux2[0].equals("Mar")) {
    	   mes=3;
       }
       else if(aux2[0].equals("Apr")) {
    	   mes =4;
       }
       else if(aux2[0].equals("May")) {
    	   mes=5;
       }
       else if(aux2[0].equals("Jun")) {
    	   mes=6;
       }
       else if(aux2[0].equals("Jul")) {
    	   mes=7;
       }
       else if(aux2[0].equals("Aug")) {
    	   mes=8;
       }
       else if(aux2[0].equals("Sep")) {
    	   mes=9;
       }
       else if(aux2[0].equals("Oct")) {
    	  mes=10;
       }
       else if(aux2[0].equals("Nov")) {
    	   mes=11;
       }
       else{
    	   mes=12;
       }

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
    	   return "Jan "+dia+", "+ano;
       }
       else if(mes==2) {
    	   return "Fev "+dia+", "+ano;
       }
       else if(mes==3) {
    	   return "Mar "+dia+", "+ano;
       }
       else if(mes==4) {
    	   return "Apr "+dia+", "+ano;
       }
       else if(mes==5) {
    	   return "May "+dia+", "+ano;
       }
       else if(mes==6) {
    	    return "Jun "+dia+", "+ano;
       }
       else if(mes==7) {
    	   return "Jul "+dia+", "+ano;
       }
       else if(mes==8) {
    	   return "Aug "+dia+", "+ano;
       }
       else if(mes==9) {
    	   return "Sep "+dia+", "+ano;
       }
       else if(mes==10) {
    	  return "Oct "+dia+", "+ano;
       }
       else if(mes==11) {
    	   return "Nov "+dia+", "+ano;
       }
       else{
    	   return "Dec "+dia+", "+ano;
       }
    }
    public static void main(String[] args){
        System.out.println(setDataEspira("Fev 10, 2020"));
        // Scanner read = new Scanner(System.in);
        // String data, dtns;

        // try {
        //     System.out.println("Digite a data: "); data = read.nextLine();
        //     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //     Date date = formatter.parse(data);
        //     DateFormat datForm = DateFormat.getDateInstance();
        //     dtns = datForm.format(date);
        //     System.out.println(dtns);
        // } catch (Exception ex) {
        //     System.out.println("ox");
        // }
    }
}