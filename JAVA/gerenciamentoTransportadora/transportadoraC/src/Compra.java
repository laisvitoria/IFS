import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class Compra {

	// declaração dos atributos
	private int tfCodigoCompra; // codigo da compra
	private int CodigoCliente; // codigo do cliente
	private String DataC; // data da compra
	private int CodigoViaC; // codigo do veiculo
	private int FormPagamento; // codigo da forma de pagamento
	private String ValorCompra; // valor da compra
	private String url = "jdbc:postgresql://localhost:5432/transportadoraC"; // url do banco de dados
	private String usuario = "postgres"; // usuario do banco de dados
	private String senha = "postgres"; // senha do banco de dados
	private Connection conexao = null;//faz a conexão com o banco de dados
	
	
	// METODO CONSTRUTOR
	public Compra() throws SQLException {
		 this.conexao = DriverManager.getConnection(this.getUrl(),this.getUsuario(),this.getSenha());
		 }
	
	// GET E SET
	public int getCodigoCompra() {
		return tfCodigoCompra;
	}
	public void setCodigoCompra(int tfCodigoCompra) {
		this.tfCodigoCompra = tfCodigoCompra;
	}
	public int getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(int CodigoCliente) {
		this.CodigoCliente = CodigoCliente;
	}
	public int getFormPagamento() {
		return FormPagamento;
	}
	public void setFormPagamento(int FormPagamento) {
		this.FormPagamento = FormPagamento;
	}
	public String getDataC() {
		return DataC;
	}
	public void setDataC(String DataC) {
		this.DataC = DataC;
	}
	public int getCodigoViaC() {
		return CodigoViaC;
	}
	public void setCodigoViaC(int CodigoViaC) {
		this.CodigoViaC = CodigoViaC;
	}
	public String getValorCompra() {
		return ValorCompra;
	}
	public void setValorCompra(String ValorCompra) {
		this.ValorCompra = ValorCompra;
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
	//***************************************************************************************************************************
	//********************METODOS PARA ACESSAR O BANCO DE DADOS********************************** 

	//Insere os dados na tabela Compra
			public void cadastrar() throws SQLException {
				String sql;
				Statement statement = this.conexao.createStatement();
				sql = String.format("insert into Compra values (%s,%s,'%s',%s,%s,'%s');",this.getCodigoCompra(),this.getCodigoCliente(),
						this.getDataC(),this.getFormPagamento(),this.getCodigoViaC(),this.getValorCompra());
				statement.executeUpdate(sql);
				}
			
			//Exclui dados da tablela Compra
			public void excluir() throws SQLException {
				 String sql;
				 Statement statement = this.conexao.createStatement();
				 sql = String.format("delete from Compra where cdgCompra = %s;",this.getCodigoCompra());// analisar
				 statement.executeUpdate(sql);
				 }
			
			//Busca dados da tablela Compra
			public ResultSet consultar() throws SQLException {
				 String sql;
				 ResultSet dados = null;
				 Statement statement = this.conexao.createStatement();
				 sql = String.format("Select * from Compra where cdgCompra = %s;",this.getCodigoCompra()); //analisar
				 dados = statement.executeQuery(sql);
				 return dados;
			}


}
