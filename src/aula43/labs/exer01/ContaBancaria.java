package aula43.labs.exer01;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */


public class ContaBancaria {
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the numConta
     */
    public String getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s += " nomeCliente: " + nomeCliente;
        s += "; numConta: " + numConta; 
        s += "; saldo: " + saldo;
        s += "]" ;
        return s; 
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public boolean sacar(double valor){
        if ((saldo-valor) >=0){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
