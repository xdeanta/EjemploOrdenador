/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 *
 * @author xdeantabelisario
 */
public class CPU {
    private int velocidad;
    private int memoria;
    
    public CPU(){
        velocidad=memoria=0;
    }
    
    public CPU(int vel, int mem){
        velocidad=vel;
        memoria=mem;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    public int getMemoria(){
        return memoria;
    }
    public void setVelocidad(int vel){
        velocidad=vel;
    }
    public void setMemoria(int mem){
        memoria=mem;
    }
}
