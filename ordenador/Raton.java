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
public class Raton {
    private String tipo;
    
    public Raton(){
        
    }
    public Raton(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}
