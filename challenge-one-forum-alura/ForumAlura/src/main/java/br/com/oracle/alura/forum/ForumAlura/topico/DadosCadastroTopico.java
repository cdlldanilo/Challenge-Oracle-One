package br.com.oracle.alura.forum.ForumAlura.topico;

import br.com.oracle.alura.forum.ForumAlura.autor.DadosAutor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(

        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotBlank
        String curso,

        @NotNull @Valid DadosAutor autor) {
}
