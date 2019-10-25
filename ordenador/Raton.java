/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 *
 * Clase atributo de Ordenador con atributo string llamado tipo
 * @author xdeantabelisario
 */
public class Raton {
    private String tipo;
    /**
     * Constructor por defecto, inicializa el atributo tipo en null
     */
    public Raton(){
        
    }
    /**
     * Constructor parametrizado que recibe un string
     * @param tipo Variable de tipo String para inicializar el atributo de la clase
     */
    public Raton(String tipo){
        this.tipo=tipo;
    }
    /**
     * retorna un string indicando el tipo de raton
     * @return tipo String
     */
    public String getTipo(){
        return tipo;
    }
    /**
     * recibe un string y modifica el atributo tipo
     * @param tipo String
     */
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}
