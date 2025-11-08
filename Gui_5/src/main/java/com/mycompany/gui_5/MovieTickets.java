/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui_5;

/*
 * @author M. Desai - ST10476932
 */

public class MovieTickets implements IMovieTickets {
    
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subtotal = numberOfTickets * ticketPrice;
        double vat = subtotal * 0.14; // 14% VAT
        return subtotal + vat;
    }
    
    public boolean ValidateData(MovieTicketData movieTicketData) {
        // Check movie name
        if (movieTicketData.getMovieName() == null || movieTicketData.getMovieName().trim().isEmpty()) {
            return false;
        }
        
        // Check number of tickets
        if (movieTicketData.getNumberOfTickets() <= 0) {
            return false;
        }
        
        // Check ticket price
        if (movieTicketData.getTicketPrice() <= 0) {
            return false;
        }
        
        return true;
    }

    @Override
    public boolean ValidateData(MovieTickets movieTicketData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
