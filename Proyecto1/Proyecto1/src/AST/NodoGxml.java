/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Random;

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
    private  int idunique = this.hashCode();
    private List<NodoGxml> filhos = new ArrayList<>();
    
    // -- atributos --//
    private String id = "";
    private String tipo="";

    public NodoGxml() {
        
    }

    public void AddFilho(NodoGxml filho)
    {
        this.filhos.add(filho);
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

    /**
     * @return the idunique
     */
    public int getIdunique() {
        return idunique;
    }

    /**
     * @param idunique the idunique to set
     */
    public void setIdunique(int idunique) {
        this.idunique = idunique;
    }

   
    
    
}
