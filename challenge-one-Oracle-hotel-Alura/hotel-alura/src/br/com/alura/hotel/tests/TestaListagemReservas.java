package br.com.alura.hotel.tests;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.hotel.controllers.ReservaController;
import br.com.alura.hotel.models.Reserva;

public class TestaListagemReservas {
    
    public static void main(String[] args) {
        List<Reserva> reservas = new ArrayList<>();
        ReservaController reservaController = new ReservaController();
        reservas = reservaController.listar();
        //reservas = reservaController.listarPeloId();

        reservas.stream().forEach((e) -> {
            System.out.println(e);
        });
    }
}
