package br.com.alura.hotel.controllers;

import java.sql.Connection;
import java.util.List;

import br.com.alura.hotel.dao.ReservaDAO;
import br.com.alura.hotel.factory.ConnectionFactory;
import br.com.alura.hotel.models.Reserva;

public class ReservaController {
    
    private ReservaDAO reservaDAO;

    public ReservaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}

    public List<Reserva> listar() {
		List<Reserva> produtos = this.reservaDAO.listar();
		return produtos;
	}

	public List<Reserva> listarPeloId(Integer id) {
		List<Reserva> produtos = this.reservaDAO.listarPeloId(id);
		return produtos;
	}

	public void alterar(Integer id, String dataEntrada, String dataSaida, float valor, String formaPagamento) {
		this.reservaDAO.alterar(id, dataEntrada, dataSaida, valor, formaPagamento);
	}

	public int reservar(String dataEntrada, String dataSaida, float valor, String formaPagamento){
		return this.reservaDAO.reservar(dataEntrada, dataSaida, valor, formaPagamento);
	}

	public void deletar(Integer id) {
		this.reservaDAO.deletar(id);
	}
}
