import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class veiculoTela extends JFrame {

	//declaração dos atributos
	private JPanel contentPane; //
	private JTextField tfCodigoV;
	private JTextField tfMarcaV;
	private JTextField tfModeloV;
	private JTextField tfAnoV;
	private JLabel lblCodigoV;
	private JButton btVoltarV;
	private JButton btCancelarV;
	private JButton btCadastroV;
	private JButton btExcluirV;
	private JLabel lblMarca;
	private JLabel lblModeloV;
	private JLabel lblAnoV;
	private JLabel lblTipoV;
	private JLabel lblCategoriaV;
	private JCheckBox ckbA;
	private JCheckBox ckbB;
	private JCheckBox ckbC;
	private JCheckBox ckbD;
	private JCheckBox ckbE;
	private JButton btConsultarV;
	private JRadioButton rbCaminhao;
	private JRadioButton rbCarreta;
	private JRadioButton rbCarro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					veiculoTela frame = new veiculoTela();
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
	public veiculoTela() throws SQLException {
		setTitle("CadastroVeiculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// instanciando  a classe Veiculo
		Veiculo veiculo = new Veiculo();
		
		//***************************************************************************************
		lblCodigoV = new JLabel("C\u00F3digo");
		lblCodigoV.setBounds(12, 16, 56, 16);
		contentPane.add(lblCodigoV);
		
		tfCodigoV = new JTextField();
		tfCodigoV.setColumns(10);
		tfCodigoV.setBounds(77, 13, 116, 22);
		contentPane.add(tfCodigoV);
		
		tfMarcaV = new JTextField();
		tfMarcaV.setColumns(10);
		tfMarcaV.setBounds(77, 54, 195, 22);
		contentPane.add(tfMarcaV);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(12, 57, 56, 16);
		contentPane.add(lblMarca);
		
		lblModeloV = new JLabel("Modelo");
		lblModeloV.setBounds(12, 99, 56, 16);
		contentPane.add(lblModeloV);
		
		tfModeloV = new JTextField();
		tfModeloV.setColumns(10);
		tfModeloV.setBounds(77, 96, 195, 22);
		contentPane.add(tfModeloV);
		
		lblAnoV = new JLabel("Ano");
		lblAnoV.setBounds(12, 138, 56, 16);
		contentPane.add(lblAnoV);
		
		tfAnoV = new JTextField();
		tfAnoV.setBounds(77, 135, 116, 22);
		contentPane.add(tfAnoV);
		tfAnoV.setColumns(10);
		
		lblTipoV = new JLabel("Tipo");
		lblTipoV.setBounds(12, 193, 56, 16);
		contentPane.add(lblTipoV);
		
		lblCategoriaV = new JLabel("Categoria da carteira");
		lblCategoriaV.setBounds(12, 239, 132, 16);
		contentPane.add(lblCategoriaV);
		
		ckbA = new JCheckBox("A");
		buttonGroup_1.add(ckbA);
		ckbA.setBounds(152, 235, 56, 25);
		contentPane.add(ckbA);
		
		ckbD = new JCheckBox("D");
		buttonGroup_1.add(ckbD);
		ckbD.setBounds(332, 235, 56, 25);
		contentPane.add(ckbD);
		
		ckbE = new JCheckBox("E");
		buttonGroup_1.add(ckbE);
		ckbE.setBounds(392, 235, 56, 25);
		contentPane.add(ckbE);
		
		ckbB = new JCheckBox("B");
		buttonGroup_1.add(ckbB);
		ckbB.setBounds(212, 235, 56, 25);
		contentPane.add(ckbB);
		
		ckbC = new JCheckBox("C");
		buttonGroup_1.add(ckbC);
		ckbC.setBounds(272, 235, 56, 25);
		contentPane.add(ckbC);
		
		btConsultarV = new JButton("Consultar");
		btConsultarV.setBounds(250, 294, 105, 25);
		contentPane.add(btConsultarV);
		
		btExcluirV = new JButton("Excluir");
		btExcluirV.setEnabled(false);
		btExcluirV.setBounds(152, 294, 86, 25);
		contentPane.add(btExcluirV);
		
		btCadastroV = new JButton("Cadastrar");
		btCadastroV.setBounds(39, 294, 105, 25);
		contentPane.add(btCadastroV);
		
		rbCaminhao = new JRadioButton("Caminh\u00E3o");
		buttonGroup.add(rbCaminhao);
		rbCaminhao.setBounds(77, 190, 86, 23);
		contentPane.add(rbCaminhao);
		
		rbCarreta = new JRadioButton("Carreta");
		buttonGroup.add(rbCarreta);
		rbCarreta.setBounds(165, 190, 86, 23);
		contentPane.add(rbCarreta);
		
		rbCarro = new JRadioButton("Carro");
		buttonGroup.add(rbCarro);
		rbCarro.setBounds(253, 190, 86, 23);
		contentPane.add(rbCarro);
		
		btCancelarV = new JButton("Cancelar");
		btCancelarV.setBounds(367, 294, 97, 25);
		contentPane.add(btCancelarV);
		
		btVoltarV = new JButton("<<");
		btVoltarV.setBounds(441, 12, 51, 25);
		contentPane.add(btVoltarV);
		
		//******************************************************************
		
		btVoltarV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal frame;
				frame = new TelaPrincipal();
				frame.setVisible(true);
			}
		});
		
		btCadastroV.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 int tipo = 1;
			 String categoria = "A";
			 veiculo.setCodigoV(Integer.parseInt(tfCodigoV.getText()));
			 veiculo.setMarcaV(tfMarcaV.getText());
			 veiculo.setModeloV(tfModeloV.getText());
			 veiculo.setAnoV(tfAnoV.getText());
			 if (rbCarreta.isSelected()) {
			 tipo = 2;
			 }
			 if (rbCarro.isSelected()) {
				 tipo = 3;
			 }
			 veiculo.setTipoV(tipo);
			 
			 if (ckbB.isSelected()) {
				 categoria = "B";
			 }
			 if (ckbC.isSelected()) {
				 categoria = "C";
			 }
			 if (ckbD.isSelected()) {
				 categoria = "D";
			 }
			 if (ckbE.isSelected()) {
				 categoria = "E";
			 }
			 veiculo.setCategoriaV(categoria);
			 
			 try {
				 veiculo.cadastrar();
			 } catch (SQLException erro) {
			 // TODO Auto-generated catch block
			 erro.printStackTrace();
			 }
			
			
			
			 tfCodigoV.setText(" ");
			 tfMarcaV.setText(" ");
			 tfModeloV.setText(" ");
			 tfAnoV.setText(" ");
			 rbCaminhao.setSelected(false);
		     rbCarreta.setSelected(false);
			 rbCarro.setSelected(false);
			 ckbA.setSelected(false);
			 ckbB.setSelected(false);
			 ckbC.setSelected(false);
			 ckbD.setSelected(false);
			 ckbE.setSelected(false);
			
			 tfCodigoV.requestFocus();
			 tfCodigoV.setEditable(true);
			 btCadastroV.setEnabled(true);
			 btConsultarV.setEnabled(true);
			 btExcluirV.setEnabled(false);
			 }
			 });
				
		btExcluirV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		veiculo.setCodigoV(Integer.parseInt(tfCodigoV.getText().trim()));
		 try {
		 veiculo.excluir();
		 } catch (SQLException e1) {
		
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 }
		 tfCodigoV.setText(" ");
		 tfMarcaV.setText(" ");
		 tfModeloV.setText(" ");
		 tfAnoV.setText(" ");
		 rbCaminhao.setSelected(false);
		 rbCarreta.setSelected(false);
		 rbCarro.setSelected(false);
		 ckbA.setSelected(false);
		 ckbB.setSelected(false);
		 ckbC.setSelected(false);
		 ckbD.setSelected(false);
		 ckbE.setSelected(false);
		
		 tfCodigoV.setEditable(true);
		 btCadastroV.setEnabled(true);
		 btConsultarV.setEnabled(true);
		 btExcluirV.setEnabled(false);
		 tfCodigoV.requestFocus();
		 }
		 });
		
		
		btConsultarV.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ResultSet veiculos = null;
			tfCodigoV.setEditable(false);
			btCadastroV.setEnabled(false);
			btConsultarV.setEnabled(true);
			btExcluirV.setEnabled(true);
			if (!tfCodigoV.getText().trim().isEmpty()) {
				veiculo.setCodigoV(Integer.parseInt(tfCodigoV.getText().trim()));
				 }
			try {
				 veiculos = veiculo.consultar();
				 } catch (SQLException erro) {
				 // TODO Auto-generated catch block
				 JOptionPane.showMessageDialog(null,erro.getMessage(),"Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
				 //erro.printStackTrace();
				 }
				 try {
				 while (veiculos.next()) {
				 tfCodigoV.setText(veiculos.getObject(1).toString());
				 tfMarcaV.setText(veiculos.getObject(2).toString());
				 tfModeloV.setText(veiculos.getObject(3).toString());
				 tfAnoV.setText(veiculos.getObject(4).toString());
				 rbCaminhao.setSelected(veiculos.getObject(5).equals(1));
				 rbCarreta.setSelected(veiculos.getObject(5).equals(2));
				 rbCarro.setSelected(veiculos.getObject(5).equals(3));
				 ckbA.setSelected(veiculos.getObject(6).equals("A"));
				 ckbB.setSelected(veiculos.getObject(6).equals("B"));
				 ckbC.setSelected(veiculos.getObject(6).equals("C"));
				 ckbD.setSelected(veiculos.getObject(6).equals("D"));
				 ckbE.setSelected(veiculos.getObject(6).equals("E"));
				 }
				 } catch (SQLException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
				 }
				 }
				 });
		
		btCancelarV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCodigoV.setText(" ");
				tfMarcaV.setText(" ");
				tfModeloV.setText(" ");
				tfAnoV.setText(" ");
				rbCaminhao.setSelected(false);
				rbCarreta.setSelected(false);
				rbCarro.setSelected(false);
				ckbA.setSelected(false);
				ckbB.setSelected(false);
				ckbC.setSelected(false);
				ckbD.setSelected(false);
				ckbE.setSelected(false);
				tfCodigoV.setEditable(true);
				btCadastroV.setEnabled(true);
				btConsultarV.setEnabled(true);
				btExcluirV.setEnabled(false);
				tfCodigoV.requestFocus();
				
			}
		});
		
	}
}
