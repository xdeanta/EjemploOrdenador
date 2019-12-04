/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 * Clase Atributo de Ordenador con atributos marca y pulgadas
 * @author xdeantabelisario
 */
public class Pantalla {
    private String marca;
    private float pulgadas;
    /**
     * Constructor por defecto, inicializa el atributo marca en null y pulgadas a 0
     */
    public Pantalla(){
        
    }
    /**
     * Constructor parametrizado que recibe un String y un Float
     * @param marca - Variable tipo String
     * @param pulgadas - Variable tipo float
     */
    
    public Pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
    }
    /**
     * Metodo getter
     * @return devuelve el atributo marca tipo String
     */
    
    public String getMarca(){
        return marca;
    }
    
    /**
     * Metodo getter
     * @return devuelve el atributo pulgadas tipo float
     */
    public float getPulgadas(){
        return pulgadas;
    }
    
    /**
     * Metodo setter modifica el atributo marca de tipo String
     * @param mar Variable tipo String
     */
    public void setMarca(String mar){
        marca=mar;
    }
    
    /**
     * Metodo setter, modifica el atributo pulgada de tipo float
     * @param pulg Variable tipo float
     */
    public void setPulgadas(float pulg){
        pulgadas=pulg;
    }
}
