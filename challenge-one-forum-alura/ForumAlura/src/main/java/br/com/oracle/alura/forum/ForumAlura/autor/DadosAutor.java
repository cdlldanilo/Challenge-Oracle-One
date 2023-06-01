package br.com.oracle.alura.forum.ForumAlura.autor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosAutor(

        @NotBlank
        @Email
        String nome,

        @NotBlank
        String senha) {
}
