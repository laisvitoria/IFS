import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Motorista {
	
	// declaração dos atributos
	private int codigoM; // codigo do motorista
	private String nomeM; // nome do motorista
	private String cpfM; // cpf do motorista
	private String rgM; // rg do motorista
	private String enderecoM; // endereço do motorista
	private String dataNascM; // data de nascimento
	private String sexoM; // sexo do motorista
	private String contatoM; // telefone do motorista
	private String emailM; // email do motorista
	private String cnhM; // numero da carteira de motorista
	private String validadeM; // validade da carteirs de motorista
	private String categoriaM; // maior categoria da carteira de motorista
	private String dataAdmM; // data de admissao do motorista na transportadora
	private String url = "jdbc:postgresql://localhost:5432/transportadoraC"; // url do banco de dados
	private String usuario = "postgres"; // usuario do banco de dados
	private String senha = "postgres"; // senha do banco de dados
	private Connection conexao = null;//faz a conexão com o banco de dados
	
	//METODO CONSTRUTOR
	public Motorista() throws SQLException {
		 this.conexao = DriverManager.getConnection(this.getUrl(),this.getUsuario(),this.getSenha());
		 }
	
	// GETS E SETS
	public int getCodigoM() {
		return codigoM;
	}
	public void setCodigoM(int codigoM) {
		this.codigoM = codigoM;
	}
	public String getNomeM() {
		return nomeM;
	}
	public void setNomeM(String nomeM) {
		this.nomeM = nomeM;
	}
	public String getCpfM() {
		return cpfM;
	}
	public void setCpfM(String cpfM) {
		this.cpfM = cpfM;
	}
	public String getRgM() {
		return rgM;
	}
	public void setRgM(String rgM) {
		this.rgM = rgM;
	}
	public String getEnderecoM() {
		return enderecoM;
	}
	public void setEnderecoM(String enderecoM) {
		this.enderecoM = enderecoM;
	}
	public String getDataNascM() {
		return dataNascM;
	}
	public void setDataNascM(String dataNascM) {
		this.dataNascM = dataNascM;
	}
	public String getSexoM() {
		return sexoM;
	}
	public void setSexoM(String sexoM) {
		this.sexoM = sexoM;
	}
	public String getContatoM() {
		return contatoM;
	}
	public void setContatoM(String contatoM) {
		this.contatoM = contatoM;
	}
	public String getEmailM() {
		return emailM;
	}
	public void setEmailM(String emailM) {
		this.emailM = emailM;
	}
	public String getCnhM() {
		return cnhM;
	}
	public void setCnhM(String cnhM) {
		this.cnhM = cnhM;
	}
	public String getValidadeM() {
		return validadeM;
	}
	public void setValidadeM(String validadeM) {
		this.validadeM = validadeM;
	}
	public String getCategoriaM() {
		return categoriaM;
	}
	public void setCategoriaM(String categoriaM) {
		this.categoriaM = categoriaM;
	}
	public String getDataAdmM() {
		return dataAdmM;
	}
	public void setDataAdmM(String dataAdmM) {
		this.dataAdmM = dataAdmM;
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

		//Insere os dados na tabela Motorista
		public void cadastrar() throws SQLException {
			String sql;
			Statement statement = this.conexao.createStatement();
			sql = String.format("insert into Motorista values (%s,'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s');",this.getCodigoM(),this.getNomeM(),this.getCpfM(),this.getRgM(),this.getEnderecoM(),
					this.getDataNascM(),this.getSexoM(),this.getContatoM(),this.getEmailM(),this.getCnhM(),this.getValidadeM(),this.getCategoriaM(),this.getDataAdmM());
			statement.executeUpdate(sql);
			}
		
		//Exclui os dados na tabela Motorista
		public void excluir() throws SQLException {
			 String sql;
			 Statement statement = this.conexao.createStatement();
			 sql = String.format("delete from Motorista where cdgMoto = %s;",this.getCodigoM());
			 statement.executeUpdate(sql);
			 }
		
		//Busca dados na tabela Motorista
		public ResultSet consultar() throws SQLException {
			 String sql;
			 ResultSet dados = null;
			 Statement statement = this.conexao.createStatement();
			 sql = String.format("Select * from Motorista where cdgMoto = %s;",this.getCodigoM());
			 dados = statement.executeQuery(sql);
			 return dados;
		}


}
