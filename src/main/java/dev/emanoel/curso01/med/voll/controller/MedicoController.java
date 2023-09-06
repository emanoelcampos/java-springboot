package dev.emanoel.curso01.med.voll.controller;

import dev.emanoel.curso01.med.voll.endereco.Endereco;
import dev.emanoel.curso01.med.voll.medico.DadosCadastroMedico;
import dev.emanoel.curso01.med.voll.medico.Medico;
import dev.emanoel.curso01.med.voll.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}
