package cgm.al.gov.br.app.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "obra")
public class Obra extends AbstractEntity{

    @Column(unique = true, nullable = true)
    @NotNull(message = "O campo numero, não pode ser nulo.")
    private String numero;
    @Temporal(TemporalType.DATE)
    private Date ano;

    @Lob
    @Column(length = 512)
    @Length(message="Você atingiu o máximo de 512 caracteres.")
    private String objeto;

    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column(name = "data_prevista_termino")
    @Temporal(TemporalType.DATE)
    private Date dataPrevistaTermino;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "valor_pago")
    private BigDecimal valorPago;

    //nome documento tem o objetivo de ser o arquivo pdf
    @Column(name = "nome_documento")
    private String nomeDocumento;

//    @Enumerated(EnumType.STRING)
    private String situacao;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresaContratada;

    public int getDataInt(){
        return (this.ano.getYear() + 1);
    }

}
