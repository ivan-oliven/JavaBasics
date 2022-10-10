package aula74.labs;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class SimuladorSemafaro {

	public static void main(String[] args) {
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		for (int i=0; i<10; i++){
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		
		semafaro.desligarSemafaro();
	}

}
