package cgm.al.gov.br.app.models;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "unidade_gestora")
public class UnidadeGestora extends AbstractEntity {
    @Column(unique = true)
    private String codigo;
    @Column(unique = true)
    private String nome;
    @Column(unique = true, length = 100)
    private String sigla;

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setSigla(String sigla) {
        this.sigla = sigla.toUpperCase();
    }
}
