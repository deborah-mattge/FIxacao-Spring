package net.weg.fixacaospring.repository;

import net.weg.fixacaospring.model.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor,Long> {
}
