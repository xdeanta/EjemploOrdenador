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
public class Ordenador {
    private Raton rat;
    private Pantalla pant;
    private CPU cpu;
    
    public Ordenador(){
        rat=new Raton();
        pant=new Pantalla();
        cpu=new CPU();
    }
    public Ordenador(Raton rat, Pantalla pant, CPU cpu){
        this.rat=rat;
        this.pant=pant;
        this.cpu=cpu;
    }
    public Raton getRaton(){
        return rat;
    }
    public Pantalla getPantalla(){
        return pant;
    }
    public CPU getCPU(){
        return cpu;
    }
    public void setRaton(Raton rat){
        this.rat=rat;
    }
    public void setPantalla(Pantalla pant){
        this.pant=pant;
    }
    public void setCPU(CPU cpu){
        this.cpu=cpu;
    }
}
