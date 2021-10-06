package ejercicio1;


import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaNueva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNueva frame = new VentanaNueva();
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
	public VentanaNueva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(190, 165, 108, 39);
		contentPane.add(btnSalir);
		
		JRadioButton rdbM = new JRadioButton("Masculino");
		rdbM.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbM.setBounds(151, 38, 124, 21);
		contentPane.add(rdbM);
		
		JRadioButton rdbF = new JRadioButton("Femenino");
		rdbF.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbF.setBounds(151, 77, 124, 21);
		contentPane.add(rdbF);
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbM);
		grupo1.add(rdbF);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbM.isSelected()) {JOptionPane.showMessageDialog(contentPane,rdbM.getText());}
				if(rdbF.isSelected()) {JOptionPane.showMessageDialog(contentPane,rdbF.getText());}
			}
		});
		btnAceptar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAceptar.setBounds(72, 165, 97, 39);
		contentPane.add(btnAceptar);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSexo.setBounds(63, 65, 59, 21);
		contentPane.add(lblSexo);
		
	}
}
