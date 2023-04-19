package br.com.alura.hotel.tests;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.hotel.controllers.HospedeController;
import br.com.alura.hotel.models.Hospede;

public class TestaListagemHospedes {
    
    public static void main(String[] args) {
        List<Hospede> hospedes = new ArrayList<>();
        HospedeController hospedeController = new HospedeController();
        hospedes = hospedeController.listar();
        //reservas = reservaController.listarPeloId();

        hospedes.stream().forEach((e) -> {
            System.out.println(e);
        });
    }
}
