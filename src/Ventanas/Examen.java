package Ventanas;
import Clases.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Examen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen frame = new Examen();
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
	public Examen() {
	
		setTitle("Acronimos de java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPregunta = new JLabel("Pregunta");
		lblPregunta.setBounds(10, 11, 715, 38);
		lblPregunta.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblPregunta);
		
		JRadioButton rdbOpc1 = new JRadioButton("");
		rdbOpc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select[posicion]=rdbOpc1.getLabel();
			}
		});
		rdbOpc1.setBounds(10, 44, 352, 23);
		grupo1.add(rdbOpc1);
		contentPane.add(rdbOpc1);
		
		JRadioButton rdbOpc2 = new JRadioButton("");
		rdbOpc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select[posicion]=rdbOpc2.getLabel();
			}
		});
		rdbOpc2.setBounds(10, 82, 352, 23);
		grupo1.add(rdbOpc2);
		contentPane.add(rdbOpc2);
		
		JRadioButton rdbOpc3 = new JRadioButton("");
		rdbOpc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select[posicion]=rdbOpc3.getLabel();
			}
		});
		rdbOpc3.setBounds(10, 119, 352, 23);
		grupo1.add(rdbOpc3);
		contentPane.add(rdbOpc3);
		
		JRadioButton rdbOpc4 = new JRadioButton("");
		rdbOpc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select[posicion]=rdbOpc4.getLabel();
			}
		});
		rdbOpc4.setBounds(10, 156, 352, 23);
		grupo1.add(rdbOpc4);
		contentPane.add(rdbOpc4);
		
		 
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(321, 203, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.setBounds(214, 203, 89, 23);
		
		contentPane.add(btnEvaluar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(115, 203, 89, 23);
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		contentPane.add(btnSiguiente);
		
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(16, 203, 89, 23);
		contentPane.add(btnAnterior);
		  lblPregunta.setText(p.getPregunta(posicion));
	        String[] a = r.setRespuestas(posicion);
	        grupo1.clearSelection();
			rdbOpc1.setText(a[0]);
			rdbOpc2.setText(a[1]);
			rdbOpc3.setText(a[2]);
			rdbOpc4.setText(a[3]);
	        rdbOpc1.requestFocus();
	        btnAnterior.setEnabled(false);
	        btnEvaluar.setEnabled(false);
	        
		
		
		
		
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(posicion == 3){
			            btnSiguiente.setEnabled(false);
			            btnEvaluar.setEnabled(true);
			        }
				if(posicion<5) {
					 btnAnterior.setEnabled(true);
			            posicion++;
					lblPregunta.setText(p.getPregunta(posicion));
					String []a= r.setRespuestas(posicion);
					grupo1.clearSelection();
					rdbOpc1.setText(a[0]);
					rdbOpc2.setText(a[1]);
					rdbOpc3.setText(a[2]);
					rdbOpc4.setText(a[3]);
					rdbOpc1.requestFocus();
				}else {
					Toolkit.getDefaultToolkit().beep();
				}
				if(posicion==4) {
					rdbOpc3.setVisible(false);
					rdbOpc4.setVisible(false);
				}
					
			}
		});
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(posicion == 0){
			            btnAnterior.setEnabled(false);
			        }
			        
			        if(posicion > -1){
			            posicion--;
			            rdbOpc3.setVisible(true);
						rdbOpc4.setVisible(true);
			            btnSiguiente.setEnabled(true);
			            lblPregunta.setText(p.getPregunta(posicion));
			            String[] a = r.setRespuestas(posicion);
			            grupo1.clearSelection(); 
			            rdbOpc1.setText(a[0]);
						rdbOpc2.setText(a[1]);
						rdbOpc3.setText(a[2]);
						rdbOpc4.setText(a[3]);
						rdbOpc1.requestFocus();
						
						
					}else {
						 
						 Toolkit.getDefaultToolkit().beep();
						 
					}
			    	if(posicion == 0){
			            btnAnterior.setEnabled(false);
			        }
			}
		});
		
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int calificacion = 0;
		        
		        for(int i = 0; i < 5; i++){
		            if(select[i].equals(r.getRespuesta(i))){
		                calificacion = calificacion + 1;
		            }
		        }
		        
		        calificacion = calificacion * 2;
		        
		        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
			}
		});
		
	}
	
	int posicion=0;
	Respuestas r=new Respuestas();
	Preguntas p=new Preguntas();
	Object[] select = {"","","","",""};
	private final ButtonGroup grupo1 = new ButtonGroup();
	
}
