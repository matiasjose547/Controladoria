package cgm.al.gov.br.app.models;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

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
