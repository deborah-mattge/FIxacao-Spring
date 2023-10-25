package net.weg.fixacaospring.service;

import net.weg.fixacaospring.model.Turma;
import net.weg.fixacaospring.repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TurmaService {

    private  TurmaRepository turmaRepository;
    public void salvar(Turma turma){
        turmaRepository.save(turma);
    }
    public Turma buscarUm(Long id){
        return turmaRepository.findById(id).get();
    }
    public List<Turma> buscarTodos(){
        return turmaRepository.findAll();
    }
    public void deletar(Long id){
        turmaRepository.deleteById(id);
    }
}


