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
		 
	 }
	
	
}







}