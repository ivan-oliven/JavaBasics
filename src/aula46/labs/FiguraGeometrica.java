package aula46.labs;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */


public abstract class FiguraGeometrica {
    
    private String nome;
    private String cor;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
