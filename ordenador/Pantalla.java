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
public class Pantalla {
    private String marca;
    private float pulgadas;
    
    public Pantalla(){
        
    }
    public Pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
    }
    public String getMarca(){
        return marca;
    }
    public float getPulgadas(){
        return pulgadas;
    }
    public void setMarca(String mar){
        marca=mar;
    }
    public void setPulgadas(float pulg){
        pulgadas=pulg;
    }
}
