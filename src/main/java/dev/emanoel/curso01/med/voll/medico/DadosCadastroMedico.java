package dev.emanoel.curso01.med.voll.medico;

import dev.emanoel.curso01.med.voll.Endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
