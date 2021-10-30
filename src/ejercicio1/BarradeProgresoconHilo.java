package ejercicio1;
import Clases.HiloProceso;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BarradeProgresoconHilo extends JFrame {

	private JPanel contentPane;
	HiloProceso hProceso;
	JProgressBar BarProceso;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarradeProgresoconHilo frame = new BarradeProgresoconHilo();
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
	public BarradeProgresoconHilo() {
		setTitle("Barra de progreso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Proceso:");
		lblNewLabel.setBounds(32, 32, 89, 14);
		contentPane.add(lblNewLabel);
		
		BarProceso = new JProgressBar();
		BarProceso.setBounds(86, 32, 146, 19);
		contentPane.add(BarProceso);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HiloProceso.finalizar=false;
				BarProceso.setForeground(Color.orange);
	 			hProceso=new HiloProceso(BarProceso);
	 			Thread hP=new Thread(hProceso);
	 			hP.start();
	 		
			}
		});
		btnIniciar.setBounds(32, 92, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HiloProceso.finalizar=true;
				
				
			}
		});
		btnFinalizar.setBounds(176, 92, 89, 23);
		contentPane.add(btnFinalizar);
	}
}
