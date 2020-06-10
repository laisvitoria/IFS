import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.sql.SQLException;
import java.sql.ResultSet;

public class motoristaTela extends JFrame {

	//declaração dos atributos
	private JPanel contentPane;
	private JTextField tfCodigoM;
	private JTextField tfNomeM;
	private JTextField tfCpfM;
	private JTextField tfEnderecoM;
	private JTextField tfNascimentoM;
	private JTextField tfContatoM;
	private JTextField tfRgM;
	private JTextField tfEmailM;
	private JTextField tfCnhM;
	private JTextField tfValidadeM;
	private JTextField tfAdmissaoM;
	private JLabel lblCodigoM;
	private JLabel lblNomeM;
	private JLabel lblCpf;
	private JLabel lblRg;
	private JLabel lblContatoM;
	private JLabel lblEmailM;
	private JLabel lblAdmissao;
	private JLabel lblEnderecoM;
	private JLabel lblSexoM;
	private JRadioButton rbMasculinoM;
	private JRadioButton rbFemininoM;
	private JRadioButton rbOutroM;
	private JLabel lblCategoriaM;
	private JLabel lblValidadeM;
	private JLabel lblCnhM;
	private JLabel lblDataNascimentoM;
	private JButton btConsultarM;
	private JButton btCadastrarM;
	private JButton btCancelarM;
	private JButton btvoltarM;
	private JButton btExcluirM;
	private JCheckBox cbxA;
	private JCheckBox cbxB;
	private JCheckBox cbxC;
	private JCheckBox cbxD;
	private JCheckBox cbxE;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					motoristaTela frame = new motoristaTela();
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
	public motoristaTela() throws SQLException {
		setTitle("CadastroMotorista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//instanciando a classe motorista
		Motorista motorista = new Motorista();
		
		//*****************************************************************************************
		tfCodigoM = new JTextField();
		tfCodigoM.setColumns(10);
		tfCodigoM.setBounds(77, 13, 116, 22);
		contentPane.add(tfCodigoM);
		
		lblCodigoM = new JLabel("C\u00F3digo");
		lblCodigoM.setBounds(12, 16, 56, 16);
		contentPane.add(lblCodigoM);
		
		lblNomeM = new JLabel("Nome");
		lblNomeM.setBounds(12, 57, 56, 16);
		contentPane.add(lblNomeM);
		
		tfNomeM = new JTextField();
		tfNomeM.setColumns(10);
		tfNomeM.setBounds(77, 54, 276, 22);
		contentPane.add(tfNomeM);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(12, 99, 56, 16);
		contentPane.add(lblCpf);
		
		tfCpfM = new JTextField();
		tfCpfM.setColumns(10);
		tfCpfM.setBounds(77, 89, 132, 22);
		contentPane.add(tfCpfM);
		
		lblRg = new JLabel("RG");
		lblRg.setBounds(257, 89, 37, 26);
		contentPane.add(lblRg);
		
		lblEmailM = new JLabel("E-mail");
		lblEmailM.setBounds(12, 227, 56, 16);
		contentPane.add(lblEmailM);
		
		tfEnderecoM = new JTextField();
		tfEnderecoM.setColumns(10);
		tfEnderecoM.setBounds(77, 124, 276, 22);
		contentPane.add(tfEnderecoM);
		
		lblContatoM = new JLabel("Contato");
		lblContatoM.setBounds(12, 198, 56, 16);
		contentPane.add(lblContatoM);
		
		tfNascimentoM = new JTextField();
		tfNascimentoM.setColumns(10);
		tfNascimentoM.setBounds(138, 159, 97, 22);
		contentPane.add(tfNascimentoM);
		
		lblEnderecoM = new JLabel("Endere\u00E7o");
		lblEnderecoM.setBounds(12, 127, 56, 16);
		contentPane.add(lblEnderecoM);
		
		tfContatoM = new JTextField();
		tfContatoM.setColumns(10);
		tfContatoM.setBounds(77, 195, 132, 22);
		contentPane.add(tfContatoM);
		
		btCadastrarM = new JButton("Cadastrar");
		btCadastrarM.setBounds(77, 381, 97, 25);
		contentPane.add(btCadastrarM);
		
		btConsultarM = new JButton("Consultar");
		btConsultarM.setBounds(390, 381, 116, 25);
		contentPane.add(btConsultarM);
		
		lblSexoM = new JLabel("Sexo");
		lblSexoM.setBounds(247, 162, 37, 16);
		contentPane.add(lblSexoM);
		
		rbMasculinoM = new JRadioButton("Masculino");
		buttonGroup.add(rbMasculinoM);
		rbMasculinoM.setBounds(282, 156, 90, 25);
		contentPane.add(rbMasculinoM);
		
		rbFemininoM = new JRadioButton("Feminino");
		buttonGroup.add(rbFemininoM);
		rbFemininoM.setBounds(376, 156, 90, 25);
		contentPane.add(rbFemininoM);
		
		rbOutroM = new JRadioButton("Outro");
		buttonGroup.add(rbOutroM);
		rbOutroM.setBounds(467, 156, 63, 25);
		contentPane.add(rbOutroM);
		
		tfRgM = new JTextField();
		tfRgM.setBounds(288, 89, 171, 22);
		contentPane.add(tfRgM);
		tfRgM.setColumns(10);
		
		lblDataNascimentoM = new JLabel("Data de Nascimento");
		lblDataNascimentoM.setBounds(12, 162, 114, 16);
		contentPane.add(lblDataNascimentoM);
		
		tfEmailM = new JTextField();
		tfEmailM.setBounds(77, 224, 276, 22);
		contentPane.add(tfEmailM);
		tfEmailM.setColumns(10);
		
		lblCnhM = new JLabel("CNH");
		lblCnhM.setBounds(12, 266, 56, 16);
		contentPane.add(lblCnhM);
		
		tfCnhM = new JTextField();
		tfCnhM.setBounds(77, 263, 116, 22);
		contentPane.add(tfCnhM);
		tfCnhM.setColumns(10);
		
		lblValidadeM = new JLabel("Validade");
		lblValidadeM.setBounds(216, 266, 56, 16);
		contentPane.add(lblValidadeM);
		
		tfValidadeM = new JTextField();
		tfValidadeM.setBounds(282, 266, 97, 22);
		contentPane.add(tfValidadeM);
		tfValidadeM.setColumns(10);
		
		lblCategoriaM = new JLabel("Categoria");
		lblCategoriaM.setBounds(410, 272, 56, 16);
		contentPane.add(lblCategoriaM);
		
		cbxA = new JCheckBox("A");
		buttonGroup_1.add(cbxA);
		cbxA.setBounds(485, 268, 56, 25);
		contentPane.add(cbxA);
		
		cbxB = new JCheckBox("B");
		buttonGroup_1.add(cbxB);
		cbxB.setBounds(485, 303, 56, 25);
		contentPane.add(cbxB);
		
		cbxC = new JCheckBox("C");
		buttonGroup_1.add(cbxC);
		cbxC.setBounds(485, 337, 56, 25);
		contentPane.add(cbxC);
		
		cbxD = new JCheckBox("D");
		buttonGroup_1.add(cbxD);
		cbxD.setBounds(540, 268, 56, 25);
		contentPane.add(cbxD);
		
		cbxE = new JCheckBox("E");
		buttonGroup_1.add(cbxE);
		cbxE.setBounds(540, 303, 56, 25);
		contentPane.add(cbxE);
		
		lblAdmissao = new JLabel("Data de admiss\u00E3o");
		lblAdmissao.setBounds(12, 312, 114, 16);
		contentPane.add(lblAdmissao);
		
		tfAdmissaoM = new JTextField();
		tfAdmissaoM.setBounds(156, 309, 116, 22);
		contentPane.add(tfAdmissaoM);
		tfAdmissaoM.setColumns(10);
		
		btvoltarM = new JButton("<<");
		btvoltarM.setBounds(563, 12, 51, 25);
		contentPane.add(btvoltarM);
		
		btExcluirM = new JButton("Excluir");
		btExcluirM.setEnabled(false);
		btExcluirM.setBounds(186, 381, 86, 25);
		contentPane.add(btExcluirM);
		
		btCancelarM = new JButton("Cancelar");
		btCancelarM.setBounds(282, 381, 97, 25);
		contentPane.add(btCancelarM);
		
		//******************************************************************************************************************
		btvoltarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipal frame;
				frame = new TelaPrincipal();
				frame.setVisible(true);
			} 
		});

		
		btCadastrarM.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 String sexo = "Outro";
			 motorista.setCodigoM(Integer.parseInt(tfCodigoM.getText()));
			 motorista.setNomeM(tfNomeM.getText());
			 motorista.setCpfM(tfCpfM.getText());
			 motorista.setEnderecoM(tfEnderecoM.getText());
			 motorista.setDataNascM(tfNascimentoM.getText());
			 if (rbMasculinoM.isSelected()) {
				 sexo = "Masculino";
				 }
				 if (rbFemininoM.isSelected()) {
					 sexo = "Feminino";
				 }
				 motorista.setSexoM(sexo);
			 motorista.setContatoM(tfContatoM.getText());
			 motorista.setRgM(tfRgM.getText());
			 motorista.setEmailM(tfEmailM.getText());
			 motorista.setCnhM(tfCnhM.getText());
			 motorista.setValidadeM(tfValidadeM.getText());
			 String categoria = "A";
			 if (cbxB.isSelected()) {
				 categoria = "B";
			 }
			 if (cbxC.isSelected()) {
				 categoria = "C";
			 }
			 if (cbxD.isSelected()) {
				 categoria = "D";
			 }
			 if (cbxE.isSelected()) {
				 categoria = "E";
			 }
			 motorista.setCategoriaM(categoria);
			 motorista.setDataAdmM(tfAdmissaoM.getText());
			 try {
				 motorista.cadastrar();
			 } catch (SQLException erro) {
			 // TODO Auto-generated catch block
			 erro.printStackTrace();
			 }
			 
			 tfCodigoM.setText(" ");
			 tfNomeM.setText(" ");
			 tfCpfM.setText(" ");
			 tfEnderecoM.setText(" ");
			 tfNascimentoM.setText(" ");
			 rbMasculinoM.setSelected(false);
			 rbFemininoM.setSelected(false);
			 rbOutroM.setSelected(false);
			 tfContatoM.setText(" ");
			 tfRgM.setText(" ");
			 tfEmailM.setText(" ");
			 tfCnhM.setText(" ");
			 tfValidadeM.setText(" ");
			 cbxA.setSelected(false);
			 cbxB.setSelected(false);
			 cbxC.setSelected(false);
			 cbxD.setSelected(false);
			 cbxE.setSelected(false);
			 tfAdmissaoM.setText(" ");
			 }
		});
		
		btCancelarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCodigoM.setText(" ");
				tfNomeM.setText(" ");
				tfCpfM.setText(" ");
				tfEnderecoM.setText(" ");
				tfNascimentoM.setText(" ");
				rbMasculinoM.setSelected(false);
				rbFemininoM.setSelected(false);
				rbOutroM.setSelected(false);
				tfContatoM.setText(" ");
				tfRgM.setText(" ");
				tfEmailM.setText(" ");
				tfCnhM.setText(" ");
				tfValidadeM.setText(" ");
				cbxA.setSelected(false);
				cbxB.setSelected(false);
				cbxC.setSelected(false);
				cbxD.setSelected(false);
				cbxE.setSelected(false);
				tfAdmissaoM.setText(" ");
				
				tfCodigoM.setEditable(true);
				btCadastrarM.setEnabled(true);
				btExcluirM.setEnabled(false);
				btCancelarM.setEnabled(true);
				btConsultarM.setEnabled(true);
				tfCodigoM.requestFocus();
				
			}
		});
		
		btExcluirM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				motorista.setCodigoM(Integer.parseInt(tfCodigoM.getText().trim()));
		 try {
			 motorista.excluir();
		 } catch (SQLException e1) {
		
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 }
		 	tfCodigoM.setText(" ");
		    tfNomeM.setText(" ");
			tfCpfM.setText(" ");
			tfRgM.setText(" ");
			tfEnderecoM.setText(" ");
			tfNascimentoM.setText(" ");
			rbMasculinoM.setSelected(false);
			rbFemininoM.setSelected(false);
			rbOutroM.setSelected(false);
			tfContatoM.setText(" ");
			tfEmailM.setText(" ");
			tfCnhM.setText(" ");
			tfValidadeM.setText(" ");
			cbxA.setSelected(false);
			cbxB.setSelected(false);
			cbxC.setSelected(false);
			cbxD.setSelected(false);
			cbxE.setSelected(false);
			tfAdmissaoM.setText(" ");
		
		 
		
		 tfCodigoM.setEditable(true);
		 btCadastrarM.setEnabled(true);
		 btConsultarM.setEnabled(true);
		 btExcluirM.setEnabled(false);
		 tfCodigoM.requestFocus();
		 }
		 });
		
		
		btConsultarM.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ResultSet motoristas = null;
			tfCodigoM.setEditable(false);
			btCadastrarM.setEnabled(false);
			btConsultarM.setEnabled(true);
			btExcluirM.setEnabled(true);
			if (!tfCodigoM.getText().trim().isEmpty()) {
				motorista.setCodigoM(Integer.parseInt(tfCodigoM.getText().trim()));
				 }
			try {
				motoristas = motorista.consultar();
				 } catch (SQLException erro) {
				 // TODO Auto-generated catch block
					 JOptionPane.showMessageDialog(null,erro.getMessage(),"Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
				 //erro.printStackTrace();
				 }
				 try {
					 while (motoristas.next()) {
						 tfCodigoM.setText(motoristas.getObject(1).toString());
						 tfNomeM.setText(motoristas.getObject(2).toString());
						 tfCpfM.setText(motoristas.getObject(3).toString());
						 tfRgM.setText(motoristas.getObject(4).toString());
						 tfEnderecoM.setText(motoristas.getObject(5).toString());
						 tfNascimentoM.setText(motoristas.getObject(6).toString());
						 rbFemininoM.setSelected(motoristas.getObject(7).equals("Feminino"));
						 rbMasculinoM.setSelected(motoristas.getObject(7).equals("Masculino"));
						 rbOutroM.setSelected(motoristas.getObject(7).equals("Outro"));
						 tfContatoM.setText(motoristas.getObject(8).toString());
						 tfEmailM.setText(motoristas.getObject(9).toString());
						 tfCnhM.setText(motoristas.getObject(10).toString());
						 tfValidadeM.setText(motoristas.getObject(11).toString());
						 cbxA.setSelected(motoristas.getObject(12).equals("A"));
						 cbxB.setSelected(motoristas.getObject(12).equals("B"));
						 cbxC.setSelected(motoristas.getObject(12).equals("C"));
						 cbxD.setSelected(motoristas.getObject(12).equals("D"));
						 cbxE.setSelected(motoristas.getObject(12).equals("E"));
						 tfAdmissaoM.setText(motoristas.getObject(13).toString());
				
					 }
				 } catch (SQLException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
				 }
	   }
	   });

	}
}
