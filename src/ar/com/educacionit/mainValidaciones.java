package ar.com.educacionit;

import java.util.Scanner;

public class mainValidaciones {

	public static void main(String[] args) {
		
		 int dd;
		 int mm;
		 int yyyy;
		 String fecha;
		 
		Scanner scnn = new Scanner(System.in);

		do{
		System.out.println("Por favor inserte dia(dd)");
		dd = scnn.nextInt();
		}while(dd<1 || dd>31);
		
		do {
		System.out.println("Por favor inserte mes(mm)");
		mm = scnn.nextInt();
		}while(mm<1 || mm>12);
		
		if(mm == 02 && dd>29){
			System.out.println("Febrero solo puede poseer un max de 29 dias. Intente nuevamente.");
			System.exit(1);
		}
		
		do {
		System.out.println("Por favor inserte año(aaaa)");
		yyyy = scnn.nextInt();
		}while(yyyy<1900 || yyyy>2099);
		
		scnn.close();
		
		boolean esBisiesto = yyyy % 4 == 0;
		
		
		if(!esBisiesto && dd == 29) {
			System.out.println("En este año Febrero no posee 29 dias. Intente nuevamente.");
			System.exit(1);	
		}else {
			fecha = (dd +"/"+ mm +"/"+ yyyy);
			System.out.println("La fecha ingresada es: "+ fecha);
		}
	}
}


