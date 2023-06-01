package br.com.oracle.alura.forum.ForumAlura.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, String statusTopico, String curso) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(),  topico.getMensagem(), topico.getDataCriacao(), topico.getStatusTopico(), topico.getCurso());
    }
}
