package aula42;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		//exemplo 02
		System.out.println(Contantes.URL_BLOG);
		//Contantes.URL_BLOG = "sdjfskjdhfsdf";
		System.out.println(Contantes.URL_BLOG);
		
		final int TOTAL = 1; 
		//total = total + 1;
		System.out.println(TOTAL);
	}

}
