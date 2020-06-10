import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JEditorPane;

public class produtoTela extends JFrame {
	
	//declaração dos atributos
	private JPanel contentPane;
	private JTextField tfCodigoP;
	private JTextField tfDimensoesP;
	private JTextField tfPesoP;
	private JLabel lblCodigoP;
	private JLabel lblDescricaoP ;
	private JTextArea taDescricaoP;
	private JLabel lblDimensoesP;
	private JLabel lblPesoP;
	private JButton btCadastrarP;
	private JButton btVoltar;
	private JButton btCancelarP;
	private JButton btConsultarP;
	private JButton btExcluirP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					produtoTela frame = new produtoTela();
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
	public produtoTela() throws SQLException {
		setTitle("TelaProduto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// instanciando a classe Produto
		Produto produto = new Produto();
		
		//***************************************************************************************************************
		
		lblCodigoP = new JLabel("C\u00F3digo");
		lblCodigoP.setBounds(12, 13, 64, 16);
		contentPane.add(lblCodigoP);
		
		tfCodigoP = new JTextField();
		tfCodigoP.setBounds(78, 10, 116, 22);
		contentPane.add(tfCodigoP);
		tfCodigoP.setColumns(10);
		
		lblDescricaoP = new JLabel("Descri\u00E7\u00E3o");
		lblDescricaoP.setBounds(12, 53, 64, 16);
		contentPane.add(lblDescricaoP);
		
		taDescricaoP = new JTextArea();
		taDescricaoP.setBounds(78, 50, 333, 52);
		contentPane.add(taDescricaoP);
		
		lblDimensoesP = new JLabel("Dimens\u00F5es");
		lblDimensoesP.setBounds(12, 131, 64, 16);
		contentPane.add(lblDimensoesP);
		
		tfDimensoesP = new JTextField();
		tfDimensoesP.setBounds(78, 128, 136, 22);
		contentPane.add(tfDimensoesP);
		tfDimensoesP.setColumns(10);
		
		lblPesoP = new JLabel("Peso");
		lblPesoP.setBounds(12, 175, 56, 16);
		contentPane.add(lblPesoP);
		
		tfPesoP = new JTextField();
		tfPesoP.setBounds(78, 172, 136, 22);
		contentPane.add(tfPesoP);
		tfPesoP.setColumns(10);
		
		btCadastrarP = new JButton("Cadastrar");
		btCadastrarP.setBounds(35, 246, 97, 25);
		contentPane.add(btCadastrarP);
		
		btVoltar = new JButton("<<");
		btVoltar.setBounds(417, 9, 51, 25);
		contentPane.add(btVoltar);
		
		btCancelarP = new JButton("Cancelar");
		btCancelarP.setBounds(357, 246, 97, 25);
		contentPane.add(btCancelarP);
		
		btConsultarP = new JButton("Consultar");
		btConsultarP.setBounds(240, 246, 105, 25);
		contentPane.add(btConsultarP);
		
		btExcluirP = new JButton("Excluir");
		btExcluirP.setEnabled(false);
		btExcluirP.setBounds(142, 246, 86, 25);
		contentPane.add(btExcluirP);
		
		//****************************************************************************************

		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipal frame;
				frame = new TelaPrincipal();
				frame.setVisible(true);
			} 
		});

		
		btCadastrarP.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 produto.setCodigoP(Integer.parseInt(tfCodigoP.getText()));
				 produto.setDescricaoP(taDescricaoP.getText());
				 produto.setDimensoesP(tfDimensoesP.getText());
				 produto.setPesoP(tfPesoP.getText());
			
			 try {
				 produto.cadastrar();
			 } catch (SQLException erro) {
			 // TODO Auto-generated catch block
			 erro.printStackTrace();
			 }
			    tfCodigoP.setText(" ");
				taDescricaoP.setText(" ");
				tfDimensoesP.setText(" ");
				tfPesoP.setText(" ");
				
				tfCodigoP.setEditable(true);
				btCadastrarP.setEnabled(true);
				btExcluirP.setEnabled(false);
				btCancelarP.setEnabled(true);
				btConsultarP.setEnabled(true);
				tfCodigoP.requestFocus();
			 }
		});
		
		btCancelarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCodigoP.setText(" ");
				taDescricaoP.setText(" ");
				tfDimensoesP.setText(" ");
				tfPesoP.setText(" ");
				
				tfCodigoP.setEditable(true);
				btCadastrarP.setEnabled(true);
				btExcluirP.setEnabled(false);
				btCancelarP.setEnabled(true);
				btConsultarP.setEnabled(true);
				tfCodigoP.requestFocus();
				
			}
		});
		
		btExcluirP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				produto.setCodigoP(Integer.parseInt(tfCodigoP.getText().trim()));
					try {
						produto.excluir();
					} catch (SQLException e1) {
		
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			tfCodigoP.setText(" ");
			taDescricaoP.setText(" ");
			tfDimensoesP.setText(" ");
			tfPesoP.setText(" ");
		
		 
		
			tfCodigoP.setEditable(true);
			btCadastrarP.setEnabled(true);
			btConsultarP.setEnabled(true);
			btExcluirP.setEnabled(false);
			tfCodigoP.requestFocus();
		 }
		 });
		
		
		btConsultarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet produtos = null;
				tfCodigoP.setEditable(false);
				btCadastrarP.setEnabled(false);
				btConsultarP.setEnabled(true);
				btExcluirP.setEnabled(true);
					if (!tfCodigoP.getText().trim().isEmpty()) {
						produto.setCodigoP(Integer.parseInt(tfCodigoP.getText().trim()));
					}
					try {
						produtos = produto.consultar();
					} catch (SQLException erro) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,erro.getMessage(),"Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
						//erro.printStackTrace();
					}
					try {
						while (produtos.next()) {
							tfCodigoP.setText(produtos.getObject(1).toString());
							taDescricaoP.setText(produtos.getObject(2).toString());
							tfDimensoesP.setText(produtos.getObject(3).toString());
							tfPesoP.setText(produtos.getObject(4).toString());
				
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
		 });
		
	}
}
