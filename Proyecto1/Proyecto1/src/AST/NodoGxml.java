/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.List;
import java.lang.Object;

/**
 *
 * @author Virginia
 */
public class NodoGxml {

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    private String valor;
    private  int idunique= valor.hashCode();
    //private NodoGxml pai;
    private List<NodoGxml> filhos;
    
    // -- atributos --//
    private String id = "";
    private String tipo="";

    public NodoGxml(String valor) {
        this.valor = valor;
    }

    
    /**
     * @return the filhos
     */
    public List<NodoGxml> getFilhos() {
        return filhos;
    }

    /**
     * @param filhos the filhos to set
     */
    public void setFilhos(List<NodoGxml> filhos) {
        this.filhos = filhos;
    }

   
    
    
}
