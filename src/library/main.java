package library;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void Menu() {		
		System.out.println("\n1- LISTAR LIVROS DA BIBLIOTECA");
		System.out.println("2- CADASTRAR UM NOVO LIVRO");
		System.out.println("3- RETIRAR UM LIVRO");
		System.out.println("4- DEVOLVER LIVRO");
		System.out.println("5- SAIR");
		System.out.println("DIGITE UMAS DAS OPCOES ACIMA:");
	}	
	public static ArrayList<Livro> GerarLivrosPadrao() {
		
		ArrayList<Livro> book = new ArrayList<>();
		Livro b[] = new Livro[5];		
		
		for(int i =0; i< 5;i++) {
			b[i] = new Livro();
		}
		
		b[0].cadastrar(001,"Gerge R.R.Martin","A Dança dos dragões",2012,"disponivel",null);
		book.add(b[0]);
		b[1].cadastrar(002,"Gerge R.R.Martin","A Tormenta das Espadas",2012,"disponivel",null);
		book.add(b[1]);
		b[2].cadastrar(003,"Gerge R.R.Martin","A Furia dos Reis",2012,"disponivel",null);
		book.add(b[2]);
		b[3].cadastrar(004,"Gerge R.R.Martin","A Guerra dos Tronos",2012,"disponivel",null);
		book.add(b[3]);
		b[4].cadastrar(005,"Gerge R.R.Martin","O Festim dos Corvos",2012,"disponivel",null);
		book.add(b[4]);
		return book;
		
	}	
	public static void ListarLivros(ArrayList<Livro> l) {
		
		for(int i=0;i<l.size();i++)
		{
			int x = i+1;
			System.out.println("\n"+ x +"\n00"+ l.get(i).id +"\nTITULO - "+ l.get(i).titulo + "\nAUTOR -"+ l.get(i).autor + 
					"\nANO - " + l.get(i).ano + "\nSTATUS - "+l.get(i).status + "\nEMPRESTADO PARA - " + 
					l.get(i).emprestadoPara);
		}		
		
	}
	public static void retiraLivro(ArrayList<Livro> l,Usuario user) {
		ListarLivros(l);
		int op = 0;
		boolean disponivel = false ;
		do
		{
			System.out.println("\nDIGITE O LIVRO DESEJAVEL");
			Scanner ler = new Scanner(System.in);
			op = ler.nextInt();
			if(op >= 6 || op < 1) {
				
				System.out.println(" OPÇÃO INVALIDA ");
				disponivel = false;
			}
			else 
			{
				if(l.get(op - 1).status == "indisponivel") {
					System.out.println("LIVRO INDISPONIVEL ESTE LIVRO ESTA COM " + l.get(op - 1).emprestadoPara );
					disponivel = false;
				}
				else
				{
					l.get(op - 1).Retirar(user.nome);
					System.out.println(" O LIVRO " + l.get(op - 1).titulo + " FOI RETIRADO");
					disponivel = true;
				}				
			}			
			
			
		}while(!disponivel);
	}
	public static Usuario CadastrarUsuario() {
		
		Usuario u1 = new Usuario();
		System.out.println("DIGITE SEU NOME DE USUARIO ");
		Scanner name = new Scanner(System.in);
		u1.cadastrar(name.next());
		System.out.println("SEJA BEM VINDO - "+ u1.nome); 
		
		return u1;
		
	}	
	public static void DevolverLivro(ArrayList<Livro> l)  {
		
		ArrayList<Livro> livroIndisponivel = new ArrayList<>();
		
		for(int i=0;i<l.size();i++)
		{
			
			if(l.get(i).status == "indisponivel") 
			{
				livroIndisponivel.add(l.get(i));
			}
		}
		
		for(int i=0;i<livroIndisponivel.size();i++) {
					
			int x = i+1;
			System.out.println("\n"+ x +"- TITULO - "+ livroIndisponivel.get(i).titulo);
		}
		
		if(livroIndisponivel.size()<=0)
		{
			System.out.println("NAO HA LIVRO PARA DEVOLVER");
		}
		else {
			int op = 0;
			boolean devolverVolume = false;
			
			do {				
				System.out.println("QUAIS DOS LIVROS DESEJA DEVOLVER");
				Scanner ler = new Scanner(System.in);
				op = ler.nextInt();
				
				if(op<=0 || op >=livroIndisponivel.size()+1)
				{
					System.out.println(" OPÇÃO INVALIDA ");
					devolverVolume = false;
				}
				else 
				{
					for(int i = 0;i< l.size();i++)
					{
						if(l.get(i).id == livroIndisponivel.get(op-1).id) 
						{
							l.get(i).Devolver();
							System.out.println("LIVRO "+ livroIndisponivel.get(op-1).titulo + " FOI DEVOLVIDO" );
							devolverVolume = true;
						}
						
					}
				}				
			}while(!devolverVolume);
			
		}
	
		
	}	
	public  static Livro Cadastrar_Book( int IdLivro) {
		Livro l = new Livro();
		
		String TitulodoLivro = new String();;
		String AutorLivro = new String();
		int AnoLivro = 0;


		
		System.out.println("\n CADASTRAR lIVRO\n");
		
		System.out.println("\nTITULO DO LIVRO -");
		Scanner ler = new Scanner(System.in);
		TitulodoLivro = ler.next();
		
		System.out.println("\nAUTOR DO LIVRO -");
		ler = new Scanner(System.in);
		AutorLivro = ler.next();
		
		System.out.println("\nANO DO LIVRO -");
		ler = new Scanner(System.in);
		AnoLivro = ler.nextInt();
		
		l.cadastrar(IdLivro, AutorLivro, TitulodoLivro, AnoLivro, "disponivel", null);
		
		return l;
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		int op = 0;
		ArrayList<Livro> BibliotecaBooks = new ArrayList<>();
		BibliotecaBooks = GerarLivrosPadrao();
		System.out.println("\n--------------------BIBLIOTECA DO BARRO ------------------------\n");
		
		Usuario user1 = CadastrarUsuario();
		
		do {		
		
		Menu();
		Scanner ler = new Scanner(System.in);
		op = ler.nextInt();
		
		switch (op) {
		case 1: 
			ListarLivros(BibliotecaBooks);
			break;
		case 2: 
			BibliotecaBooks.add(Cadastrar_Book(BibliotecaBooks.size()));
			System.out.println("LIVRO CADASTRADO");
			break;
		case 3:
			retiraLivro(BibliotecaBooks,user1);			
			break;		
		case 4: 
			DevolverLivro(BibliotecaBooks);
			break;
		case 5: //sai do app
			
			break;
		default:
			System.out.println(" OPÇÃO INVALIDA ");
		}
		
		}while(op!=5);
		System.out.print("end of code!");
		
	}

}
