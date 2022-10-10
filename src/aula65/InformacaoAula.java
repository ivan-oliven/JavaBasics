package aula65;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";
}
