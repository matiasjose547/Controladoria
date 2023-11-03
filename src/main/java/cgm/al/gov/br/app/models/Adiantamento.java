package cgm.al.gov.br.app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "adiantamento")
public class Adiantamento extends AbstractEntity {

    @NotBlank(message = "Informe o numero do processo.")
    @NotNull(message = "Informe o numero do processo.")
    @Column(name = "numero_processo", unique = true, nullable = false)
    private String processo;

    @Column(name = "nota_empenho")
    private String notaEmpenho;

    @Column(name = "valor_concedido")
    private BigDecimal valorConcedido;

    @Column(name = "valor_nao_utilizado")
    private BigDecimal valorNaoUtilizado;

    @Column(name = "data_concessao")
    @Temporal(TemporalType.DATE)
    private Date dataConcessao;

    @Column(name = "data_prestacao_contas")
    @Temporal(TemporalType.DATE)
    private Date dataPrestacaoContas;
    @Lob
    @Column(length = 512)
    private String apontamentos;

    @Column(name = "nome_documento")
    private String nomeDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora unidadeGestora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servidor_id")
    private Servidor servidor;
    @Column(name = "nome_servidor")
    private String nomeServidor;

    public void setProcesso(String processo) {
        this.processo = processo.toUpperCase();
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor.toUpperCase();
    }
}

