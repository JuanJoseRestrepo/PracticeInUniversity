package model;

public class BeutySalon{

	//Atributo

	private String name;


	public BeutySalon(String name, Employeer emple1, Employeer emple2){
		
		this.name = name;
		this.emple1 = emple1;
		this.emple2 = emple2; 

	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Employeer getEmple1(){
		return emple1;
	}

	public void setEmple1(Employeer emple1){
		this.emple1 = emple1;
	}

	public Employeer getEmple2(){
		return emple2;
	}

	public void setEmple2(Employeer emple2){
		this.emple2 = emple2;
	}
}