package cgm.al.gov.br.app.models;


import cgm.al.gov.br.app.models.enums.Recomendacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "avaliacao_controle_interno")
public class AvaliacaoControleInterno extends AbstractEntity {
    private Integer numero;
    @Temporal(TemporalType.DATE)
    private Date data;

    @NotNull(message = "O campo processo não pode ser nulo.")
    @NotBlank(message = "O campo processo não pode estar em branco.")
    @Column(columnDefinition = "TEXT",nullable = false, unique = true,length = 512)
    private String processo;

    private String tipo;
    @Lob
    @Column(length = 512)
    private String objeto;

    @Column(name = "valor_observado", nullable = false)
    private BigDecimal ValorObservado;

    @Column(name = "valor_economizado")
    private BigDecimal valorEconomizado;

    @Enumerated(EnumType.STRING)
    private Recomendacao recomendacao;

    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora unidadeGestora;

    @Column(name = "arquivo_anexo")
    @OneToMany(mappedBy="avaliacaoControleInterno", cascade=CascadeType.ALL)
    private List<FileAnexo> arquivoAnexo;

    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public void setProcesso(String processo) {
        this.processo = processo.toUpperCase();
    }

    public String getNumberFormat() {
        return String.format("%0" +3+"d", this.numero)+ "/SMCI";
    }
}
