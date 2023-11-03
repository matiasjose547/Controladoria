package cgm.al.gov.br.app.models;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permissao")
@Data
public class Permissao extends AbstractEntity{
    private String nome;
    private String descricao;
}
