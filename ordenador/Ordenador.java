/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 * Clase compuesta por las clases CPU, Pantalla y Raton
 * @author xdeantabelisario
 */
public class Ordenador {
    private Raton rat;
    private Pantalla pant;
    private CPU cpu;
    /**
     * Constructor por defecto, construye 3 objetos que la componen
     */
    public Ordenador(){
        rat=new Raton();
        pant=new Pantalla();
        cpu=new CPU();
    }
    /**
     * Constructor parametrizado que recibe como parametros 3 objetos
     * @param rat Objeto Raton
     * @param pant Objeto Pantalla
     * @param cpu Objeto CPU
     */
    public Ordenador(Raton rat, Pantalla pant, CPU cpu){
        this.rat=rat;
        this.pant=pant;
        this.cpu=cpu;
    }
    /**
     * Retorna un objeto tipo raton
     * @return atributo de la clase
     */
    public Raton getRaton(){
        return rat;
    }
    /**
     * Retorna un objeto tipo Pantalla
     * @return atributo de la clase
     */
    public Pantalla getPantalla(){
        return pant;
    }
    /**
     * Retorna un objeto tipo CPU
     * @return atributo de la clase
     */
    public CPU getCPU(){
        return cpu;
    }
    /**
     * Metodo setter que modifica el atributo rat
     * @param rat Objeto tipo Raton
     */
    
    public void setRaton(Raton rat){
        this.rat=rat;
    }
    
    /**
     * Metodo setter que modifica el atributo pant
     * @param pant Objecto tipo Pantalla
     */
    public void setPantalla(Pantalla pant){
        this.pant=pant;
    }
    
    /**
     * Metodo setting que modifica el atributo cpu
     * @param cpu Objeto tipo CPU
     */
    
    public void setCPU(CPU cpu){
        this.cpu=cpu;
    }
}
