package cgm.al.gov.br.app.models;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "file_anexo")
public class FileAnexo extends AbstractEntity {
    @Column(name = "file_path")
    private String filePath;

    @ManyToOne
    private AvaliacaoControleInterno avaliacaoControleInterno;

    @ManyToOne
    private Oficio oficio;

    public FileAnexo(String filePath) {
        this.filePath = filePath;
    }
}
