package ui;
import java.util.Scanner;

public class Menu{
	
	private Scanner reader;
	
	public Menu(){
		reader = new Scanner(System.in);
	}
	
	public void showMenu(){
		
		int userInput;
		do{
			System.out.println("OPTIONS MENU");
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("4. Option 4");
			System.out.println("5. Exit");
			System.out.print("Enter de option: ");
			userInput = Integer.parseInt(reader.nextLine());
			
			operationControl(userInput);
		}while(userInput != 5);
	}
	
	public void operationControl(int option){
		switch(option){
			case 1:
				operation1();
			break;
			case 2:
				operation2();
			break;
			case 3:
			
			break;
			case 4:
			
			break;
			case 5:
			
			break;
			default:
		}
	}
	
	public void operation1(){
		
	}
	
	public static void main(String[] args){
		
		Menu m = new Menu();
		m.showMenu();
		
	}	
}