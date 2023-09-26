package dev.emanoel.springboot.med.voll.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuario")
@Table(name = "usuarios")
@Getter //métodos getters dos atributos
@NoArgsConstructor //construtor padrão sem argumentos, jpa exige em todas as entidades
@AllArgsConstructor //construtor que recebe todos os campos
@EqualsAndHashCode(of = "id") //gerar equals e hashcode em cima do id e não em de todos os atributos
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
}
