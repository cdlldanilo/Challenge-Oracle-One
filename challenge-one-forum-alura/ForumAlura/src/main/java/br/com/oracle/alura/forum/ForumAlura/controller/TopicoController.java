package br.com.oracle.alura.forum.ForumAlura.controller;

import br.com.oracle.alura.forum.ForumAlura.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTopico dados) {

        repository.save(new Topico(dados));

    }

    @GetMapping
    public Page<DadosListagemTopico> listar(@PageableDefault(size = 10, sort = {"dataCriacao"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemTopico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTopico dados) {
        var topico= repository.getReferenceById(dados.id());
        topico.atualizarInformacao(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var topico= repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }

}



