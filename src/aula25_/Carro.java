package aula25_;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");}
	
	
}