package br.com.alura.hotel.models;


public class Hospede {
    private Integer id;
    private String nome;
    private String sobreNome;
    private String dataNascimento;
    private String nacionalidade;
    private String telefone;
    private Integer idReserva;


    public Hospede(Integer id, String nome, String sobreNome, String dataNascimento, String nacionalidade, String telefone,
            Integer idReserva) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.idReserva = idReserva;
    }
    

    @Override
    public String toString() {
        return "Hóspede: " + id +
                " Nome: " + nome +
                " Sobrenome: " + sobreNome +
                " dataNascimento: " + dataNascimento + 
                " nacionalidade: " + nacionalidade +
                " telefone: " + telefone + 
                " idReserva: " + idReserva;
    }


    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public Integer getIdReserva() {
        return idReserva;
    }

}
