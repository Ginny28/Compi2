package proyecto1;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychava
 */
public class Tudo {
    
   String nomeArquivo; 
   
   ArrayList fil = new ArrayList();
 
    DefaultMutableTreeNode Open()
    {
    DefaultMutableTreeNode Nome = null;
    String filters[] ={"gxml","fs"};    
    FileNameExtensionFilter f = new FileNameExtensionFilter("Kinds of Files",filters);
        JFileChooser jf = new JFileChooser();
        jf.setFileFilter(f);
        int files = jf.showOpenDialog(null);
        if (files == JFileChooser.APPROVE_OPTION)
        {
           
            nomeArquivo= jf.getSelectedFile().getPath();
            fil.add(jf.getSelectedFile().getAbsolutePath());
            Nome = new DefaultMutableTreeNode( jf.getSelectedFile().getName());
                     
        }
        return Nome;
    }

    public void New(JTextArea area)
    {
  
    FileNameExtensionFilter f = new FileNameExtensionFilter("GXML", "xml");
    FileNameExtensionFilter f1 = new FileNameExtensionFilter("FuncionScript", "fs");
      
    JFileChooser jf = new JFileChooser();
        
       jf.addChoosableFileFilter(f);
       jf.addChoosableFileFilter(f1);
     int files = jf.showSaveDialog(null);

        nomeArquivo = jf.getSelectedFile().getPath();
        String otro = jf.getSelectedFile().getName();
        Object  fil1 = f1;
        
       exist(jf, area); 
}
    
    
   public void Save(JTextArea area,String nome)
   {
       BufferedWriter writes;
       try
       {
       writes= new BufferedWriter(new FileWriter(nome));
       writes.write(area.getText());
       writes.close();
       }
       catch(Exception ex)
       {ex.printStackTrace();}
   
   }
    
       
   void exist(JFileChooser jf,JTextArea area)
    {
     if(new File(jf.getSelectedFile().getPath()).exists()) 
        {
            if(JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null,"El archivo:"+" "+"\""+jf.getSelectedFile().getName() +"\""+" "+"ya existe."+"\n"+"Desea remplazarlo?",null,JOptionPane.YES_NO_OPTION)) 
            {
                
                BufferedWriter bw;
                try {
                    bw = new BufferedWriter(new FileWriter(nomeArquivo));
                    bw.write(area.getText());
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                
            } else {
                int fs = jf.showSaveDialog(null);
            }
            
        } 
     else {
            BufferedWriter writes = null;
      try {
                
           String Descrição = jf.getFileFilter().getDescription();
                
           if(Descrição.equalsIgnoreCase("GXML"))
           {
                writes= new BufferedWriter(new FileWriter(jf.getSelectedFile().getPath()+".gxml"));
                   writes.write(area.getText());
                writes.close();
           }
           else if(Descrição.equalsIgnoreCase("FuncioScript"))
           {
               writes = new BufferedWriter(new FileWriter(jf.getSelectedFile().getCanonicalPath()+".fs"));
                  writes.write(area.getText());
                writes.close();
           }
           
         }
     catch(IOException ex){ex.printStackTrace();}
    
    
         }

    } 
  

}
