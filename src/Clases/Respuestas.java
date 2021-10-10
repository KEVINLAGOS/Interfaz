package Clases;

import java.util.StringTokenizer;

public class Respuestas {
String []respuestas= {
		"SWT","De instancia/Estatica/Local","int[]vector={10}","JVM","Si"
};
String [] radioR= {
		"AWT,SWT,Swing,JavaFx",
		"Global/Local/Estatica,De instancia/Estatica/Local,static/final/abstract,static/final/Local",
		"int[]vector={10},int[]vector=new[10] ,int[]vector=[10],int[]vector=new vector[10]",
		"JVM,JDK,Class Loader,JDE",
		"Si,No",	
};
public String getRespuesta(int posicion) {
	return respuestas[posicion];
	
}
public String[] separar(String cadena,String separador) {
	StringTokenizer token= new StringTokenizer(cadena,separador);
	String [] a = new String [4];
	int i =0;
	while(token.hasMoreTokens()){
		a[i]= token.nextToken();
		i++;
		
	}
	return a;

}
public String[] setRespuestas(int posicion) {
	String s1=radioR[posicion];
	String []s2=separar(s1,",");
	return s2;
	
	
}
}
