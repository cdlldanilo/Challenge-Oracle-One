package br.com.oracle.alura.forum.ForumAlura.autor;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    private String nome;
    private String senha;


    public Autor(DadosAutor dados) {
        this.nome = dados.nome();
        this.senha = dados.senha();
    }

    public void atualizarInformacoes(DadosAutor dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }

        if (dados.senha() != null) {
            this.senha = dados.senha();
        }

    }
}
