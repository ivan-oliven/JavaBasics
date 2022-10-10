package aula67;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
	}

}
