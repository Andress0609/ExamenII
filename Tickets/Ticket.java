/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

/**
 *
 * @author Student
 */
public class Ticket {
    private int numero;
    private tipos tipo;

    public int getNumero() {
        return numero;
    }

    public tipos getTipo() {
        return tipo;
    }

    public void setTipo(tipos tipo) {
        this.tipo = tipo;
    }

    public Ticket(int numero, tipos tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Ticket() {
        this(0,null);
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }

    
    
    
    
    
}
