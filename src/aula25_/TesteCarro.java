package aula25_;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Ferra";
		van.modelo = "Ducato";
		van.numPassageiros = 100;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.225;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();

	}

}
