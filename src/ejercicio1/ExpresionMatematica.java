package ejercicio1;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class ExpresionMatematica extends JFrame {

	private JPanel contentPane;
	private JTextField txtExpresion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpresionMatematica frame = new ExpresionMatematica();
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
	public ExpresionMatematica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Expresion Matematica");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.ITALIC, 12));
		lblNewLabel.setBounds(97, 21, 166, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Teclee  la expresion:");
		lblNewLabel_1.setBounds(10, 62, 137, 20);
		contentPane.add(lblNewLabel_1);
		
		txtExpresion = new JTextField();
		txtExpresion.setBounds(146, 61, 139, 20);
		contentPane.add(txtExpresion);
		txtExpresion.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtExpresion.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Ingrese Expresion");
					txtExpresion.requestFocus();
				}
				else	{
				Stack <String >varPila=new Stack<String>();
				String varExpresion =txtExpresion.getText();
				char varCaracter =' ';
				
				for(int x=0;x<varExpresion.length();x++) {
				varCaracter=varExpresion.charAt(x);
		
			
				if (varCaracter=='(') { 
					varPila.push("abre");
					
					}
				if (varCaracter==')') {
				
				if (!varPila.empty())
					{ 
						varPila.pop(); 
						
					} 

                    else { varPila.push("abre");
                    break; }
					
					}
				}
				
				
				
				if (varPila.isEmpty()) {
				
					JOptionPane.showMessageDialog(null, "Expresion Correcta");
				}
				else
				{JOptionPane.showMessageDialog(null, "Expresion Incorrecta");;}
				}
			
			        
			}
			}
		);
		btnValidar.setBounds(52, 110, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(192, 110, 89, 23);
		contentPane.add(btnSalir);
	}
	
    }		

