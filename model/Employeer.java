package model;

public class Employeer{

//Atributos

private String nameEmployer;
 
private Sring identify;

private String dateIn;

//Relaciones 

private ServiceType service1;

private ServiceType service2;

private ServiceType service3;

//Constructor

public Employeer(String nameEmployer, String identify, String dateIn , ServiceType service1, ServiceType service2, ServiceType service3){
	
	this.nameEmployer = nameEmployer;
	this.identify = identify;
	this.dateIn = dateIn;
	this.service1 = service1;
	this.service2 = service2;
	this.service3 = service3;
	
	
}

public String getNameEmployer(){
	return nameEmployer;
}

public void setNameEmployer(String nameEmployer){
	this.nameEmployer = nameEmployer;
}

public String getIdentify(){
	return identify
}

public void setIdentify(String identify){
	this.identify = identify;
}

public String getDateIn(){
	return dateIn;
}

public void setDateIn(String dateIn){
	this.dateIn = dateIn;
}

public ServiceType getService1(){
	return service1;
}

public void setService1( ServiceType service1){
	this.service1 = service1;
}

public ServiceType getService2(){
	return service2;
}

public void setService2(ServiceType service2){
	this.service2 = service2;
}

public ServiceType getService3(){
	return service3;
}

public void setService3(ServiceType service3){
	this.service3 = service3;
}





}