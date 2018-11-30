/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class clientes implements Serializable{
    private String nombre;
    private String apellido;
    private String tarjeta;
    private int pago_tar;
    private int billetera;
    private ArrayList<alimentos> recibos=new ArrayList();
    
    private static final long SerializableVersionUID=1L;

    public clientes(String nombre, String apellido, String tarjeta, int pago_tar, int billetera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
        this.pago_tar = pago_tar;
        this.billetera = billetera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getPago_tar() {
        return pago_tar;
    }

    public void setPago_tar(int pago_tar) {
        this.pago_tar = pago_tar;
    }

    public int getBilletera() {
        return billetera;
    }

    public void setBilletera(int billetera) {
        this.billetera = billetera;
    }

    public ArrayList<alimentos> getRecibos() {
        return recibos;
    }

    public void setRecibos(ArrayList<alimentos> recibos) {
        this.recibos = recibos;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", tarjeta=" + tarjeta + ", pago_tar=" + pago_tar + ", billetera=" + billetera + ", recibos=" + recibos + '}';
    }
    
    
    
}
