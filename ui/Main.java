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
	
	principal = new BeutySalon("Hermosa");
	
	
	
}

public void showMenu(){
	 int userImput = 0;
	 
	 System.out.println("Bienvenido al salon de belleza", emp1 , emp2);
	 Employeer emp1 = new Employeer("Armando", "1005976323","12/03/2018", new ServiceType("Pedicure", 12, 12000, 30000), new ServiceType(null), new ServiceType(null));
	 Employeer emp2 = new Employeer("Diego", "1005679848", "19/06/2001", new ServiceType(null), new ServiceType("Cabello",14, 30000, 50000), new ServiceType(null));
	
	 
	 while(userImput != 5){
		 
		 if(userImput == 1){
			 
			 System.out.println("Digite el numero de usuario para mostrarlo");
			 System.out.println("1.El empleado \n"+ principal.getEmple1().getNameEmployer() + "2.El empleado" + principal.getEmple2().getNameEmployer());
			 int numbEmple = reader.nextInt();
			 reader.nextLine();
			 Employeer empleados = null;
			 if(numbEmple == 1){
				 empleados = principal.getEmple1();
				 System.out.println("El empleado 1" + empleados.getNameEmployer() + "Tiene la siguiente información" + empleados.showInfoClient());
				 System.out.println("Digite el servicio que quiere" + "1." +ServiceType.PEDICURE + "2." + ServiceType.HAIR + "3."+ ServiceType.MANICURE);
				 int numbS = reader.nextInt();
				 reader.nextLine();
				 if(numbS == 1){
					 String nombreDelServicioPeluqueriaPedicure = ServiceType.PEDICURE;
					 System.out.println("Digite el numero de veces que realizo este servicio");
					 int numeroDeVecesDelServicioP = reader.nextInt();
					 reader.nextLine();
					 if(empleados == null){
					 ServiceType pedicure = new ServiceType(nombreDelServicioPeluqueriaPedicure,numeroDeVecesDelServicioP); 
					 empleados.setService1(pedicure);
					 }else{
						 System.out.println("No existe o no se puede mi fai" + "Su numero de veces al servicio es " + numeroDeVecesDelServicioP);
					 }
				 }else if( numbS == 2){
				 	 String nombreDelServicioPeluqueriaCabello = ServiceType.HAIR;
					 System.out.println("Digite el numero de veces que realizo este servicio");
					 int numeroDeVecesDelServicioH = reader.nextInt();
					 reader.nextLine();
					 if(empleados == null){
					 ServiceType cabello = new ServiceType(nombreDelServicioPeluqueriaCabello,numeroDeVecesDelServicioH); 
					 empleados.setService2(cabello);
					 }else{
						 System.out.println("No existe o no se puede mi fai" + "Su numero de veces al servicio es " + numeroDeVecesDelServicioH);
					 }
				 }else if( numbS == 3){
					 String nombreDelServicioPeluqueriaManicure = ServiceType.MANICURE;
					 System.out.println("Digite el numero de veces que realizo este servicio");
					 int numeroDeVecesDelServicioM = reader.nextInt();
					 reader.nextLine();
					 if(empleados == null){
					 ServiceType manicure = new ServiceType(nombreDelServicioPeluqueriaManicure,numeroDeVecesDelServicioM); 
					 empleados.setService1(manicure);
					 }else {
					 System.out.println("So digite algo valido, no se haga chuzar");
				 }
			 }else if(numbEmple == 2){
				 empleados = principal.getEmple2();
				 System.out.println("El empleado 1" + empleados.getNameEmployer() + "Tiene la siguiente información" + empleados.showInfoClient());
				 System.out.println("Digite el servicio que quiere" + "1." +ServiceType.PEDICURE + "2." + ServiceType.HAIR + "3."+ ServiceType.MANICURE);
				 int numbR = reader.nextInt();
				 reader.nextLine();
				 if(numbR == 1){
					 String nombreDelServicioPeluqueriaPedicure2 = ServiceType.PEDICURE;
					 System.out.println("Digite el numero de veces que realizo este servicio");
					 int numeroDeVecesDelServicioP2 = reader.nextInt();
					 reader.nextLine();
					 if(empleados == null){
					 ServiceType pedicure = new ServiceType(nombreDelServicioPeluqueriaPedicure,numeroDeVecesDelServicioP); 
					 System.out.println(empleados.setService1(pedicure));
					 } else{
						 System.out.println("No existe o no se puede mi fai" + "Su numero de veces al servicio es " + numeroDeVecesDelServicioP2);
					 }
				 }else if( numbR == 2){
				 	 String nombreDelServicioPeluqueriaCabello2 = ServiceType.HAIR;
					 System.out.println("Digite el numero de veces que realizo este servicio");
					 int numeroDeVecesDelServicioH2 = reader.nextInt();
					 reader.nextLine();
					 if(empleados == null){
					 ServiceType pedicure = new ServiceType(nombreDelServicioPeluqueriaCabello2,numeroDeVecesDelServicioH2); 
					 empleados.setService2(pedicure);
					 }else{
						 System.out.println("No existe o no se puede mi fai" + "Su numero de veces al servicio es " + numeroDeVecesDelServicioH2);
					 }
				 }else if( numbR == 3){
					 String nombreDelServicioPeluqueriaManicure2 = ServiceType.MANICURE;
					 System.out.println("Digite el numero de veces que realizo este servicio");
					 int numeroDeVecesDelServicioM2 = reader.nextInt();
					 reader.nextLine();
					 if(empleados == null){
					 ServiceType pedicure = new ServiceType(nombreDelServicioPeluqueriaManicure2,numeroDeVecesDelServicioM2); 
					 empleados.setService1(pedicure);
					 }else{	 
						System.out.println("No existe o no se puede mi fai" + "Su numero de veces al servicio es " + numeroDeVecesDelServicioM2);
					 }
				 }else {
					 System.out.println("SO, YA VAN DOS VECES, NO SE HAGA CHUZAR PUES, ZOLO MILLOS MI FAI");
				 }
			 }
			 
			 
			 
			 
			 
			 
		 }
		 
	 else if(){}
	 
	
	
	} 
}






}//final