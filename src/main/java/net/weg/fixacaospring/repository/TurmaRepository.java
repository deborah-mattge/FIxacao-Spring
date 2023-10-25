package net.weg.fixacaospring.repository;

import net.weg.fixacaospring.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma,Long> {
}
