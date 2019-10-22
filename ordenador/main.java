/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordenador ord;
        ord=new Ordenador(new Raton("cable"),new Pantalla("Samsung", 15.7f), new CPU(3,2048));
        System.out.println("Ordenador:\nCPU: " + ord.getCPU().getVelocidad() + " GHz");
        System.out.println("Memoria: " + ord.getCPU().getMemoria() + " MB");
        System.out.println("Raton: " + ord.getRaton().getTipo());
        System.out.println("Pantalla:");
        System.out.println("Marca: " + ord.getPantalla().getMarca());
        System.out.println("Pulgadas: " + ord.getPantalla().getPulgadas());
    }
    
}
