package ejercicio1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SerieDeNumeros extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimerNumero;
	private JTextField txtSegundoNumero;
	private JTextField txtCorridas;
	private JTextArea VarSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieDeNumeros frame = new SerieDeNumeros();
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
	public SerieDeNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		VarSerie = new JTextArea();
		VarSerie.setBounds(59, 128, 338, 77);
		contentPane.add(VarSerie);
		
		txtPrimerNumero = new JTextField();
		txtPrimerNumero.setBounds(193, 0, 96, 20);
		contentPane.add(txtPrimerNumero);
		txtPrimerNumero.setColumns(10);
		
		txtSegundoNumero = new JTextField();
		txtSegundoNumero.setBounds(193, 43, 96, 20);
		contentPane.add(txtSegundoNumero);
		txtSegundoNumero.setColumns(10);
		
		txtCorridas = new JTextField();
		txtCorridas.setBounds(193, 87, 96, 20);
		contentPane.add(txtCorridas);
		txtCorridas.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Primer Numero:");
		lblNewLabel.setBounds(59, 3, 119, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Numero:");
		lblNewLabel_1.setBounds(59, 46, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Corridas:");
		lblNewLabel_2.setBounds(69, 90, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String VarNumUno=txtPrimerNumero.getText();
			String VarNumDos=txtSegundoNumero.getText();
			String VarIteracion=txtCorridas.getText();
			String Cadena="";
			int Suma=0,Iteraciones=1;
			
			int VarNum1=Integer.parseInt(VarNumUno);
			int VarNum2=Integer.parseInt(VarNumDos);
			int VarItera=Integer.parseInt(VarIteracion);
			Cadena=VarNumUno+"-"+VarNumDos;
			while(Iteraciones<=VarItera) {
Suma=VarNum1+VarNum2;
Cadena+="-"+String.valueOf(Suma);
VarNum1=VarNum2;
VarNum2=Suma;
Iteraciones++;

			}
			
			VarSerie.setText(Cadena);
			
			}
		});
		btnImprimir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnImprimir.setBounds(59, 216, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(186, 216, 89, 23);
		contentPane.add(btnSalir);
	}

}
