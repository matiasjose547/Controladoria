package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "permissao")
@Data
public class Permissao extends AbstractEntity{
    private String nome;
    private String descricao;
}
