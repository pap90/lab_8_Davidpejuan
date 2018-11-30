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
public class administrarclientes {

    private ArrayList<clientes> listaclientes = new ArrayList();
    private File archivo = null;

    public administrarclientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<clientes> getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList<clientes> listaclientes) {
        this.listaclientes = listaclientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setcliente(clientes c) {
        this.listaclientes.add(c);
    }

    public void cargarArchivo() {
        try {
            listaclientes = new ArrayList();
            clientes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (clientes) objeto.readObject()) != null) {
                        listaclientes.add(temp);
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
            for (clientes t : listaclientes) {
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
}
