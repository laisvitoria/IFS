import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class viagemTela extends JFrame {

	// declaração dos atributos utilizados
	private JPanel contentPane;
	private JTextField tfCodigoViagem;
	private JLabel lblOrigemV;
	private JTextField tfOrigemV;
	private JTextField tfDestinoV;
	private JLabel lblDestinoV;
	private JLabel lblVeculoV;
	private JTextField tfVeiculoV;
	private JLabel lblDataSaidaV;
	private JLabel lblDataPrevistaV;
	private JTextField tfDataSaidaV;
	private JTextField tfDataPrevistaV;
	private JButton btCadastrarV;
	private JButton btVoltarV;
	private JTextField tfMotoristaV;
	private JButton btCancelar;
	private JButton btExcluirV;
	private JButton btConsultarV;
	private JLabel lblcdgMoto;
	private JLabel lblCodigoViagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viagemTela frame = new viagemTela();
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
	public viagemTela() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Instanciando a Classe Viagem
		Viagem viagem = new Viagem();
		
		//********************************************************************************
		lblCodigoViagem = new JLabel("C\u00F3digo da Viagem");
		lblCodigoViagem.setBounds(12, 13, 104, 16);
		contentPane.add(lblCodigoViagem);
		
		tfCodigoViagem = new JTextField();
		tfCodigoViagem.setBounds(138, 10, 116, 22);
		contentPane.add(tfCodigoViagem);
		tfCodigoViagem.setColumns(10);
		
		lblOrigemV = new JLabel("Origem");
		lblOrigemV.setBounds(12, 55, 56, 16);
		contentPane.add(lblOrigemV);
		
		tfOrigemV = new JTextField();
		tfOrigemV.setBounds(80, 52, 135, 22);
		contentPane.add(tfOrigemV);
		tfOrigemV.setColumns(10);
		
		tfDestinoV = new JTextField();
		tfDestinoV.setColumns(10);
		tfDestinoV.setBounds(317, 52, 135, 22);
		contentPane.add(tfDestinoV);
		
		lblDestinoV = new JLabel("Destino");
		lblDestinoV.setBounds(249, 55, 56, 16);
		contentPane.add(lblDestinoV);
		
		lblVeculoV = new JLabel("C\u00F3digo do Ve\u00EDculo");
		lblVeculoV.setBounds(12, 97, 104, 16);
		contentPane.add(lblVeculoV);
		
		tfVeiculoV = new JTextField();
		tfVeiculoV.setColumns(10);
		tfVeiculoV.setBounds(138, 94, 116, 22);
		contentPane.add(tfVeiculoV);
		
		lblDataSaidaV = new JLabel("Data de Sa\u00EDda");
		lblDataSaidaV.setBounds(12, 183, 89, 16);
		contentPane.add(lblDataSaidaV);
		
		lblDataPrevistaV = new JLabel("Data Prevista");
		lblDataPrevistaV.setBounds(12, 212, 89, 16);
		contentPane.add(lblDataPrevistaV);
		
		tfDataSaidaV = new JTextField();
		tfDataSaidaV.setBounds(113, 180, 141, 22);
		contentPane.add(tfDataSaidaV);
		tfDataSaidaV.setColumns(10);
		
		tfDataPrevistaV = new JTextField();
		tfDataPrevistaV.setColumns(10);
		tfDataPrevistaV.setBounds(113, 209, 141, 22);
		contentPane.add(tfDataPrevistaV);
		
		btCadastrarV = new JButton("Cadastrar");
		btCadastrarV.setBounds(59, 260, 97, 25);
		contentPane.add(btCadastrarV);
		
		btVoltarV = new JButton("<<");
		btVoltarV.setBounds(465, 9, 51, 25);
		contentPane.add(btVoltarV);
		
		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(383, 260, 97, 25);
		contentPane.add(btCancelar);
		
		btExcluirV = new JButton("Excluir");
		btExcluirV.setEnabled(false);
		btExcluirV.setBounds(168, 260, 86, 25);
		contentPane.add(btExcluirV);
		
		btConsultarV = new JButton("Consultar");
		btConsultarV.setBounds(266, 260, 105, 25);
		contentPane.add(btConsultarV);
		
		lblcdgMoto = new JLabel("C\u00F3digo do Motorista");
		lblcdgMoto.setBounds(12, 137, 135, 16);
		contentPane.add(lblcdgMoto);
		
		tfMotoristaV = new JTextField();
		tfMotoristaV.setColumns(10);
		tfMotoristaV.setBounds(138, 134, 116, 22);
		contentPane.add(tfMotoristaV);
		
		
		//**********************************************************************************************************
		btVoltarV.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				TelaPrincipal frame;
					frame = new TelaPrincipal();
					frame.setVisible(true);
			 }
			});
		
		btCadastrarV.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 viagem.setCodigoViagem(Integer.parseInt(tfCodigoViagem.getText()));
			 viagem.setOrigemViagem(tfOrigemV.getText());
			 viagem.setDestinoViagem(tfDestinoV.getText());
			 viagem.setVeiculoViagem(Integer.parseInt(tfVeiculoV.getText()));
			 viagem.setCodigoMotoV(Integer.parseInt(tfMotoristaV.getText()));
			 viagem.setDtSaidaViagem(tfDataSaidaV.getText());
			 viagem.setDtPrevistaViagem(tfDataPrevistaV.getText());
			 try {
				 viagem.cadastrar();
			 } catch (SQLException erro) {
			 // TODO Auto-generated catch block
			 erro.printStackTrace();
			 }
			 
			 tfCodigoViagem.setText(" ");
			 tfOrigemV.setText(" ");
			 tfDestinoV.setText(" ");
			 tfMotoristaV.setText(" ");
			 tfVeiculoV.setText(" ");
			 tfDataSaidaV.setText(" ");
			 tfDataPrevistaV.setText(" ");
			 tfCodigoViagem.setEditable(true);
			 btCadastrarV.setEnabled(true);
			 tfCodigoViagem.requestFocus();
			 }
		});
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCodigoViagem.setText(" ");
				tfOrigemV.setText(" ");
				tfDestinoV.setText(" ");
				tfMotoristaV.setText(" ");
				tfVeiculoV.setText(" ");
				tfDataSaidaV.setText(" ");
				tfDataPrevistaV.setText(" ");
				tfCodigoViagem.setEditable(true);
				btCadastrarV.setEnabled(true);
				tfCodigoViagem.requestFocus();
				
			}
		});
		
		btExcluirV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		viagem.setCodigoViagem(Integer.parseInt(tfCodigoViagem.getText().trim()));
		 try {
			 viagem.excluir();
		 } catch (SQLException e1) {
		
		 e1.printStackTrace();
		 }
		 tfCodigoViagem.setText(" ");
		 tfOrigemV.setText(" ");
		 tfDestinoV.setText(" ");
		 tfMotoristaV.setText(" ");
		 tfVeiculoV.setText(" ");
		 tfDataSaidaV.setText(" ");
		 tfDataPrevistaV.setText(" ");
		
		 
		
		 tfCodigoViagem.setEditable(true);
		 btCadastrarV.setEnabled(true);
		 btConsultarV.setEnabled(true);
		 btExcluirV.setEnabled(false);
		 tfCodigoViagem.requestFocus();
		 }
		 });
		
		
		btConsultarV.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ResultSet viagens = null;
			tfCodigoViagem.setEditable(false);
			btCadastrarV.setEnabled(false);
			btConsultarV.setEnabled(true);
			btExcluirV.setEnabled(true);
			if (!tfCodigoViagem.getText().trim().isEmpty()) {
				viagem.setCodigoViagem(Integer.parseInt(tfCodigoViagem.getText().trim()));
				 }
			try {
				viagens = viagem.consultar();
				 } catch (SQLException erro) {
				 // TODO Auto-generated catch block
				 JOptionPane.showMessageDialog(null,erro.getMessage(),"Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
				 //erro.printStackTrace();
				 }
				 try {
				  while (viagens.next()) {
					  tfCodigoViagem.setText(viagens.getObject(1).toString());
					  tfOrigemV.setText(viagens.getObject(2).toString());
					  tfDestinoV.setText(viagens.getObject(3).toString());
					  tfVeiculoV.setText(viagens.getObject(4).toString());
					  tfMotoristaV.setText(viagens.getObject(5).toString());
					  tfDataSaidaV.setText(viagens.getObject(6).toString());
					  tfDataPrevistaV.setText(viagens.getObject(7).toString());
				
				 }
				 } catch (SQLException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
				 }
				 }
				 });
		
	}
}
	
