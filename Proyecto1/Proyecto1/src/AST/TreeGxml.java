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
    
    
public static String nodos ="";
public static void Graphic(NodoGxml root)
    {
        //String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String cadena ="";
        String fileContent = "digraph g{ " +GotValues(root,cadena) +"}";
        System.out.println("s:" + fileContent);
        try {
            File directorio = new File("DIGRAPH");
            directorio.mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter("DIGRAPH/" + "diag" + ".txt"));
            writer.write(fileContent);
            writer.close();
        } catch (Exception e) {
            System.out.println("ERROR AL IMPRIMIR EL ARBOL");
        }
    }

    
   
public static String GotValues(NodoGxml r,String v)
{
    if(r.getFilhos() != null)
    {
        for (int i = 0; i < r.getFilhos().size(); i++) 
        {
            v += r.getIdunique()+"[label="+r.getValor()+"];\n";
            v += r.getFilhos().get(i).getIdunique()+"[label="+r.getFilhos().get(i).getValor()+"];\n";
            v += r.getIdunique()+"->"+r.getFilhos().get(i).getIdunique()+"; \n";
          //  System.out.println("value:"+v);
            GotValues(r.getFilhos().get(i),v);
        }
    }
    
    
    
    return v;
  
}
}