package aulas85_100;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random() * 100));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextInt(5 + 1));
	}

}
