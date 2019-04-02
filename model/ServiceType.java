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