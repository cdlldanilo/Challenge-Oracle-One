package br.com.oracle.alura.forum.ForumAlura.topico;

import br.com.oracle.alura.forum.ForumAlura.autor.DadosAutor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, String statusTopico, String curso) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatusTopico(), topico.getCurso());
    }

}
