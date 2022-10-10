package aula34.labs;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public class Exer01 {
    
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    
    public static void main(String[] args) {
        
        imprimirValor();
        
        Contador.incrementar();
        
        imprimirValor();
        
        Contador.zerar();
        
        imprimirValor();
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        
        imprimirValor();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
        imprimirValor();
    }
}
