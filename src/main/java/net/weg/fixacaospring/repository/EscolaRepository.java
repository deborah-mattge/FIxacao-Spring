package net.weg.fixacaospring.repository;

import net.weg.fixacaospring.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository<Escola,Long> {
}
