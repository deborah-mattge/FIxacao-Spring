package net.weg.fixacaospring.repository;

import net.weg.fixacaospring.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
