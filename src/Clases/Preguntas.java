package Clases;

public class Preguntas {
String[] preguntas= {
		"¿Esta libreria no es parte de Java,pero tambien es usada para desarrollar interfaces de usuario:?",
		"¿Tipos de variables en java:?",
		"¿Cual es la forma correcta en Java de declarar un vector de enteros e inicializar valores:?",
		"¿Es la parte del JRE que se encarga  de interpretar el bytecode(nuestro codigo compilado):?",
		"¿En Java los eventos son objetos:?"
};
public String getPregunta(int Posicion) {
	return preguntas[Posicion];
}
}
