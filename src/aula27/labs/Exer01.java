package aula27.labs;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */
public class Exer01 {
    
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        
        lampada.mostrarEstado();
        
        lampada.desligar();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
    }
}
