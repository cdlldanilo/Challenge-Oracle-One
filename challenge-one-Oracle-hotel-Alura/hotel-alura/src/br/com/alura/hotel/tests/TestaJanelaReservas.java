package br.com.alura.hotel.tests;

import br.com.alura.hotel.controllers.ReservaController;

public class TestaJanelaReservas {

    public static void main(String[] args) {
        ReservaController reservaController = new ReservaController();

        // dados
        String dataEntrada = "2022-12-23";
        String dataSaida = "2023-02-12";
        float valor = 1000.00f;
        String formaPagamento = "Cartão de Crédito";

        reservaController.reservar(dataEntrada, dataSaida, valor, formaPagamento);    
    }
}
