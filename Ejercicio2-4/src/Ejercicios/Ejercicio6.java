package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//Escribe una aplicación que almacena en dos variables de tipo “int”, 
				//la base y la altura de un triángulo y calcule su área. A= (b * h) /2
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Escriba la longitud de la base:");
			int base=Integer.parseInt(sc.nextLine());
			System.out.print("Escriba la longitud de la altura:");
			int h=Integer.parseInt(sc.nextLine());
			double areaTotal=(base*h)/2.0;
			System.out.println("El área del triángulo es:"+ areaTotal+ " centímetros");
		}
		
	}

}
