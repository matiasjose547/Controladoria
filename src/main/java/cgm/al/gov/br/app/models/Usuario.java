package cgm.al.gov.br.app.models;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
