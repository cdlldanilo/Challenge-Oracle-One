package br.com.alura.hotel.tests;

import br.com.alura.hotel.controllers.ReservaController;

public class TestaEditarReserva {
    
    public static void main(String[] args) {
        ReservaController reservaController = new ReservaController();
        reservaController.alterar(1, "2023-02-15", "2023-02-15", 600.0F, "DINHEIRO");
    }
}
