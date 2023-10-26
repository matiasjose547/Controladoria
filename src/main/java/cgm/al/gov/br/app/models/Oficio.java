package br.com.sgci.persistence.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "oficio")
@Data
public class Oficio extends AbstractEntity {
    private Integer numero;
    @Lob
    @Column(length = 512)
    @Length(message="Você atingiu o máximo de 512 caracteres.")
    private String processo;
    @Temporal(TemporalType.DATE)
    private Date data;
    private String objeto;
    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora orgaoDestino;
    @Column(name = "arquivo_anexo")
    @OneToMany(mappedBy="oficio", cascade = CascadeType.ALL)
    private List<FileAnexo> arquivoAnexo;

    public String getNumberFormat() {
        return String.format("%0" +3+"d", this.numero) +"/SMCI";
    }
}
