package br.com.oracle.alura.forum.ForumAlura.topico;

import br.com.oracle.alura.forum.ForumAlura.autor.Autor;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String curso;
    private String statusTopico;

    @Embedded
    private Autor autor;

    public Topico(DadosCadastroTopico dados) {

        this.statusTopico = "Nao";
        this.titulo = dados.titulo();
        this.dataCriacao = LocalDateTime.now();
        this.mensagem = dados.mensagem();
        this.curso = dados.curso();
        this.autor = new Autor(dados.autor());
    }

    public void atualizarInformacao(DadosAtualizacaoTopico dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }

        if (dados.mensagem() != null) {
             this.mensagem = dados.mensagem();
        }

        if (dados.curso() != null) {
            this.curso = dados.curso();
        }

        if (dados.autor() != null) {
            this.autor.atualizarInformacoes(dados.autor());
        }
    }
}
