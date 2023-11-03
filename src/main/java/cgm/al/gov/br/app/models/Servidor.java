package cgm.al.gov.br.app.models;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Data
@Entity
@Table(name = "servidor")
public class Servidor extends Pessoa {
    private boolean revisor;
    private boolean responsavel;
    private boolean beneficiario;

    {
        revisor = false;
        responsavel = false;
        beneficiario = false;
    }

}
