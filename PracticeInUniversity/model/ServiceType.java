package model;

public class ServiceType{
	
//Constantes

private final static String PEDICURE = "Pedicure";
private final static String HAIR = "Cabello";
private final static String MANICURE = "Manicure";

//Atributos

private String nameService;
private int numberTime;
private double accumulatedIncome;
private double accumulatedTypeOfService;

//Constructor

public ServiceType(String nameService, int numberTime, double accumulatedIncome , double accumulatedTypeOfService){
	
	this.nameService = nameService;
	this.numberTime = numberTime;
	this.accumulatedIncome= accumulatedIncome;
	this.accumulatedTypeOfService = accumulatedTypeOfService;

}

public String getNameService(){
	return nameService;
}

public void setNameService(String nameService){
	this.nameService = nameService;
}

public int getNumberTime(){
	return numberTime;
}

public void setNumberTime(int numberTime){
	this.numberTime = numberTime;
}

public double getAccumulatedIncome(){
	return accumulatedIncome;
}

public void setAccumulatedIncome(double accumulatedIncome){
	this.accumulatedIncome = accumulatedIncome;
}

public double getAccumulatedTypeOfService(){
	return accumulatedTypeOfService;
}

public void setAccumulatedTypeOfService(double accumulatedTypeOfService){
	this.accumulatedTypeOfService = accumulatedTypeOfService;
}

public String showInfoServiceType(){
	String msj = "";
	
	msj = "El tipo de servicio es:" + nameService;
	msj = "El numero de veces que ha hecho este servicio" + numberTime;
	msj = "El ingreso acumulado es:" + accumulatedIncome;
	msj = "El valor acumulado por servicio es : " + accumulatedTypeOfService;
	
	return msj;
}











}