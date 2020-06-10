

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Veiculo {
	
	// declaração dos atributos
	private int codigoV; // codigo do veiculo
	private String marcaV;// marca do veiculo
	private String modeloV; // modelo do veiculo
	private String anoV; // ano do veiculo
	private int tipoV; // tipo do veiculo
	private String categoriaV; // categoria da carteira de motorista necessaria para dirigi-lo
	private String url = "jdbc:postgresql://localhost:5432/transportadoraC"; // url do banco de dados
	private String usuario = "postgres"; // usuario do banco de dados
	private String senha = "postgres"; // senha do banco de dados
	private Connection conexao = null;//faz a conexão com o banco de dados
	
	
	//METODO CONSTRUTOR
	public Veiculo() throws SQLException {
		 this.conexao = DriverManager.getConnection(this.getUrl(),this.getUsuario(),this.getSenha());
		 }
	
	//GET E SET
	public int getCodigoV() {
		return codigoV;
	}
	public void setCodigoV(int codigoV) {
		this.codigoV = codigoV;
		if (codigoV < 1) {
			codigoV = 1;
			}
	}
	public String getMarcaV() {
		return marcaV;
	}
	public void setMarcaV(String marcaV) {
		this.marcaV = marcaV;
	}
	public String getModeloV() {
		return modeloV;
	}
	public void setModeloV(String modeloV) {
		this.modeloV = modeloV;
	}
	public String getAnoV() {
		return anoV;
	}
	public void setAnoV(String anoV) {
		this.anoV = anoV;
	}
	public int getTipoV() {
		return tipoV;
	}
	public void setTipoV(int tipoV) {
		this.tipoV = tipoV;
	}
	public String getCategoriaV() {
		return categoriaV;
	}
	public void setCategoriaV(String categoriaV) {
		this.categoriaV = categoriaV;
	}
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

	//*************************************************************************************************************************
	//********************METODOS PARA ACESSAR O BANCO DE DADOS********************************** 

	//Insere os dados na tabela Veiculo
	public void cadastrar() throws SQLException {
		String sql;
		Statement statement = this.conexao.createStatement();
		sql = String.format("insert into Veiculo values (%s,'%s','%s','%s','%s','%s');",this.getCodigoV(),this.getMarcaV(),this.getModeloV(),this.getAnoV(),this.getTipoV(),this.getCategoriaV());
		statement.executeUpdate(sql);
		}
	
	//Exclui dados da tabela Veiculo
	public void excluir() throws SQLException {
		 String sql;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("delete from Veiculo where cdgVeiculo = %s;",this.getCodigoV());
		 statement.executeUpdate(sql);
		 }
	
	//Busca dados na tabela Veiculo
	public ResultSet consultar() throws SQLException {
		 String sql;
		 ResultSet dados = null;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("Select * from Veiculo where cdgVeiculo = %s;",this.getCodigoV());
		 dados = statement.executeQuery(sql);
		 return dados;
	
	}

	
}
