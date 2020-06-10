import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class clienteTela extends JFrame {

	//declaração dos atributos
	private JPanel contentPane;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfCpfcnpj;
	private JTextField tfEmail;
	private JTextField tfContato;
	private JTextField tfEndereco;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblContato;
	private JLabel lblEmail;
	private JButton btCadastrar;
	private JButton btConsultar;
	private JButton btVoltar;
	private JButton btExcluir;
	private JButton btCancelar;
	private JLabel lblCodigo;
	private JLabel lblCpfcnpj;
	private JLabel lblSexo;
	private JRadioButton rbMasculino;
	private JRadioButton rbFeminino;
	private JRadioButton rbOutro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clienteTela frame = new clienteTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public clienteTela() throws SQLException {
		setTitle("CadastroCliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//instanciando a classe Cliente
		Cliente cliente = new Cliente();
		
		//************************************************************************************************
		lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 54, 56, 16);
		contentPane.add(lblNome);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(77, 10, 116, 22);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(12, 13, 56, 16);
		contentPane.add(lblCodigo);
		
		tfNome = new JTextField();
		tfNome.setBounds(77, 51, 276, 22);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setBounds(12, 96, 56, 16);
		contentPane.add(lblCpfcnpj);
		
		tfCpfcnpj = new JTextField();
		tfCpfcnpj.setBounds(77, 86, 132, 22);
		contentPane.add(tfCpfcnpj);
		tfCpfcnpj.setColumns(10);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(230, 96, 37, 16);
		contentPane.add(lblSexo);
		
		rbMasculino = new JRadioButton("Masculino");
		buttonGroup.add(rbMasculino);
		rbMasculino.setBounds(275, 92, 90, 25);
		contentPane.add(rbMasculino);
		
		rbFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rbFeminino);
		rbFeminino.setBounds(369, 92, 90, 25);
		contentPane.add(rbFeminino);
		
		rbOutro = new JRadioButton("Outro");
		buttonGroup.add(rbOutro);
		rbOutro.setBounds(460, 92, 63, 25);
		contentPane.add(rbOutro);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(77, 121, 276, 22);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(12, 127, 56, 16);
		contentPane.add(lblEmail);
		
		lblContato = new JLabel("Contato");
		lblContato.setBounds(12, 162, 56, 16);
		contentPane.add(lblContato);
		
		tfContato = new JTextField();
		tfContato.setBounds(77, 156, 141, 22);
		contentPane.add(tfContato);
		tfContato.setColumns(10);
		
		lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(12, 198, 56, 16);
		contentPane.add(lblEndereco);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(77, 192, 276, 22);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		btCadastrar = new JButton("Cadastrar");
		btCadastrar.setBounds(52, 264, 97, 25);
		contentPane.add(btCadastrar);
		
		btConsultar = new JButton("Consultar");
		btConsultar.setBounds(369, 264, 116, 25);
		contentPane.add(btConsultar);
		
		btVoltar = new JButton("<<");
		btVoltar.setBounds(472, 9, 51, 25);
		contentPane.add(btVoltar);
		
		btExcluir = new JButton("Excluir");
		btExcluir.setEnabled(false);
		btExcluir.setBounds(161, 264, 86, 25);
		contentPane.add(btExcluir);
		
		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(257, 264, 97, 25);
		contentPane.add(btCancelar);
		
		
		//*****************************************************************************
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipal frame;
				frame = new TelaPrincipal();
				frame.setVisible(true);
			} 
		});

		
		btCadastrar.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 String sexo = "Outro";
			 cliente.setCodigoCliente(Integer.parseInt(tfCodigo.getText()));
			 cliente.setNome(tfNome.getText());
			 cliente.setCpfcnpj(tfCpfcnpj.getText());
			 if (rbMasculino.isSelected()) {
				 sexo = "Masculino";
				 }
				 if (rbFeminino.isSelected()) {
					 sexo = "Feminino";
				 }
				 cliente.setSexoCliente(sexo);
			 cliente.setEmail(tfEmail.getText());
			 cliente.setContato(tfContato.getText());
			 cliente.setEndereco(tfEndereco.getText());
			 try {
				 cliente.cadastrar();
			 } catch (SQLException erro) {
			 // TODO Auto-generated catch block
			 erro.printStackTrace();
			 }
			 tfCodigo.setText(" ");
				tfNome.setText(" ");
				tfCpfcnpj.setText(" ");
				rbMasculino.setSelected(false);
				rbFeminino.setSelected(false);
				rbOutro.setSelected(false);
				tfEmail.setText(" ");
				tfContato.setText(" ");
				tfEndereco.setText(" ");
				
				tfCodigo.setEditable(true);
				btCadastrar.setEnabled(true);
				btExcluir.setEnabled(false);
				btCancelar.setEnabled(true);
				btConsultar.setEnabled(true);
				tfCodigo.requestFocus();
				
			 }
		});
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCodigo.setText(" ");
				tfNome.setText(" ");
				tfCpfcnpj.setText(" ");
				rbMasculino.setSelected(false);
				rbFeminino.setSelected(false);
				rbOutro.setSelected(false);
				tfEmail.setText(" ");
				tfContato.setText(" ");
				tfEndereco.setText(" ");
				
				tfCodigo.setEditable(true);
				btCadastrar.setEnabled(true);
				btExcluir.setEnabled(false);
				btCancelar.setEnabled(true);
				btConsultar.setEnabled(true);
				tfCodigo.requestFocus();
				
			}
		});
		
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cliente.setCodigoCliente(Integer.parseInt(tfCodigo.getText().trim()));
		 try {
			 cliente.excluir();
		 } catch (SQLException e1) {
		
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 }
		 tfCodigo.setText(" ");
			tfNome.setText(" ");
			tfCpfcnpj.setText(" ");
			rbMasculino.setSelected(false);
			rbFeminino.setSelected(false);
			rbOutro.setSelected(false);
			tfEmail.setText(" ");
			tfContato.setText(" ");
			tfEndereco.setText(" ");
			
			tfCodigo.setEditable(true);
			btCadastrar.setEnabled(true);
			btExcluir.setEnabled(false);
			btCancelar.setEnabled(true);
			btConsultar.setEnabled(true);
			tfCodigo.requestFocus();
		 }
		 });
		
		
		btConsultar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ResultSet clientes = null;
			tfCodigo.setEditable(false);
			btCadastrar.setEnabled(false);
			btConsultar.setEnabled(true);
			btExcluir.setEnabled(true);
			if (!tfCodigo.getText().trim().isEmpty()) {
				cliente.setCodigoCliente(Integer.parseInt(tfCodigo.getText().trim()));
				 }
			try {
				clientes = cliente.consultar();
				 } catch (SQLException erro) {
				 // TODO Auto-generated catch block
					 JOptionPane.showMessageDialog(null,erro.getMessage(),"Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
				 //erro.printStackTrace();
				 }
				 try {
					 while (clientes.next()) {
						 tfCodigo.setText(clientes.getObject(1).toString());
						 tfNome.setText(clientes.getObject(2).toString());
						 tfCpfcnpj.setText(clientes.getObject(3).toString());
						 rbFeminino.setSelected(clientes.getObject(4).equals("Feminino"));
						 rbMasculino.setSelected(clientes.getObject(4).equals("Masculino"));
						 rbOutro.setSelected(clientes.getObject(4).equals("Outro"));
						 tfEmail.setText(clientes.getObject(5).toString());
						 tfContato.setText(clientes.getObject(6).toString());
						 tfEndereco.setText(clientes.getObject(7).toString());
						
					 }
				 } catch (SQLException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
				 }
	   }
	   });

		
	}
}
