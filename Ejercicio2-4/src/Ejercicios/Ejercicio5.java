package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe una aplicación en la que almacenes tu edad en una 
		//variable de tipo “int” e imprimas por pantalla la edad que tendrías en el año 2030
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduce tu edad:");
		int edadActual=Integer.parseInt(sc.nextLine());
		int edad2030=edadActual+(2030-2024);
		System.out.println("Tu edad en el año 2030 será: " + edad2030);
	}

}
