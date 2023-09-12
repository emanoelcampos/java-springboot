package dev.emanoel.curso01.med.voll.controller;

import dev.emanoel.curso01.med.voll.medico.DadosCadastroMedico;
import dev.emanoel.curso01.med.voll.medico.DadosListagemMedico;
import dev.emanoel.curso01.med.voll.medico.Medico;
import dev.emanoel.curso01.med.voll.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(DadosListagemMedico::new);
    }
}
