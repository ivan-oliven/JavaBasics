package aula34.labs;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */


public class Contador {
    
    private static int cont;

    public Contador() {
        cont++;
    }

    public static void incrementar(){
        cont++;
    }
    
    public static void zerar(){
        cont = 0;
    }
    
    public static int obterValor(){
        return cont;
    }
}
