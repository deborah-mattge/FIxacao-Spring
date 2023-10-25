package net.weg.fixacaospring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Professor extends Usuario{
    @ManyToOne
    private Escola escola;
    @ManyToMany
    private List<Disciplina> listaDeDisciplinas;

}
