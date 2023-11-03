package cgm.al.gov.br.app.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "consultoria")
public class Consultoria extends AbstractEntity {
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "objeto_consulta")
    private String objetoConsulta;

    private String meio;

    @Lob
    @Column(length = 512)
    @Length(message="Você atingiu o máximo de 512 caracteres.")
    private String orientacao;

    @Column(name = "valor_observado")
    private BigDecimal valorObservado;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servidor_id")
    private Servidor servidor;

    @Column(name = "nome_documento")
    private String nomeDocumento;

    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora unidadeGestora;
    @Column(name = "nome_servidor")
    private String nomeServidor;

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor.toUpperCase();
    }
}
