package library;

public class Usuario {
	private
	String nome;
	String password;
	
	

	public Usuario(String nome, String senha) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.password = senha;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	
	}
	void cadastrar(String nome)
	{
		this.nome = nome;
	}
	
	void Nome(String nome)
	{
		this.nome = nome;
	}
	
	public String Nome()
	{
		return this.nome;
	}
	
	void Password(String senha)
	{
		this.password = senha;
	}
	
	String Password()
	{
		return password;
	}
	
	public boolean checkUser(String nome, String senha)
	{
		
		return nome.equals(this.nome) && senha.equals(this.password);
	}
}


