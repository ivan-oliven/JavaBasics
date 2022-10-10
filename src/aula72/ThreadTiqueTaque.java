package aula72;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class ThreadTiqueTaque implements Runnable {

	TiqueTaque tt;
	Thread t;
	
	final int NUM = 5;
	
	public ThreadTiqueTaque(String nome, TiqueTaque tt){
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
	}

	@Override
	public void run() {
		
		if (t.getName().equalsIgnoreCase("Tique")){
			for (int i=0; i<NUM; i++){
				tt.tique(true);
			}
			tt.tique(false);
		} else {
			for (int i=0; i<NUM; i++){
				tt.taque(true);
			}
			tt.taque(false);
		}
		
	}
}
