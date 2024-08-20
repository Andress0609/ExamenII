/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class ListaTickets {
    private ArrayList<Ticket> tickets;

    public ListaTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
  public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
    }
  
   public boolean eliminarTicketPosicion(int index) {
        if (index >= 0 && index < tickets.size()) {
            tickets.remove(index);
            return true; 
        }
        return false; 
    }

    public boolean eliminarTicketValor(Ticket ticket) {
        return tickets.remove(ticket); 
    }
  
    public List<Ticket> buscarTicketsPorTipo(tipos tipoBuscado) {
        List<Ticket> resultados = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getTipo() == tipoBuscado) {
                resultados.add(ticket);
            }
        }
        return resultados;
    }
}
