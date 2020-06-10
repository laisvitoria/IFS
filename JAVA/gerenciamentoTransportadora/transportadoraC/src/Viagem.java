
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Viagem {
	
	//declaração dos atributos
	private int codigoViagem; // codigo da viagem
	private String OrigemViagem; // origem da viagem
	private String DestinoViagem; // destino da viagem
	private int VeiculoViagem; // veiculo usado na viagem
	private int codigoMotoV; // codigo do motorista que fará a viagem
	private String DtSaidaViagem; // data de saída da viagem
	private String DtPrevistaViagem; //previsão de chegada da viagem
	private String url = "jdbc:postgresql://localhost:5432/transportadoraC"; // url do banco de dados
	private String usuario = "postgres"; // usuario do banco de dados
	private String senha = "postgres";//senha do banco de dados
	private Connection conexao = null;//faz a conexão com o banco de dados
	
	//METODO CONSTRUTOR
	public Viagem() throws SQLException {
		 this.conexao = DriverManager.getConnection(this.getUrl(),this.getUsuario(),this.getSenha());
		 }

	//GET E SET
	public int getCodigoViagem() {
		return codigoViagem;
	}

	public void setCodigoViagem(int codigoViagem) {
		this.codigoViagem = codigoViagem;
		if (codigoViagem < 1) {
			codigoViagem = 1;
			}
	}


	public String getOrigemViagem() {
		return OrigemViagem;
	}

	public void setOrigemViagem(String origemViagem) {
		OrigemViagem = origemViagem;
	}

	public String getDestinoViagem() {
		return DestinoViagem;
	}

	public void setDestinoViagem(String destinoViagem) {
		DestinoViagem = destinoViagem;
	}
	public int getCodigoMotoV() {
		return codigoMotoV;
	}

	public void setCodigoMotoV(int codigoMotoV) {
		this.codigoMotoV = codigoMotoV;
	}


	public int getVeiculoViagem() {
		return VeiculoViagem;
	}

	public void setVeiculoViagem(int veiculoViagem) {
		VeiculoViagem = veiculoViagem;
	}

	public String getDtSaidaViagem() {
		return DtSaidaViagem;
	}

	public void setDtSaidaViagem(String dtSaidaViagem) {
		DtSaidaViagem = dtSaidaViagem;
	}

	public String getDtPrevistaViagem() {
		return DtPrevistaViagem;
	}

	public void setDtPrevistaViagem(String dtPrevistaViagem) {
		DtPrevistaViagem = dtPrevistaViagem;
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

	//Insere os dados na tabela Viagem
	public void cadastrar() throws SQLException {
		String sql;
		Statement statement = this.conexao.createStatement();
		sql = String.format("insert into viagem values (%s,'%s','%s','%s','%s','%s','%s');",this.getCodigoViagem(),this.getOrigemViagem(),this.getDestinoViagem(),
				this.getVeiculoViagem(),this.getCodigoMotoV(),this.getDtSaidaViagem(),this.getDtPrevistaViagem());
		statement.executeUpdate(sql);
		}
	
	//Exclui dados da tablela Viagem
	public void excluir() throws SQLException {
		 String sql;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("delete from Viagem where cdgviagem = %s;",this.getCodigoViagem());
		 statement.executeUpdate(sql);
		 }
	
	//Busca dados da tabela Viagem
	public ResultSet consultar() throws SQLException {
		 String sql;
		 ResultSet dados = null;
		 Statement statement = this.conexao.createStatement();
		 sql = String.format("Select * from Viagem where cdgviagem = %s;",this.getCodigoViagem());
		 dados = statement.executeQuery(sql);
		 return dados;
	}
}
