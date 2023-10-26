package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

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
