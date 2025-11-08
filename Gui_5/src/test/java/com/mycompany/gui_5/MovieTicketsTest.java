/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gui_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author desai
 */
public class MovieTicketsTest {
      
    @Test
    public void CalculateTotalTicketPrice_CalculateSuccessfully() {
        MovieTickets processor = new MovieTickets();
        double result = processor.CalculateTotalTicketPrice(3, 100.0);
        assertEquals(342.0, result, 0.01);
    }
    
    @Test
    public void ValidationTests() {
        MovieTickets processor = new MovieTickets();
        MovieTicketData badData = new MovieTicketData("", 2, 50.0);
        boolean isValid = processor.ValidateData(badData);
        assertFalse(isValid);
    }
}
