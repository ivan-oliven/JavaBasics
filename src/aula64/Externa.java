package aula64;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class Externa {

	private String texto = "texto externo";
	
	public class Interna{
		
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(Externa.this.texto); 
		}
	}
	
	public static void main(String[] args){
		
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
	}
}
