package dev.emanoel.springboot.med.voll.medico;

import dev.emanoel.springboot.med.voll.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
