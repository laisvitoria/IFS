

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	// declaração dos atributos
	private JPanel contentPane;
	private JLabel logo;
	private JButton btCliente;
	private JButton btCompra;
	private JButton btProduto;
	private JButton btViagem;
	private JButton btVeiculo;
	private JButton btMotorista;
	private JLabel lblDesenvolvido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//***********************************************************************************************************
		logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\laisv\\Desktop\\Trabalho prog 2\\Confia transportadora.jpg"));
		logo.setBounds(12, 13, 688, 259);
		contentPane.add(logo);
		
		btCliente = new JButton("CLIENTE");
		btCliente.setBounds(12, 304, 237, 46);
		contentPane.add(btCliente);
		
		btMotorista = new JButton("MOTORISTA");
		btMotorista.setBounds(12, 363, 237, 46);
		contentPane.add(btMotorista);
		
		btViagem = new JButton("VIAGEM");
		btViagem.setBounds(12, 422, 237, 46);
		contentPane.add(btViagem);
		
		btProduto = new JButton("PRODUTO");
		btProduto.setBounds(463, 304, 237, 46);
		contentPane.add(btProduto);
		
		btVeiculo = new JButton("VE\u00CDCULO");
		btVeiculo.setBounds(463, 363, 237, 46);
		contentPane.add(btVeiculo);
		
		btCompra = new JButton("COMPRA");
		btCompra.setBounds(463, 422, 237, 46);
		contentPane.add(btCompra);
		
		lblDesenvolvido = new JLabel("Desenvolvido 2018");
		lblDesenvolvido.setBounds(308, 497, 119, 16);
		contentPane.add(lblDesenvolvido);
		
		//********************************************************************************************************
		btViagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viagemTela frame;
				try {
					frame = new viagemTela();
					frame.setVisible(true);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		
		btVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veiculoTela frame;
				try {
					frame = new veiculoTela();
					frame.setVisible(true);
				} catch (SQLException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
			}
		});
		
		btCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clienteTela frame;
				try {
					frame = new clienteTela();
					frame.setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compraTela frame;
				try {
					frame = new compraTela();
					frame.setVisible(true);
				} catch (SQLException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}
			}
		});
		
		btMotorista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				motoristaTela frame;
				try {
					frame = new motoristaTela();
					frame.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produtoTela frame;
				try {
					frame = new produtoTela();
					frame.setVisible(true);
				} catch (SQLException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			}
		});

	}
}
