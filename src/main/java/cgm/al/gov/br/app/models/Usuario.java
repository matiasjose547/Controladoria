package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
@Data
public class Usuario extends Pessoa {
    @NotNull(message = "O nome de usuário não pode estar vazio")
    @NotBlank(message = "O nome de usuário não pode estar em branco")
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private String token;
}
