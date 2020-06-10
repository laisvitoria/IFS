import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produto {
	
	// variaveis utilizadas
	
	private int CodigoP; // codigo do produto
	private String DescricaoP; // descrição do produto
	private String DimensoesP; // dimensoes do produto
	private String PesoP; // peso do produto
	private String url = "jdbc:postgresql://localhost:5432/transportadoraC"; // url para acessar o banco de dados
	private String usuario = "postgres"; // usuario do banco de dados
	private String senha = "postgres"; // senha do banco de dados
	private Connection conexao = null; //faz a conexão com o banco de dados
	
	
	// Metodo Construtor
	public Produto() throws SQLException {
		 this.conexao = DriverManager.getConnection(this.getUrl(),this.getUsuario(),this.getSenha());
		 }
	
	// Get e set
	/**
	 * @return the pesoP
	 */
	public String getPesoP() {
		return PesoP;
	}

	/**
	 * @param pesoP the pesoP to set
	 */
	public void setPesoP(String pesoP) {
		PesoP = pesoP;
	}

	/**
	 * @return the codigoP
	 */
	public int getCodigoP() {
		return CodigoP;
	}

	/**
	 * @param codigoP the codigoP to set
	 */
	public void setCodigoP(int codigoP) {
		CodigoP = codigoP;
	}

	/**
	 * @return the descricaoP
	 */
	public String getDescricaoP() {
		return DescricaoP;
	}

	/**
	 * @param descricaoP the descricaoP to set
	 */
	public void setDescricaoP(String descricaoP) {
		DescricaoP = descricaoP;
	}

	/**
	 * @return the dimensoesP
	 */
	public String getDimensoesP() {
		return DimensoesP;
	}

	/**
	 * @param dimensoesP the dimensoesP to set
	 */
	public void setDimensoesP(String dimensoesP) {
		DimensoesP = dimensoesP;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the conexao
	 */
	public Connection getConexao() {
		return conexao;
	}

	/**
	 * @param conexao the conexao to set
	 */
	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	//*************************************************************************************************************************
	// ******************************************METODOS PARA ACESSAR AO BANCO DE DADOS ***************************************
	
	
	//Insere os dados na tabela Produto
	public void cadastrar() throws SQLException {
		String sql;
		Statement statement = this.conexao.createStatement();
		sql = String.format("insert into Produto values (%s,'%s','%s','%s');",this.getCodigoP(), this.getDescricaoP(),this.getDimensoesP(),this.getPesoP());
		statement.executeUpdate(sql);
		}
	
	// exclui dados da tabela Produto
	public void excluir() throws SQLException {
		 String sql;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("delete from Produto where cdgProduto = %s;",this.getCodigoP());
		 statement.executeUpdate(sql);
		 }
	
	//Consulta dados na tabela Produto
	public ResultSet consultar() throws SQLException {
		 String sql;
		 ResultSet dados = null;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("Select * from Produto where cdgProduto = %s;",this.getCodigoP());
		 dados = statement.executeQuery(sql);
		 return dados;

	}
}
