/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Virginia
 */
public class TreeGxml {
    
public static void Graphic(NodoGxml root)
    {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String fileContent = "digraph g{ " +GotValues(root) +"}";
        System.out.println("s:" + fileContent);
        try {
            File directorio = new File("DIGRAPH");
            directorio.mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter("DIGRAPH/" + timeStamp + ".txt"));
            writer.write(fileContent);
            writer.close();
        } catch (Exception e) {
            System.out.println("ERROR AL IMPRIMIR EL ARBOL");
        }
    }

    
   
public static String GotValues(NodoGxml r)
{  
     //node1 -> node2 ;
    String node ="";
    if(r.getFilhos() != null)
    {
        for (int i = 0; i < r.getFilhos().size(); i++) 
        {
            node += r.getValor().hashCode()+"->"+r.getFilhos().get(i).getValor().hashCode()+"; \n";
            GotValues(r.getFilhos().get(i));
        }
    }
    
    
    
    return node;
  
}
}