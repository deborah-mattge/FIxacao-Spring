package net.weg.fixacaospring.service;

import net.weg.fixacaospring.model.Professor;
import net.weg.fixacaospring.model.Turma;
import net.weg.fixacaospring.repository.ProfessorRepository;
import net.weg.fixacaospring.repository.TurmaRepository;

import java.util.List;

public class ProfessorService {
    private ProfessorRepository professorRepository;
    public void salvar(Professor turma){
        professorRepository.save(turma);
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
