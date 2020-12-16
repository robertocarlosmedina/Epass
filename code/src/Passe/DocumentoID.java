package Passe;
import java.util.Scanner;

/**
 * @author Roberto Medina
 * */
public class DocumentoID {
	private String codigo;
	private final String[] tipoDoc = {"BI","PASSPORT", "TER", "CUC"};
	private int nrIdentifi;
	private String dataEmissao;
	private String nacionalidade;
	private int idade;
	private String tipoEsc;
	/**
	 * Metedo getCodigo
	 * @return codigo*/
	public String getCodigo() {
		return codigo;
	}
	/**
	 * Metedo getTipoDoc
	 * @return tipoDoc*/
	public String[] getTipoDoc() {
		return this.tipoDoc;
	}
	/**
	 * Metedo getNrIdentificação
	 * @return nrIdentifi*/
	public int getNrIdentifi() {
		return this.nrIdentifi;
	}
	/**
	 * Metedo getDataEmissaoDoc
	 * @return dataEmissao*/
	public String getDataEmissaoDoc() {
		return this.dataEmissao;
	}
	/**
	 * Metedo getNacionalidade
	 * @return nacionalidade*/
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	/**
	 * Metedo getIdade
	 * @return nacionalidade
	 * */
	public int getIdade() {
		return this.idade;
	}
	/**
	 * Metedo getTipoEsc
	 * @return tipoEsc
	 * */
	public String getTipoEsc() {
		return this.tipoEsc;
	}
	/**
	 * Metedo setCodigo
	 * @param codigo
	 * */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * Metedo setNrIdentificação
	 * @param nrIdentifi
	 * */
	public void setNrIdentifi(int nrIdentifi) {
		this.nrIdentifi = nrIdentifi;
	}
	/**
	 * Metedo setDataEmissaoDoc
	 * @param dataEmissao
	 * */
	public void setDataEmissaoDoc(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	/**
	 * Metedo setNacionalidade
	 * @param nacionalidade
	 * */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	/**
	 * Metedo setIdade
	 * @param idade
	 * */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * Metedo setTipoEsc
	 * */
	public void setTipoEsc() {
		System.out.println("Escolhas para o tipo documento: ");
		int i=0, esc=0;
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		for (;i<=this.tipoDoc.length-1;i++) {
			System.out.println("\t\t< "+(i+1)+" > "+this.tipoDoc[i]);
		}
		boolean ver = true;
		while(ver) {
			System.out.print("\t   Escolha -> ");
			esc = read.nextInt();
			if((esc>=1)&&(esc<=4)) {
				ver = false;
			}
			else {
				System.out.println("   #Erro: de escolha.");
			}
		}
		this.tipoEsc = tipoDoc[esc-1];
	}
}