package br.com.alura.hotel.controllers;

import java.util.List;
import java.sql.Connection;

import br.com.alura.hotel.dao.HospedeDAO;
import br.com.alura.hotel.factory.ConnectionFactory;
import br.com.alura.hotel.models.Hospede;

public class HospedeController {
    
    private HospedeDAO hospedeDAO;

    public HospedeController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.hospedeDAO = new HospedeDAO(connection);
    }

    public List<Hospede> listar() {
        List<Hospede> hospedes =  this.hospedeDAO.listar();
        return hospedes;
    }

    public List<Hospede> listarPeloSobreNome(String sobreNome) {
        List<Hospede> hospedes = this.hospedeDAO.listarPeloSobreNome(sobreNome);
        return hospedes;
    }

    public void alterar(Integer id, String nome, String sobreNome, String dataNascimento, String nacionalidade, String telefone, int idReserva) {
        this.hospedeDAO.alterar(id, nome, sobreNome, dataNascimento, nacionalidade, telefone, idReserva);
    }

    public void registrar(String nome, String sobreNome, String dataNascimento, String nacionalidade, String telefone, int idReserva) {
        this.hospedeDAO.registrar(nome, sobreNome, dataNascimento, nacionalidade, telefone, idReserva);
    }

    public void deletar(Integer id) {
        this.hospedeDAO.deletar(id);
    }
}
