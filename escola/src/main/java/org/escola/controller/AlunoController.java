package org.escola.controller;

import java.util.List;

import org.escola.model.EscolaModel;
import org.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AlunoController {
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/aluno")
	public List<EscolaModel> PegarTodos(){
		return repository.findAll();		
	}
	@PostMapping("/aluno")
	public EscolaModel criar (@RequestBody EscolaModel model) {
		repository.save(model);
		return model;
	}
	@GetMapping("/aluno/nome/{nome}")
	public List<EscolaModel> buscarPorNome (@PathVariable Long id){
		return repository.findByNome(id);
	}
	@PostMapping("/turma")
	public EscolaModel novaTurma (@RequestBody EscolaModel turma) {
		repository.save(turma);
		return turma;
	}	

}
