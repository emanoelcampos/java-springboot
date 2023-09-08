package dev.emanoel.curso01.med.voll.medico;

import dev.emanoel.curso01.med.voll.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "Medico")
@Table(name = "medicos")
@Getter //métodos getters dos atributos
@NoArgsConstructor //construtor padrão sem argumentos, jpa exige em todas as entidades
@AllArgsConstructor //construtor que recebe todos os campos
@EqualsAndHashCode(of = "id") //gerar equals e hashcode em cima do id e não em de todos os atributos
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.telefone = dados.telefone();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
