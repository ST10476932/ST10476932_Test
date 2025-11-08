/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gui_5;

/*
 * @author M. Desai - ST10476932
 */

public interface IMovieTickets {
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice);
    boolean ValidateData(MovieTickets movieTicketData);
}
