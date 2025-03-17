package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe una aplicación que almacena en dos variables de tipo “int” notas numéricas
		//y muestra por pantalla la nota media (puede contener decimales)
		Scanner sc=new Scanner(System.in);
		System.out.print("Escriba la primera nota:");
		int nota1=Integer.parseInt(sc.nextLine());
		System.out.print("Escriba la segunda nota:");
		int nota2=Integer.parseInt(sc.nextLine());
		double notaMedia=(nota1+nota2)/2.0;
		System.out.println("La nota media es "+notaMedia);
	}

}
