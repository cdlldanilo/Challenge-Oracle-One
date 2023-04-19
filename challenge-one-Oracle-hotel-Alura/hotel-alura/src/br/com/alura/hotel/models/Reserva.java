package br.com.alura.hotel.models;

public class Reserva {
    private Integer id;
    private String dataEntrada;
    private String dataSaida;
    private float valor;
    private String formaPagamento;

    public Reserva(Integer id, String dataEntrada, String dataSaida, float valor, String formaPagamento) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public Integer getId() {
        return id;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public float getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    @Override
    public String toString() {
        return "Reserva: " + id +
                " Entrada na data: " + dataEntrada +
                " Saída na data: " + dataSaida +
                " Com o valor de: " + valor + 
                " Usando a forma de pagamento: " + formaPagamento;
    }
}
