public class chave{
    public static String chave(String nome, String dataNasc, int cod){
        String chave="java", auxA3, auxA4, auxA5="", auxA6="";
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
        chave = rev1.toString() + rev2.toString() + dataNasc + cod;
        return chave;
    }
    public static void main(String[] args){
        System.out.println(chave("roberto carlos medina", "1999-05-04", 666));
    }
}