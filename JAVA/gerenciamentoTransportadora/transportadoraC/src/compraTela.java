import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class compraTela extends JFrame {

	// declaração dos atributos utilizados
	private JPanel contentPane;
	private JTextField tfCodigoCompra;
	private JTextField tfCodigoCliente;
	private JTextField tfDataCompra;
	private JTextField tfCodigoViagem;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfValorCompra;
	private JLabel lblCodigoC;
	private JLabel lblCodigoCliente;
	private JLabel lblDataC;
	private JLabel lblCdigoViagem;
	private JLabel lblPagamentoC;
	private JLabel lblValor;
	private JRadioButton rbVista;
	private JRadioButton rbTransferencia;
	private JRadioButton rbBoleto;
	private JButton btCadastrarC;
	private JButton btExcluir;
	private JButton btCancelar;
	private JButton btConsultar;
	private JButton btVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compraTela frame = new compraTela();
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
	public compraTela() throws SQLException {
		setTitle("CadastroCompra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciando a tabela Compra
		Compra compra = new Compra();
		
		
		//*************************************************************************************
		lblCodigoC = new JLabel("C\u00F3digo da Compra");
		lblCodigoC.setBounds(12, 13, 110, 16);
		contentPane.add(lblCodigoC);
		
		tfCodigoCompra = new JTextField();
		tfCodigoCompra.setBounds(134, 10, 116, 22);
		contentPane.add(tfCodigoCompra);
		tfCodigoCompra.setColumns(10);
		
		lblCodigoCliente = new JLabel("C\u00F3digo do Cliente");
		lblCodigoCliente.setBounds(12, 50, 110, 16);
		contentPane.add(lblCodigoCliente);
		
		tfCodigoCliente = new JTextField();
		tfCodigoCliente.setBounds(134, 47, 116, 22);
		contentPane.add(tfCodigoCliente);
		tfCodigoCliente.setColumns(10);
		
		lblDataC = new JLabel("Data:");
		lblDataC.setBounds(12, 85, 56, 16);
		contentPane.add(lblDataC);
		
		tfDataCompra = new JTextField();
		tfDataCompra.setBounds(57, 82, 116, 22);
		contentPane.add(tfDataCompra);
		tfDataCompra.setColumns(10);
		
		lblCdigoViagem = new JLabel("C\u00F3digo da Viagem");
		lblCdigoViagem.setBounds(12, 135, 110, 16);
		contentPane.add(lblCdigoViagem);
		
		tfCodigoViagem = new JTextField();
		tfCodigoViagem.setBounds(134, 132, 116, 22);
		contentPane.add(tfCodigoViagem);
		tfCodigoViagem.setColumns(10);
		
		lblPagamentoC = new JLabel("Pagamento");
		lblPagamentoC.setBounds(12, 178, 78, 16);
		contentPane.add(lblPagamentoC);
		
		rbVista = new JRadioButton("\u00C1 vista");
		buttonGroup.add(rbVista);
		rbVista.setBounds(93, 174, 80, 25);
		contentPane.add(rbVista);
		
		rbTransferencia = new JRadioButton("Transfer\u00EAncia");
		buttonGroup.add(rbTransferencia);
		rbTransferencia.setBounds(177, 175, 127, 25);
		contentPane.add(rbTransferencia);
		
		rbBoleto = new JRadioButton("Boleto");
		buttonGroup.add(rbBoleto);
		rbBoleto.setBounds(307, 174, 78, 25);
		contentPane.add(rbBoleto);
		
		btCadastrarC = new JButton("Cadastrar");
		btCadastrarC.setBounds(37, 276, 97, 25);
		contentPane.add(btCadastrarC);
		
		btVoltar = new JButton("<<");
		btVoltar.setBounds(434, 9, 51, 25);
		contentPane.add(btVoltar);
		
		lblValor = new JLabel("Valor");
		lblValor.setBounds(12, 220, 56, 16);
		contentPane.add(lblValor);
		
		tfValorCompra = new JTextField();
		tfValorCompra.setBounds(57, 217, 116, 22);
		contentPane.add(tfValorCompra);
		tfValorCompra.setColumns(10);
		
		btExcluir = new JButton("Excluir");
		btExcluir.setEnabled(false);
		btExcluir.setBounds(146, 276, 86, 25);
		contentPane.add(btExcluir);
		
		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(242, 276, 97, 25);
		contentPane.add(btCancelar);
		
		btConsultar = new JButton("Consultar");
		btConsultar.setBounds(350, 276, 116, 25);
		contentPane.add(btConsultar);
		
		//******************************************************************************************************************
				btVoltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						TelaPrincipal frame;
						frame = new TelaPrincipal();
						frame.setVisible(true);
					} 
				});

				
				btCadastrarC.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent e) {
						 int pagamento = 1;
					 compra.setCodigoCompra(Integer.parseInt(tfCodigoCompra.getText()));
					 compra.setCodigoCliente(Integer.parseInt(tfCodigoCliente.getText()));
					 compra.setDataC(tfDataCompra.getText());
					 compra.setCodigoViaC(Integer.parseInt(tfCodigoViagem.getText()));
					 if (rbBoleto.isSelected()) {
						 pagamento = 3;
						 }
						 if (rbTransferencia.isSelected()) {
							 pagamento = 2;
						 }
						 compra.setFormPagamento(pagamento);
					 compra.setValorCompra(tfValorCompra.getText());
					 
					 try {
						 compra.cadastrar();
					 } catch (SQLException erro) {
					 // TODO Auto-generated catch block
					 erro.printStackTrace();
					 }
					    tfCodigoCompra.setText(" ");
						tfCodigoCliente.setText(" ");
						tfDataCompra.setText(" ");
						tfCodigoViagem.setText(" ");
						tfValorCompra.setText(" ");
						
						tfCodigoCompra.setEditable(true);
						tfCodigoViagem.setEditable(true);
						btCadastrarC.setEnabled(true);
						btExcluir.setEnabled(false);
						btCancelar.setEnabled(true);
						btConsultar.setEnabled(true);
						tfCodigoCompra.requestFocus();
					 }
				});
				
				btCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						tfCodigoCompra.setText(" ");
						tfCodigoCliente.setText(" ");
						tfDataCompra.setText(" ");
						tfCodigoViagem.setText(" ");
						tfValorCompra.setText(" ");
						
						tfCodigoCompra.setEditable(true);
						tfCodigoViagem.setEditable(true);
						btCadastrarC.setEnabled(true);
						btExcluir.setEnabled(false);
						btCancelar.setEnabled(true);
						btConsultar.setEnabled(true);
						tfCodigoCompra.requestFocus();
						
					}
				});
				
				btExcluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						compra.setCodigoCompra(Integer.parseInt(tfCodigoCompra.getText().trim()));
				 try {
					 compra.excluir();
				 } catch (SQLException e1) {
				
				 // TODO Auto-generated catch block
				 e1.printStackTrace();
				 }
				 	tfCodigoCompra.setText(" ");
				 	tfCodigoCliente.setText(" ");
					tfDataCompra.setText(" ");
					tfCodigoViagem.setText(" ");
					tfValorCompra.setText(" ");
				
				 
				
					tfCodigoCompra.setEditable(true);
					tfCodigoViagem.setEditable(true);
					btCadastrarC.setEnabled(true);
					btExcluir.setEnabled(false);
					btCancelar.setEnabled(true);
					btConsultar.setEnabled(true);
					tfCodigoCompra.requestFocus();
				 }
				 });
				
				
				btConsultar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ResultSet compras = null;
					tfCodigoCompra.setEditable(false);
					btCadastrarC.setEnabled(false);
					btConsultar.setEnabled(true);
					btExcluir.setEnabled(true);
					if (!tfCodigoCompra.getText().trim().isEmpty()) {
						compra.setCodigoCompra(Integer.parseInt(tfCodigoCompra.getText().trim()));
						 }
					try {
						compras = compra.consultar();
						 } catch (SQLException erro) {
						 // TODO Auto-generated catch block
							 JOptionPane.showMessageDialog(null,erro.getMessage(),"Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
						 //erro.printStackTrace();
						 }
						 try {
							 while (compras.next()) {
								 tfCodigoCompra.setText(compras.getObject(1).toString());
								 tfCodigoCliente.setText(compras.getObject(2).toString());
								 tfDataCompra.setText(compras.getObject(3).toString());
								 tfCodigoViagem.setText(compras.getObject(4).toString());
								 rbVista.setSelected(compras.getObject(5).equals(1));
								 rbTransferencia.setSelected(compras.getObject(5).equals(2));
								 rbBoleto.setSelected(compras.getObject(5).equals(3));
								 tfValorCompra.setText(compras.getObject(6).toString());
								
							 }
						 } catch (SQLException e) {
						 // TODO Auto-generated catch block
						 e.printStackTrace();
						 }
			   }
			   });

	}
}
