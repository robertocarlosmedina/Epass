package Passe;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * @author roby*/
public class Main {
	/**
	 * Metedo createStudentPass
	 * @param cod
	 * @return pass
	 * */
	public static Student createStudentPass(int cod) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String nam;
		String morada;
		String email;
		String esc;
		String nacio;
		String dataEmi;//data de emissão do documento de ID
		String dataNasc;
		int nrID;
		int ano, telefone;
		double sal=0;
		boolean ver = true;
		
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();// data de emissão do documento de identificação
        DateFormat datForm2 = DateFormat.getDateInstance();
        Student pass = new Student(cod, sal, datForm2.format(dataEmPass));
        pass.setDataCarrega(datForm2.format(dataEmPass));
        pass.setDataEmissaoPass(datForm2.format(dataEmPass));
		
		System.out.print("\tset-name -> ");
		nam = read.nextLine();
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-data-nascimento (dd/mm/aaaa) -> "); dataNasc = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataNasc);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataNascimento(datForm1.format(date));
	        } catch (Exception ex) {
	        	i=1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }if(i==0) {
	        	ver= false;
	        }
			
		}
		pass.setIdade(pass.getDataNascimento(), pass.getDataEmissaoPass());
		System.out.print("\tset-school -> ");
		esc = read.nextLine();
		pass.setNomeEscola(esc);
		System.out.print("\tset-email -> ");
		email = read.nextLine();
		pass.setEmail(email);
		System.out.print("\tset-morada -> ");
		morada = read.nextLine();
		pass.setMorada(morada);
		System.out.print("\tset-nacionalidade -> ");
		nacio = read.nextLine();
		pass.setNacionalidade(nacio);
		System.out.print("\tset-Tipo-Doc-ID-> ");
		pass.setTipoDoc();
		ver = true;
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-Data_Emissão_Documento_ID (dd/mm/aaaa) -> "); dataEmi = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataEmi);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataEmissaoDoc(datForm1.format(date));
	        } catch (Exception ex) {
	        	i = 1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }
			if(i==0) {
				ver = false;
			}
		}
		System.out.print("\tset-numero_Identificação -> ");
		nrID = read.nextInt();
		pass.setNrIdentifi(nrID);
		System.out.print("\tset-escolaridade -> ");
		ano = read.nextInt();
		pass.setAnoEsc(ano);
		System.out.print("\tset-telefone -> ");
		telefone = read.nextInt();
		pass.setTelefone(telefone);
		System.out.print("\tset-Saldo -> ");
		sal = read.nextInt();
		pass.setSaldo(sal);
		
		
		pass.setChave(nam,pass.getDataNascimento(), cod);	
		return pass;
	}
	/**
	 * Metedo createJovemPass
	 * @param cod
	 * @return pass
	 * */
	public static Jovem createJovemPass(int cod) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String nam;
		String morada;
		String email;
		String nacio;
		String dataEmi;//data de emissão do documento de ID
		String dataNasc;
		int nrID;
		int  telefone;
		double sal=0;
		boolean ver = true;
		
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();// data de emissão do documento de identificação
        DateFormat datForm2 = DateFormat.getDateInstance();
        Jovem pass = new Jovem(cod, sal, datForm2.format(dataEmPass));
        pass.setDataCarrega(datForm2.format(dataEmPass));
        pass.setDataEmissaoPass(datForm2.format(dataEmPass));
//        System.out.println(pass.getDataEspira());
//        System.out.println(pass.getDataEmissaoPass());
        
        System.out.print("\tset-name -> ");
		nam = read.nextLine();
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-data-nascimento (dd/mm/aaaa) -> "); dataNasc = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataNasc);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataNascimento(datForm1.format(date));
	        } catch (Exception ex) {
	        	i=1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }if(i==0) {
	        	ver= false;
	        }
			
		}
		pass.setIdade(pass.getDataNascimento(), pass.getDataEmissaoPass());
		System.out.print("\tset-email -> ");
		email = read.nextLine();
		pass.setEmail(email);
		System.out.print("\tset-morada -> ");
		morada = read.nextLine();
		pass.setMorada(morada);
		System.out.print("\tset-nacionalidade -> ");
		nacio = read.nextLine();
		pass.setNacionalidade(nacio);
		System.out.print("\tset-Tipo-Doc-ID-> ");
		pass.setTipoDoc();
		ver = true;
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-Data_Emissão_Documento_ID (dd/mm/aaaa) -> "); dataEmi = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataEmi);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataEmissaoDoc(datForm1.format(date));
	        } catch (Exception ex) {
	        	i = 1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }
			if(i==0) {
				ver = false;
			}
		}
		System.out.print("\tset-numero_Identificação -> ");
		nrID = read.nextInt();
		pass.setNrIdentifi(nrID);
		System.out.print("\tset-telefone -> ");
		telefone = read.nextInt();
		pass.setTelefone(telefone);
		pass.carregarPass();
		pass.setChave(nam,pass.getDataNascimento(), cod);
//		System.out.println(pass.getChave());
		return pass;
	}
	/**
	 * Metedo createFuncionarioPass
	 * @param cod
	 * @return pass
	 * */
	public static Funcionario createFuncionarioPass(int cod) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String nam;
		String morada;
		String email;
		String nacio;
		String dataEmi;//data de emissão do documento de ID
		String dataNasc;
		int nrID;
		int  telefone;
		double sal=0;
		boolean ver = true;
		
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();// data de emissão do documento de identificação
        DateFormat datForm2 = DateFormat.getDateInstance();
        Funcionario pass = new Funcionario(cod, sal, datForm2.format(dataEmPass));
        pass.setDataCarrega(datForm2.format(dataEmPass));
        pass.setDataEmissaoPass(datForm2.format(dataEmPass));
//        System.out.println(pass.getDataEspira());
//        System.out.println(pass.getDataEmissaoPass());
        
        System.out.print("\tset-name -> ");
		nam = read.nextLine();
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-data-nascimento (dd/mm/aaaa) -> "); dataNasc = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataNasc);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataNascimento(datForm1.format(date));
	        } catch (Exception ex) {
	        	i=1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }if(i==0) {
	        	ver= false;
	        }
			
		}
		pass.setIdade(pass.getDataNascimento(), pass.getDataEmissaoPass());
		System.out.print("\tset-email -> ");
		email = read.nextLine();
		pass.setEmail(email);
		System.out.print("\tset-morada -> ");
		morada = read.nextLine();
		pass.setMorada(morada);
		System.out.print("\tset-nacionalidade -> ");
		nacio = read.nextLine();
		pass.setNacionalidade(nacio);
		System.out.print("\tset-Tipo-Doc-ID-> ");
		pass.setTipoDoc();
		ver = true;
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-Data_Emissão_Documento_ID (dd/mm/aaaa) -> "); dataEmi = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataEmi);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataEmissaoDoc(datForm1.format(date));
	        } catch (Exception ex) {
	        	i = 1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }
			if(i==0) {
				ver = false;
			}
		}
		System.out.print("\tset-numero_Identificação -> ");
		nrID = read.nextInt();
		pass.setNrIdentifi(nrID);
		System.out.print("\tset-telefone -> ");
		telefone = read.nextInt();
		pass.setTelefone(telefone);
		pass.carregarPass();
		pass.setChave(nam,pass.getDataNascimento(), cod);
//		System.out.println(pass.getChave());
		return pass;		
	}
	/**
	 * Metedo createTerceiraIdadePass
	 * @param cod
	 * @return pass
	 * */
	public static TerceiraIdade createTerceiraIdadePass(int cod) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String nam;
		String morada;
		String email;
		String nacio;
		String dataEmi;//data de emissão do documento de ID
		String dataNasc;
		int nrID;
		int  telefone;
		double sal=0;
		boolean ver = true;
		
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();// data de emissão do documento de identificação
        DateFormat datForm2 = DateFormat.getDateInstance();
        TerceiraIdade pass = new TerceiraIdade(cod, sal, datForm2.format(dataEmPass));
        pass.setDataCarrega(datForm2.format(dataEmPass));
        pass.setDataEmissaoPass(datForm2.format(dataEmPass));
//        System.out.println(pass.getDataEspira());
//        System.out.println(pass.getDataEmissaoPass());
        
        System.out.print("\tset-name -> ");
		nam = read.nextLine();
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-data-nascimento (dd/mm/aaaa) -> "); dataNasc = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataNasc);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataNascimento(datForm1.format(date));
	        } catch (Exception ex) {
	        	i=1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }if(i==0) {
	        	ver= false;
	        }
			
		}
		pass.setIdade(pass.getDataNascimento(), pass.getDataEmissaoPass());
		System.out.print("\tset-email -> ");
		email = read.nextLine();
		pass.setEmail(email);
		System.out.print("\tset-morada -> ");
		morada = read.nextLine();
		pass.setMorada(morada);
		System.out.print("\tset-nacionalidade -> ");
		nacio = read.nextLine();
		pass.setNacionalidade(nacio);
		System.out.print("\tset-Tipo-Doc-ID-> ");
		pass.setTipoDoc();
		ver = true;
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-Data_Emissão_Documento_ID (dd/mm/aaaa) -> "); dataEmi = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataEmi);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDataEmissaoDoc(datForm1.format(date));
	        } catch (Exception ex) {
	        	i = 1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }
			if(i==0) {
				ver = false;
			}
		}
		System.out.print("\tset-numero_Identificação -> ");
		nrID = read.nextInt();
		pass.setNrIdentifi(nrID);
		System.out.print("\tset-telefone -> ");
		telefone = read.nextInt();
		pass.setTelefone(telefone);
		pass.carregarPass();
		pass.setChave(nam,pass.getDataNascimento(), cod);
//		System.out.println(pass.getChave());
		return pass;
	}
	/**
	 * Metedo validarPass
	 * @param pass
	 * @return true
	 * @return false
	 * */
	public static boolean validarPass(Epass pass) {
		if(pass instanceof Student) {
			if(pass.getSaldo() >=20) {
				if(((Student) pass).validoPass()==true) {
					return true;
				}
			}
			else{
				return false;
			}
		}
		else if(pass instanceof Jovem) {
			if(((Jovem) pass).validoPass()==true) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(pass instanceof Funcionario) {
			if(((Funcionario) pass).validoPass()==true) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(pass instanceof TerceiraIdade) {
			if(((TerceiraIdade) pass).validoPass()==true) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(pass instanceof Fest) {
			if(((Fest) pass).getSaldo()>=40) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(((Turista) pass).getSaldo()>=50) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	/**
	 * Metedo createStudentPass
	 * @param pass
	 * @param read
	 * @return true
	 * @return false
	 * */
	public static boolean pagarViagem(Epass pass, Scanner read) {
		if(pass instanceof Student) {
			if(pass.getSaldo() >=20) {
				((Student) pass).payTravel();
				((Student) pass).setNrViagens();
				return true;
			}
			else if(((Student) pass).getViagensFree()>=1) {
				String zona;
				System.out.print("\tset-zona-destino -> ");zona = read.nextLine();
				if(((Student) pass).verificarZona(zona)==true) {
					((Student) pass).setNrViagens();
					((Student) pass).useFreeTravel();
					return true;
				}
				else {
					((Student) pass).getZonasPermitida();
					return false;
				}
			}
			else if(((Student) pass).usePontos()==true) {
				return true;
			}
			else{
				return false;
			}
		}
		else if(pass instanceof Jovem) {
			if(((Jovem) pass).validoPass()==true) {
				((Jovem) pass).setNrViagens();
				return true;
			}
			else if(((Jovem) pass).usePontos()==true) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(pass instanceof Funcionario) {
			if(((Funcionario) pass).validoPass()==true) {
				((Funcionario) pass).setNrViagens();
				return true;
			}
			else if(((Funcionario) pass).usePontos()==true) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(pass instanceof TerceiraIdade) {
			if(((TerceiraIdade) pass).validoPass()==true) {
				((TerceiraIdade) pass).setNrViagens();
				return true;
			}
			else if(((TerceiraIdade) pass).usePontos()==true) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(pass instanceof Fest) {
			if(pass.getSaldo() >=40) {
				((Fest) pass).payTravel();
				return true;
			}
			else{
				return false;
			}
		}
		else {
			if(((Turista) pass).getSaldo()>=50) {
				((Turista) pass).payTravel();
				return true;
			}
			else {
				return false;
			}
		}
	}
	/**
	 * Metedo createFestPass
	 * @param cod
	 * @return pass
	 * */
	public static Fest createFestPass(int cod) {

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		double sal=0;
		String nomeEvent;
		String dataInicio;
		String dataFim;
		double saldoFest;
		boolean ver = true;
		
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();// data de emissão do documento de identificação
        DateFormat datForm2 = DateFormat.getDateInstance();
        Fest pass = new Fest(cod, sal, datForm2.format(dataEmPass));
        pass.setDataEmissaoPass(datForm2.format(dataEmPass));
        System.out.print("\tset_nome_Event -> ");
		nomeEvent = read.nextLine();
		pass.setNomeEvent(nomeEvent);
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-Data_Inicio_Event (dd/mm/aaaa) -> "); dataInicio = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataInicio);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDateInico(datForm1.format(date));
	        } catch (Exception ex) {
	        	i = 1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }
			if(i==0) {
				ver = false;
			}
		}
		ver=true;
		while(ver) {
			int i=0;
			try {
				System.out.print("\tset-Data_Fim_Event (dd/mm/aaaa) -> "); dataFim = read.nextLine();
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = formatter.parse(dataFim);
	            DateFormat datForm1 = DateFormat.getDateInstance();
	            pass.setDateFim(datForm1.format(date));
	        } catch (Exception ex) {
	        	i = 1;
	            System.out.println("  #Erro:  formatação da data errada. Tente novamente.");
	        }
			if(i==0) {
				ver = false;
			}
		}
		System.out.print("\tset-Saldo-pass -> ");
		sal = read.nextDouble();
		pass.setSaldo(sal);
		System.out.print("\tset-Saldo-Fest -> ");
		saldoFest = read.nextDouble();
		pass.setSaldoFest(saldoFest);
		int ev;
		System.out.print("    #Note: \n    Se deseja adquirir o Bilhete do evento digite 1"
				+ "							 Se nao qualquel numero: \n   Escolha -> ");
		ev = read.nextInt();
		if(ev==1) {
			System.out.println("   #Success: Bilhete adquirido.");
		}
		return pass;
	}
	/**
	 * Metedo alterPass
	 * @param pass
	 * @param read
	 * @return true
	 * @return false
	 * */
	public static boolean alterPass(Epass pass, Scanner read) {
		int esc;
		if(pass instanceof Student) {
			System.out.println("\tEscolha o campo que deseja alterar no Titular do pass: ");
			while(true) {
				System.out.println("\t\t< 1 > Nome");
				System.out.println("\t\t< 2 > Numero telefone");
				System.out.println("\t\t< 3 > Ano Escolaridade");
				System.out.println("\t\t< 4 > Morada");
				System.out.println("\t\t< 5 > E-mail");
				System.out.println("\t\t< 6 > Nome escola onde estuda");
				System.out.print("\tEscolha -> "); esc = read.nextInt();
				if((esc >= 1)&&(esc<=6)) {
					break;
				}
			}
			switch(esc) {
			  case 1:
				    String nome; 
				    System.out.print("\tset-new-Name -> "); nome = read.nextLine();
				    ((Student) pass).setNome(nome);
				    break;
			  case 2:
					int telf; 
					System.out.print("\tset-new-Numero-Telefone -> "); telf = read.nextInt();
					((Student) pass).setTelefone(telf);
					break;
			  case 3:
				  	int escl; 
					System.out.print("\tset-new-ano-Escolaridade -> "); escl = read.nextInt();
					((Student) pass).setAnoEsc(escl);
				    break;
			  case 4:
				  	String morad; 
				    System.out.print("\tset-new-Morada -> "); morad = read.nextLine();
				    ((Student) pass).setMorada(morad);
				    break;
			  case 5:
				  	String email; 
				    System.out.print("\tset-new-Email -> "); email = read.nextLine();
				    ((Student) pass).setEmail(email);
				    break;
			  case 6:
				  	String nomeEsc; 
				    System.out.print("\tset-new-Name-Escola -> "); nomeEsc = read.nextLine();
				    ((Student) pass).setNomeEscola(nomeEsc);
				    break;
			  default:
			    System.out.println("   #Erro: Escolha.");
			}
			return true;
		}
		else if(pass instanceof Jovem) {
			System.out.println("\tEscolha o campo que deseja alterar no Titular do pass: ");
			while(true) {
				System.out.println("\t\t< 1 > Nome");
				System.out.println("\t\t< 2 > Numero telefone");
				System.out.println("\t\t< 3 > Morada");
				System.out.println("\t\t< 4 > E-mail");
				System.out.print("\tEscolha -> "); esc = read.nextInt();
				if((esc >= 1)&&(esc<=4)) {
					break;
				}
			}
			switch(esc) {
			  case 1:
				    String nome; 
				    System.out.print("\tset-new-Name -> "); nome = read.nextLine();
				    ((Jovem) pass).setNome(nome);
				    break;
			  case 2:
					int telf; 
					System.out.print("\tset-new-Numero-Telefone -> "); telf = read.nextInt();
					((Jovem) pass).setTelefone(telf);
					break;
			  case 3:
				  	String morad; 
				    System.out.print("\tset-new-Morada -> "); morad = read.nextLine();
				    ((Jovem) pass).setMorada(morad);
				    break;
			  case 4:
				  	String email; 
				    System.out.print("\tset-new-Email -> "); email = read.nextLine();
				    ((Jovem) pass).setEmail(email);
				    break;
			  default:
			    System.out.println("   #Erro: Escolha.");
			}
			return true;
		}
		else if(pass instanceof Funcionario) {
			System.out.println("\tEscolha o campo que deseja alterar no Titular do pass: ");
			while(true) {
				System.out.println("\t\t< 1 > Nome");
				System.out.println("\t\t< 2 > Numero telefone");
				System.out.println("\t\t< 3 > Morada");
				System.out.println("\t\t< 4 > E-mail");
				System.out.print("\tEscolha -> "); esc = read.nextInt();
				if((esc >= 1)&&(esc<=4)) {
					break;
				}
			}
			switch(esc) {
			  case 1:
				    String nome; 
				    System.out.print("\tset-new-Name -> "); nome = read.nextLine();
				    ((Funcionario) pass).setNome(nome);
				    break;
			  case 2:
					int telf; 
					System.out.print("\tset-new-Numero-Telefone -> "); telf = read.nextInt();
					((Funcionario) pass).setTelefone(telf);
					break;
			  case 3:
				  	String morad; 
				    System.out.print("\tset-new-Morada -> "); morad = read.nextLine();
				    ((Funcionario) pass).setMorada(morad);
				    break;
			  case 4:
				  	String email; 
				    System.out.print("\tset-new-Email -> "); email = read.nextLine();
				    ((Funcionario) pass).setEmail(email);
				    break;
			  default:
			    System.out.println("   #Erro: Escolha.");
			}
			return true;
		}
		else if(pass instanceof TerceiraIdade) {
			System.out.println("\tEscolha o campo que deseja alterar no Titular do pass: ");
			while(true) {
				System.out.println("\t\t< 1 > Nome");
				System.out.println("\t\t< 2 > Numero telefone");
				System.out.println("\t\t< 3 > Morada");
				System.out.println("\t\t< 4 > E-mail");
				System.out.print("\tEscolha -> "); esc = read.nextInt();
				if((esc >= 1)&&(esc<=4)) {
					break;
				}
			}
			switch(esc) {
			  case 1:
				    String nome; 
				    System.out.print("\tset-new-Name -> "); nome = read.nextLine();
				    ((TerceiraIdade) pass).setNome(nome);
				    break;
			  case 2:
					int telf; 
					System.out.print("\tset-new-Numero-Telefone -> "); telf = read.nextInt();
					((TerceiraIdade) pass).setTelefone(telf);
					break;
			  case 3:
				  	String morad; 
				    System.out.print("\tset-new-Morada -> "); morad = read.nextLine();
				    ((TerceiraIdade) pass).setMorada(morad);
				    break;
			  case 4:
				  	String email; 
				    System.out.print("\tset-new-Email -> "); email = read.nextLine();
				    ((TerceiraIdade) pass).setEmail(email);
				    break;
			  default:
			    System.out.println("   #Erro: Escolha.");
			}
			return true;
		}
		else if(pass instanceof Fest) {
			System.out.println("\tEscolha o campo que deseja alterar nas informações do pass: ");
			while(true) {
				System.out.println("\t\t< 1 > Nome Evento");
				System.out.println("\t\t< 2 > Saldo Fest");
				System.out.print("\tEscolha -> "); esc = read.nextInt();
				if((esc >= 1)&&(esc<=2)) {
					break;
				}
			}
			switch(esc) {
			  case 1:
				    String nomeEvent; 
				    System.out.print("\tset-new-Name-Event -> ");
				    nomeEvent = read.nextLine();
				    ((Fest) pass).setNomeEvent(nomeEvent);
				    break;
			  case 2:
					double saldoFest; 
					System.out.print("\tset-new-saldo-fest -> ");
					saldoFest = read.nextInt();
					((Fest) pass).setSaldoFest(saldoFest);
					break;
			  default:
			    System.out.println("   #Erro: Escolha.");
			}
			return true;
		}
		else if(pass instanceof Turista) {
			System.out.println("\tEscolha o tipo de passe deste tipo para qual deseja alterar.");
			((Turista) pass).setTipoPass();
			return true;
		}
		return false;
	}
	/**
	 * Metedo createTuristaPass
	 * @param cod
	 * @return pass
	 * */
	public static Turista createTuristaPass(int cod) {
//		@SuppressWarnings("resource")
//		Scanner read = new Scanner(System.in);
		double sal=0;
		Calendar c = Calendar.getInstance();
        Date dataEmPass = c.getTime();// data de emissão do documento de identificação
        DateFormat datForm2 = DateFormat.getDateInstance();
        Turista pass = new Turista(cod, sal, datForm2.format(dataEmPass));
        pass.setDataEmissaoPass(datForm2.format(dataEmPass));
        pass.setTipoPass();
		return pass;
	}
	/**
	 * Metedo verificarCmd
	 * @param cmd
	 * @param tiposPase
	 * @param comands
	 * @return true
	 * @return false
	 * */
 	public static boolean verificarCmd(String cmd, String[] tiposPase, String[] comands) {;
		String[] cmd_ext = new String[30];
		boolean aux1=false,aux2=aux1,aux3=aux1,
				aux4=aux1, aux5=aux1, aux6=aux1,
				aux7=aux6, aux8=aux7, aux9=aux8;
		int i;
		
		cmd_ext = cmd.split(" ");
		if((cmd_ext.length-1) > 0) {
			for(i=0;i<comands.length;i++) {
				if(cmd_ext[0].equals(comands[i])) {
					aux1=true;
				}
			}
		}
		if(((cmd_ext.length-1) > 0)&&((cmd_ext.length-1) < 2)) {
			for(i=0;i<tiposPase.length;i++) {
				if(cmd_ext[1].equals(tiposPase[i])) {
					aux2=true;
				}
			}
		}
		if(((cmd_ext.length-1) > 0)&&((cmd_ext.length-1) < 2)) {
			try {
				Integer.parseInt(cmd_ext[1]);
				aux3=true;
			}catch (NumberFormatException ex) {
				aux3 = false;	
			}
		}
		if((cmd_ext.length-1) >= 2) {
			try {
				Integer.parseInt(cmd_ext[1]);
				aux7=true;
			}catch (NumberFormatException ex) {
				aux7 = false;	
			}
		}
		if((cmd_ext.length-1) >= 2) {
			try {
				Integer.parseInt(cmd_ext[2]);
				aux5=true;
			}catch (NumberFormatException ex) {
				aux5 = false;	
			}
		}
		if((cmd_ext.length-1) > 2) {
			try {
				Integer.parseInt(cmd_ext[3]);
				aux6=true;
			}catch (NumberFormatException ex) {
				aux6 = false;	
			}
		}
		
		if((cmd_ext.length-1) == 0) {
			for(i=0;i<comands.length;i++) {
				if(cmd_ext[0].equals("help")) {
					aux4=true;
				}
			}
		}
		if((cmd_ext.length-1) <= 2) {
			aux8=true;
		}
		if((cmd_ext.length-1) <= 3) {
			aux9=true;
		}
		if(((aux1 == true) && (aux5 == true)&&(aux6 == true)&&(aux7==true)&&(aux9==true)) || ((aux1 == true) && (aux2 == true))
				|| ((aux1 == true) && (aux3 == true)) || (aux4 == true) || 
				((aux1==true)&&(aux7==true)&&(aux5==true)&&(aux8==true))) {
			return true;
		}
		else {
			return false;
		}
	}
 	/**
	 * Metedo para monstrar os comandos disponiveis no sistema
	 * */
 	public static void helpComands(String[] comands, String[] pass) {
 		System.out.println("\tOs comandos do sistema são: ");
 		for(String item: comands) {
 			System.out.println("\t\t- "+item);
 		}
 		System.out.println("\tOs tipos de passes do sistema são: ");
 		for(String item: pass) {
 			System.out.println("\t\t- "+item);
 		}
 		System.out.println("");
 		System.out.println("\tComo funciona e exemplos: \n");
 		System.out.println("\t1 - create-pass:");
 		System.out.println("\t -> create-pass nome_tipo_pass");
 		System.out.println("\tExemplo: ");
 		System.out.println("\t -> create-pass student");
 		System.out.println("\t\n");
 		System.out.println("\t2 - recharge-pass:");
 		System.out.println("\t -> recharge-pass codigo_pass");
 		System.out.println("\tExemplo: ");
 		System.out.println("\t -> recharge-pass 1");
 		System.out.println("\t\n");
 		System.out.println("\t3 - validate-pass:");
 		System.out.println("\t -> recharge-pass codigo_pass");
 		System.out.println("\tExemplo: ");
 		System.out.println("\t -> validate-pass 1");
 		System.out.println("\t\n");
 		System.out.println("\t4 - pay-travel:");
 		System.out.println("\t -> pay-travel codigo_pass");
 		System.out.println("\tExemplo: ");
 		System.out.println("\t -> pay-travel 1");
 		System.out.println("\t\n");
 		System.out.println("\t5 - alter-pass:");
 		System.out.println("\t -> alter-pass codigo_pass");
 		System.out.println("\tExemplo: ");
 		System.out.println("\t -> alter-pass 1");
 		System.out.println("\t\n");
 		System.out.println("\t6 - transfer-balance:");
 		System.out.println("\t -> transfer-balance codigo_pass_origem valor_a_trnaferir codigo_pass_destino");
 		System.out.println("\tExemplo: ");
 		System.out.println("\t -> transfer-balance 1 2500 2");
 		System.out.println("\t\n");
 		System.out.println("\t7 - help:");
 		System.out.println("\t -> help");
 	}
 	
 	public static void topBar() {
 		System.out.println("    \t      ----- Benvindo ao PaDi -----");
 		System.out.println("\tDigite comandos do sistema para começar.");
 		System.out.println("Para fornecimento de qualquer ajuda digitar o comando help\n");
 	}
 	/**
	 * O main do programa
	 * @param args
	 * */
	public static void main(String[] args) {
		ArrayList<Epass> allPass = new ArrayList<Epass>();
		int codStan = 1;
		final String[] comands = {"create-pass", "recharge-pass", "validate-pass",
									"pay-travel", "alter-pass", "transfer-balance", "help"};
		final String[] tiposPase = {"student", "jovem", "funcionario", "terceira_idade", "fest", "turista"};
		Jovem pass_jov;
		Funcionario pass_fun;
		TerceiraIdade pass_ter;
		Fest pass_fes;
		Turista pass_tur;
		Scanner read = new Scanner(System.in);
		String[] cmd_ext = new String[30];
		String cmd;
		topBar();
		while(true) {
			System.out.print(" -> ");
			cmd = read.nextLine();
			cmd_ext = cmd.split(" ");
			if(verificarCmd(cmd, tiposPase, comands) == true) {
				
				//comando demo:
//				-> create-pass tipo
				if(cmd_ext[0].equals(comands[0])) {
					if(cmd_ext[1].equals(tiposPase[0])) {
						Student pass_stu;
						pass_stu = createStudentPass(codStan);
						allPass.add(pass_stu);
						System.out.println("   #Success: Pass Student criado.");
						System.out.println("   #Info: Pass com codigo: "+ +codStan);
						System.out.println("   #Info: Pass com chave: "+ pass_stu.getChave());
					}
					else if(cmd_ext[1].equals(tiposPase[1])) {
						pass_jov = createJovemPass(codStan);
						allPass.add(pass_jov);
						System.out.println("   #Success: Pass Jovem criado.");
						System.out.println("   #Info: Pass com codigo: "+ +codStan);
						System.out.println("   #Info: Pass com chave: "+ pass_jov.getChave());
					}
					else if(cmd_ext[1].equals(tiposPase[2])) {
						pass_fun = createFuncionarioPass(codStan);
						allPass.add(pass_fun);
						System.out.println("   #Success: Pass Funcionario criado.");
						System.out.println("   #Info: Pass com codigo: "+ +codStan);
						System.out.println("   #Info: Pass com chave: "+ pass_fun.getChave());
					}
					else if(cmd_ext[1].equals(tiposPase[3])) {
						pass_ter = createTerceiraIdadePass(codStan);
						allPass.add(pass_ter);
						System.out.println("   #Success: Pass Terceira Idade criado. ");
						System.out.println("   #Info: Pass com codigo: "+ +codStan);
						System.out.println("   #Info: Pass com chave: "+ pass_ter.getChave());
					}
					else if(cmd_ext[1].equals(tiposPase[4])) {
						pass_fes = createFestPass(codStan);
						allPass.add(pass_fes);
						System.out.println("   #Success: Pass Fest criado.");
						System.out.println("   #Info: Pass com codigo: "+ +codStan);
						System.out.println("   #Info: Pass com chave: "+ pass_fes.getChave());
					}
					else if(cmd_ext[1].equals(tiposPase[5])) {
						pass_tur = createTuristaPass(codStan);
						allPass.add(pass_tur);
						System.out.println("   #Success: Pass Turista criado. ");
						System.out.println("   #Info: Pass com codigo: "+ +codStan);
						System.out.println("   #Info: Pass com chave: "+ pass_tur.getChave());
					}
					codStan += 1;
				}
				
				//comando demo:
//				-> recharge-pass cod saldo
				else if(cmd_ext[0].equals(comands[1])) {
					boolean existPass = false;
					double sal;
					for(Epass pass: allPass) {
						if(pass.getCodigo()==Integer.parseInt(cmd_ext[1])) {
							existPass = true;
							if(pass instanceof Turista) {
								System.out.println("   #Note: Não é possivel recarregar passes deste tipo.");
							}
							else if(pass instanceof Fest) {
								double sal1;
								System.out.print("\tset-saldo-Pass -> ");sal = read.nextDouble();
								System.out.print("\tset-saldo-Fest -> ");sal1 = read.nextDouble();
						        pass.setSaldo(sal);
						        ((Fest) pass).setSaldoFest(sal1);
							}
							else if(pass instanceof Student) {
								System.out.print("\tset-saldo-Pass -> ");sal = read.nextDouble();
								((Student) pass).setViagensFree();
								Calendar c = Calendar.getInstance();
						        Date dataEmPass = c.getTime();
						        DateFormat datForm2 = DateFormat.getDateInstance();
						        ((Student) pass).setDataCarrega(datForm2.format(dataEmPass));
						        pass.setSaldo(sal);
						        System.out.println("   #Success: Pass codigo: "+pass.getCodigo()+" carregado.");	
								System.out.println("   #Success: Saldo atual: "+pass.getSaldo()+"$00");	
							}
							else if(pass instanceof Jovem){
								Calendar c = Calendar.getInstance();
						        Date dataEmPass = c.getTime();
						        DateFormat datForm2 = DateFormat.getDateInstance();
						        ((Jovem) pass).setDataCarrega(datForm2.format(dataEmPass));
						        ((Jovem) pass).carregarPass();
								System.out.println("   #Success: Pass codigo: "+pass.getCodigo()+" carregado.");	
								System.out.println("   #Success: Saldo atual: "+pass.getSaldo()+"$00");	
							}
							else if(pass instanceof Funcionario){
								Calendar c = Calendar.getInstance();
						        Date dataEmPass = c.getTime();
						        DateFormat datForm2 = DateFormat.getDateInstance();
						        ((Funcionario) pass).setDataCarrega(datForm2.format(dataEmPass));
						        ((Funcionario) pass).carregarPass();
								System.out.println("   #Success: Pass codigo: "+pass.getCodigo()+" carregado.");	
								System.out.println("   #Success: Saldo atual: "+pass.getSaldo()+"$00");	
							}
							else {
								Calendar c = Calendar.getInstance();
						        Date dataEmPass = c.getTime();
						        DateFormat datForm2 = DateFormat.getDateInstance();
						        ((TerceiraIdade) pass).setDataCarrega(datForm2.format(dataEmPass));
						        ((TerceiraIdade) pass).carregarPass();
								System.out.println("   #Success: Pass codigo: "+pass.getCodigo()+" carregado.");	
								System.out.println("   #Success: Saldo atual: "+pass.getSaldo()+"$00");	
							}
						}
					}
					if(existPass==false) {
						System.out.println("   #Erro: Pass não existe.");
					}
				}
				
				//camando demo:
//				-> validate-pass cod
				else if(cmd_ext[0].equals(comands[2])) {
					boolean existPass = false;
					for(Epass pass: allPass) {
						if(pass.getCodigo()==Integer.parseInt(cmd_ext[1])) {
							existPass = true;
							if(validarPass(pass)==true) {
								System.out.println("   #Success: Pass válido.");
							}
							else {
								System.out.println("   #Failure: Pass inválido.");
							}
						}
					}
					if(existPass==false) {
						System.out.println("   #Erro: Pass não existe.");
					}
				}
				
				//comando demo:
//				-> pay-travel cod
				else if(cmd_ext[0].equals(comands[3])) {
					boolean existPass = false;
					for(Epass pass: allPass) {
						if(pass.getCodigo()==Integer.parseInt(cmd_ext[1])) {
							existPass = true;
							if(pagarViagem(pass, read)==true) {
								System.out.println("   #Success: Viagem paga.");
							}
							else {
								System.out.println("   #Failure: Não é possivel pagar a viagem.");
							}
						}
					}
					if(existPass==false) {
						System.out.println("   #Erro: Pass não existe.");
					}
				}
				
				//comando demo:
//				-> alter-pass cod
				else if(cmd_ext[0].equals(comands[4])) {
					boolean existPass = false;
					for(Epass pass: allPass) {
						if(pass.getCodigo()==Integer.parseInt(cmd_ext[1])) {
							existPass = true;
							if(alterPass(pass, read)==true) {
								System.out.println("   #Success: Pass Alterado.");
							}
							else {
								System.out.println("   #Failure: Não é possivel alterar o pass.");
							}
						}
					}
					if(existPass==false) {
						System.out.println("   #Erro: Pass não existe.");
					}
				}
				
				
				//comando demo:
//				-> transfer-balance cod_origem qtsald cod_destino
				else if(cmd_ext[0].equals(comands[5])) {
					boolean existPassOrig = false, existPassDest= false;
					double sald = Integer.parseInt(cmd_ext[2]);
					for(Epass passOrigem: allPass) {
						if(passOrigem.getCodigo()==Integer.parseInt(cmd_ext[1])) {
							if(passOrigem instanceof Turista) {
								System.out.println("   #Erro: Não é permitido tranferência apartir deste tipo de pass.");
							}
							else {
								if(passOrigem.getSaldo()>=((double)sald)) {
									passOrigem.setTransferSaldo(sald);
									existPassOrig = true;
								}
							}
						}
					}
					if(existPassOrig == true) {
						for(Epass passDestino: allPass) {
							if(passDestino.getCodigo()==Integer.parseInt(cmd_ext[3])) {
								if(passDestino instanceof Turista) {
									System.out.println("   #Erro: Não é permitido tranferência para este tipo de pass.");
								}
								else {
									passDestino.setSaldo((double)sald);
									existPassDest=true;
								}
							}
						}
					}
					if((existPassDest==false)&&(existPassOrig==true)) {
						for(Epass passOrigem: allPass) {
							if(passOrigem.getCodigo()==Integer.parseInt(cmd_ext[1])) {
								passOrigem.setSaldo((double)sald);
							}
						}
					}
					if((existPassOrig==false)||(existPassDest==false)) {
						System.out.println("   #Erro: Não é possivel fazer transferência.");
					}
					else {
						System.out.println("   #Success: Transferência bem sucessida.");
					}
				}
				
				//comando demo:
//				-> transfer-balance cod_origem qtsald cod_destino
				else if(cmd_ext[0].equals(comands[6])) {
					helpComands(comands, tiposPase);
				}
			}
			else if(verificarCmd(cmd, tiposPase, comands) == false) {
				System.out.println("Erro de comando");
			}
		}
	}
}