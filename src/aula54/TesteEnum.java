package aula54;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
	}

}
