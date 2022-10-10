package aula68;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
		//Thread t1 = new Thread(thread1);
		//t1.start();
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
	}

}
