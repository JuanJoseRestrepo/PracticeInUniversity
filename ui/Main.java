package ui;

import model.*;

import java.util.Scanner;

public class Main{
	
	//Relaciones
	
	private BeutySalon principal;

public Main(){
	init();
	
	reader = new Scanner(System.in);
}

public static void main(String[] args){
	Main m = new Main();
	m.showMenu();
}

public void init(){
	
	principal = new BeutySalon();
	
	
	
}

public void showMenu(){
	 int userImput = 0;
	 
	 System.out.println("Bienvenido al salon de belleza");
	 
	 while(userImput != 5){
		 
		 if(userImput == 1){
			 System.out.println("Digite el nombre del empleado");
			 String nameEmp = reader.nextLine();
			 
			 System.out.println("Digite su identificación");
			 String identi = reader.nextLine();
			 
			 System.out.println("Digite su fecha de ingreso con /");
			 String dateI = reader.nextLine();
			 
			 System.out.println("Digite el tipo de servicio");
			 
			 String type = reader.nextLine();
			 
			 System.out.println("Digite el numero de veces que trabajara");
			 
			 int nu = reader.nextInt();
			 reader.nextLine();
			 
			 System.out.println("Digite el ingreso acumulado");
			 double inco = reader.nextDouble();
			 reader.nextLine();
			 
			 Syste.out.println("Digite el ingreso por el servicio");
			 double incoService = reader.nextDouble();
			 reader.nextLine();
			 
			 System.out.println(principal.registrarClientes(nameEmp,identi,dateI,type,nu,inco,incoService));
			 
			 
		 }
		 
	 }
	
	
}







}