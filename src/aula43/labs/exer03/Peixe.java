package aula43.labs.exer03;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */


public class Peixe extends Animal{

    private String caracteristicas;
    
    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;
        return s;
    }
    
    
}
