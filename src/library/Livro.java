package library;

public class Livro {
	int id;
	String titulo;
	String autor;
	int ano;
	String status;
	String emprestadoPara;
	
	void cadastrar(int id, String autor, String titulo,int ano, String status, String emprestadoPara) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		this.ano = ano;
		this.status = status;
		this.emprestadoPara = emprestadoPara;
	}
	
	void Devolver() 
	{
		this.status = "disponivel";
		this.emprestadoPara = null;
	}
	
	void Retirar(String emprestadoPara) 
	{
		this.status = "indisponivel";
		this.emprestadoPara = emprestadoPara;
	}

}
