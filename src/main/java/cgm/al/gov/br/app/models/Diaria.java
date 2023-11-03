package cgm.al.gov.br.app.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "diaria")
public class Diaria extends AbstractEntity {

    private String portaria;

    @Temporal(TemporalType.DATE)
    private Date mes;

    @Temporal(TemporalType.DATE)
    private Date dom;//data da publicacao

    private String destino;

    @Lob
    @Column(length = 512)
    @Length(message = "Você atingiu o máximo de 512 caracteres.")
    private String objetivo;

    @Temporal(TemporalType.DATE)
    @Column(name = "saida_sede")
    private Date saidaSede;

    @Temporal(TemporalType.DATE)
    private Date dataRetorno;

    @Column(name = "quantidade_diarias")
    private int quantidadeDiarias;

    @Column(name = "valor_pago")
    private BigDecimal valorPago;

    private String observacao;

    @Column(name = "nome_documento")
    private String nomeDocumento;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id")
    private Servidor beneficiario;
    @Column(name = "nome_beneficiario")
    private String nomeBeneficiario;

    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora unidadeGestora;


    public String getMesString() {
        String month = "";

        switch (this.mes.getMonth()+1) {
            case 1: month = "JANEIRO"; break;
            case 2: month = "FEVEREIRO"; break;
            case 3: month = "MARÇO"; break;
            case 4: month = "ABRIL"; break;
            case 5: month = "MAIO"; break;
            case 6: month = "JUNHO"; break;
            case 7: month = "JULHO"; break;
            case 8: month = "AGOSTO"; break;
            case 9: month = "SETEMBRO"; break;
            case 10: month = "OUTUBRO"; break;
            case 11: month = "NOVEMBRO"; break;
            default: month = "DEZEMBRO";
        }
        return month;
    }
}
