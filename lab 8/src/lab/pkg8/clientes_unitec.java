/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

/**
 *
 * @author david
 */
public class clientes_unitec extends clientes{
    private int numerocuenta;

    public clientes_unitec(int numerocuenta, String nombre, String apellido, String tarjeta, int pago_tar, int billetera) {
        super(nombre, apellido, tarjeta, pago_tar, billetera);
        this.numerocuenta = numerocuenta;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
