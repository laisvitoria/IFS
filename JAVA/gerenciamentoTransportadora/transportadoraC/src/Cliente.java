import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
	
	//declaração dos atributos
	private int CodigoCliente; // Codigo do cliente
	private String Nome; // nome do cliente
	private String Cpfcnpj; // cpf ou cnpj do cliente
	private String SexoCliente; // sexo do cliente
	private String Email; // email do cliente
	private String Contato; // contato do cliente
	private String Endereco; // endereço do cliente
	private String url = "jdbc:postgresql://localhost:5432/transportadoraC"; // url do banco de dados
	private String usuario = "postgres"; // usuario do banco de dados
	private String senha = "postgres"; // senha do banco de dados
	private Connection conexao = null;//faz a conexão com o banco de dados
	
	
	//METODO CONSTRUTOR
	public Cliente() throws SQLException {
		 this.conexao = DriverManager.getConnection(this.getUrl(),this.getUsuario(),this.getSenha());
		 }
	
	//GET E SET
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	public int getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpfcnpj() {
		return Cpfcnpj;
	}
	public void setCpfcnpj(String cpfcnpj) {
		Cpfcnpj = cpfcnpj;
	}
	public String getSexoCliente() {
		return SexoCliente;
	}
	public void setSexoCliente(String sexoCliente) {
		SexoCliente = sexoCliente;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContato() {
		return Contato;
	}
	public void setContato(String contato) {
		Contato = contato;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	//***************************************************************************************************************************
	//************************METODOS PARA ACESSAR O BANCO DE DADOS**********************************
	
	// Insere dados na tabela Cliente
	public void cadastrar() throws SQLException {
		String sql;
		Statement statement = this.conexao.createStatement();
		sql = String.format("insert into Cliente values (%s,'%s','%s','%s','%s','%s','%s');",this.getCodigoCliente(),this.getNome(),
				this.getCpfcnpj(),this.getSexoCliente(),this.getEmail(),this.getContato(),this.getEndereco());
		statement.executeUpdate(sql);
	}
	
	// Exclui dados na tabela Cliente
	public void excluir() throws SQLException {
		 String sql;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("delete from Cliente where cdgCliente = %s;",this.getCodigoCliente());
		 statement.executeUpdate(sql);
	}
	
	// busca dados na tabela Cliente
	public ResultSet consultar() throws SQLException {
		String sql;
		ResultSet dados = null;
		Statement statement = this.conexao.createStatement();
		sql = String.format("Select * from Cliente where cdgCliente = %s;",this.getCodigoCliente());
		dados = statement.executeQuery(sql);
		return dados;
	}


}
