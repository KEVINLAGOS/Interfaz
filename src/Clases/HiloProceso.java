package Clases;
import java.awt.Color;

import javax.swing.JProgressBar;
public class HiloProceso implements Runnable {
JProgressBar barProceso;
int i;
public static  boolean finalizar=false;
public HiloProceso (JProgressBar barProceso) {
	this.barProceso= barProceso;
	
}
public void run() {
	for (i=0;i<=100;i++) {
		if(finalizar==true) {
		break;
		}
		barProceso.setValue(i);
		barProceso.setStringPainted(true);
		System.out.println("Proceso Tal Ejecutandose");
		try {Thread.sleep(20);}//Milisegundos
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	if(i<100)
	{
		barProceso.setForeground(Color.red);
		System.out.println("Proceso Tal Finalizado por el usuario");
	}
	else {
	barProceso.setForeground(Color.GREEN);
	System.out.println("Proceso Tal Finalizado");
	}
}

}
