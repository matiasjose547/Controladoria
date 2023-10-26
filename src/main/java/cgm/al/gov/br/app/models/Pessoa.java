package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class Pessoa extends AbstractEntity {
    protected String nome;

    protected Boolean ativo;

    @Column(name = "data_cadastro")
    protected Date dataCadastro;

    protected String cpf;

    protected String matricula;

    public Long getId() {
        return super.getId();
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
}
