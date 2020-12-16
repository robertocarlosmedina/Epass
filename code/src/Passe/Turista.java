package Passe;
import java.util.Scanner;

/**
 * @author roby
 * */
public class Turista extends Sazonal {
	private final int preco = 50;
	private String tipoPass;
	private final int[][] diaPorPreco = {{1, 3, 7},
									{500, 700, 1500}};
	
	
	
	/**
	 * Metedo construtor para a classe
	 * @param cod
	 * @param sal
	 * @param data
	 * */
	public Turista(int cod, double sal, String data) {
		super(cod, sal, data);
	}
	/**
	 * Metedo getPreco
	 * @return preco
	 * */
	public int getPreco() {
		return preco;
	}
	/**
	 * Metedo payTravel
	 * */
	public void payTravel() {
		this.pagarViagem(preco);
	}
	/**
	 * Metedo getTipoPass
	 * @return tipoPass
	 * */
	public String getTipoPass() {
		return this.tipoPass;
	}
	/**
	 * Metedo setTipoPass
	 * */
	public void setTipoPass() {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int esc=0;
		boolean ver = true;
		System.out.println("\tEscolhas tipo Epass Turista: ");
		System.out.println("\t\t < 1 > "+diaPorPreco[0][0]+" dias por "+diaPorPreco[1][0]+"$00");
		System.out.println("\t\t < 2 > "+diaPorPreco[0][1]+" dias por "+diaPorPreco[1][1]+"$00");
		System.out.println("\t\t < 3 > "+diaPorPreco[0][2]+" dias por "+diaPorPreco[1][2]+"$00");
		
		while(ver) {
			System.out.print("\tset-Tipo-Pass-Escolha -> ");
			esc = read.nextInt();
			if((esc>=1)&&(esc<=3)) {
				ver = false;
			}
			else {
				System.out.println("   #Erro: de escolha.");
			}
		};
		if (esc == 1) {
			this.setSaldo(diaPorPreco[1][0]);
			this.tipoPass = "Epass "+diaPorPreco[0][0]+" dias por "+diaPorPreco[1][0]+"$00";
		}
		else if(esc==2) {
			this.setSaldo(diaPorPreco[1][1]);
			this.tipoPass = diaPorPreco[0][1]+" dias por "+diaPorPreco[1][1]+"$00";
		}
		else {
			this.setSaldo(diaPorPreco[1][2]);
			this.tipoPass = diaPorPreco[0][2]+" dias por "+diaPorPreco[1][2]+"$00";
		}
	}
}
