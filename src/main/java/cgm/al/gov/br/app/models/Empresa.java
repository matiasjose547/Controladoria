package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "empresa")
public class Empresa extends AbstractEntity {
    @Column(unique = true)
    private String cnpj;

    @Column(name="razaosocial")
    private String nome;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj.replaceAll("[\\.,/-]", "");
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
}
