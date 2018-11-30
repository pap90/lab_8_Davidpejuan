/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class administrarinventario {
    private File archivo=null;
    private ArrayList<alimentos> listaalimentos=new ArrayList();

    public administrarinventario(String path) {
        archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<alimentos> getListaalimentos() {
        return listaalimentos;
    }

    public void setListaalimentos(ArrayList<alimentos> listaalimentos) {
        this.listaalimentos = listaalimentos;
    }
    
    public void setalimento(alimentos a) {
        this.listaalimentos.add(a);
    }
    public void cargarArchivo() {
        try {
            listaalimentos = new ArrayList();
            alimentos temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (alimentos) objeto.readObject()) != null) {
                        listaalimentos.add(temp);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirarchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (alimentos t : listaalimentos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void borrararchivo(){
        if (archivo.exists()) {
            archivo.delete();
        }
    }
    
    
    
}
