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
/*
public String dependeDelTipo(){
	String msj = "";
	if(service1 ! = null){
	if(service1.getNameService().equals(ServiceType.PEDICURE)){
	msj = "Pedicure";
	}else if(service2.getNameService().equals(ServiceType.HAIR)){
	 msj = "Cabello";
	}else if(service3.getNameService().equals(ServiceType.MANICURE)){
		 msj = "Manicure";
	 }else {
			 msj = "No existe mas tipos";
		 }
	}
		 return msj;
	 }
	}
*/
public String reportOfService(){
	String msg = "";
	
	if(service1 != null){
	if( service1.getNumberTime < 10){
		
		msg += "El emmpleado" + getNameEmployer() + "tiene" + service1.getAccumulatedTypeOfService() + "Por concepto de Pedicure";
	}else if( service1.getNumberTime() >= 10 && service1.getNumberTime() =< 20){
		msg += "El emmpleado" + getNameEmployer() + "tiene" + service1.getAccumulatedIncome() + "de pesos" + " por ingresos acumulados";
	}else if(service1.getNumberTime() >=20 && (service1.getNumberTime())%10 == 0){
			msg += "Felicitaciones a" + getNameEmployer() + "!!!!!!!!!" + "La sala cubrira el valor de su impuesto";
	}else{
		msg += "El empleado" + getNameEmployer() + "No presta el servicio de pedicure";
			}
	}			
	return msg;


}

public String verificarTrabajo(String type, int nu, double inco, double incoService){
	
	String msj ="";
	
	if(type.equals(ServiceType.PEDICURE)){
		if(service1 == null){
			setService1(type,nu,inco,incoService);
		}
	else if(type.equals(ServiceType.HAIR)[
	
	
	
	return msj;
	
	
	
	
	
	
}	






}