package br.com.alura.hotel.tests;

import br.com.alura.hotel.controllers.HospedeController;

public class TestaRegistrarHospede {

    public static void main(String[] args) {
            
        HospedeController hospedeController = new HospedeController();

        String nome = "danilo";
        String sobreNome = "cardill";
        String dataNascimento = "2017-08-12";
        String nacionalidade = "Argentino";
        String telefone = "0000 00000";
        int idReserva = 2;   
    
        hospedeController.registrar(nome, sobreNome, dataNascimento, nacionalidade, telefone, idReserva);
    }
}
