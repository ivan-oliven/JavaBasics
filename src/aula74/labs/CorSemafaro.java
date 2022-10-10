package aula74.labs;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public enum CorSemafaro {
	
	VERDE(1000), AMARELO(300), VERMELHO(2000);
	
	private int tempoEspera;
	
	CorSemafaro(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
}
