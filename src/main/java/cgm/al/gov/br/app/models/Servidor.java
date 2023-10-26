package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


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
