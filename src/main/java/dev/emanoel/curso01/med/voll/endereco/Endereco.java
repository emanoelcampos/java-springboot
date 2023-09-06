package dev.emanoel.curso01.med.voll.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter //métodos getters dos atributos
@NoArgsConstructor //construtor padrão sem argumentos, jpa exige em todas as entidades
@AllArgsConstructor //construtor que recebe todos os campos
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
}
