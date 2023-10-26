package br.com.sgci.persistence.models;

import lombok.Data;

import javax.persistence.*;

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
