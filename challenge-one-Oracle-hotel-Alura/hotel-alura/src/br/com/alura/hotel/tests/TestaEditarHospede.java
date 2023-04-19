package br.com.alura.hotel.tests;

import br.com.alura.hotel.controllers.HospedeController;

public class TestaEditarHospede {
    
    public static void main(String[] args) {
        
        HospedeController hospedeController = new HospedeController();
        hospedeController.alterar(1, "Silas", "Alves de Sá", "1998-05-04", "brasileiro", "(88) 9 9781-1989", 1);

    }
}
