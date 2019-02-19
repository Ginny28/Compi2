package proyecto1;

import java.awt.TextArea;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.FilenameFilter;
import java.util.ArrayList;
import javax.swing.JTree;
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
 
public void Open(JTextArea area)
    {
    String Nome ="";
    String filters[] ={"gxml","fs"};       
    FileNameExtensionFilter f = new FileNameExtensionFilter("Kinds of Files",filters);
        JFileChooser jf = new JFileChooser();
        jf.setFileFilter(f);
        int files = jf.showOpenDialog(null);
        if (files == JFileChooser.APPROVE_OPTION)
        {
            nomeArquivo= jf.getSelectedFile().getPath();
            Nome = jf.getSelectedFile().getName();
            try{
                BufferedReader br = new BufferedReader(new FileReader(jf.getSelectedFile().getPath()));
                String line= br.readLine();
                while (line!= null) 
                {
                    
                    area.append(line+"\n");
                    line = br.readLine();
                }
            } catch (IOException ex) 
            {
            }
        }
    }

    public void New(JTextArea area)
    {
  
    FileNameExtensionFilter f = new FileNameExtensionFilter("GXML", "gxml");
    FileNameExtensionFilter f1 = new FileNameExtensionFilter("FunctionScript", "fs");
      
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
           else if(Descrição.equalsIgnoreCase("FunctionScript"))
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
