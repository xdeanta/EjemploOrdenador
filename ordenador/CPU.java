/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 * Clase Atributo de Ordenador con atributos velocidad y memoria
 * @author xdeantabelisario
 */
public class CPU {
    private int velocidad;
    private int memoria;
    /**
     * Constructor por defecto, inicializa velocidad y memoria en 0
     */
    public CPU(){
        velocidad=memoria=0;
    }
    /**
     * Constructor parametrizado, recibe 2 Int
     * @param vel Variable tipo Int
     * @param mem Variable tipo Int
     */
    public CPU(int vel, int mem){
        velocidad=vel;
        memoria=mem;
    }
    /**
     * Metodo getter retorna un entero
     * @return Atributo Velocidad
     */
    public int getVelocidad(){
        return velocidad;
    }
    /**
     * Metodo getter retorna un entero
     * @return Atributo memoria
     */
    public int getMemoria(){
        return memoria;
    }
    
    /**
     * Metodo setter, modifica el atributo velocidad
     * @param vel variable tipo entero
     */
    public void setVelocidad(int vel){
        velocidad=vel;
    }
    /**
     * metodo setter, modifica el atributo memoria
     * @param mem variable tipo entero
     */
    public void setMemoria(int mem){
        memoria=mem;
    }
}
