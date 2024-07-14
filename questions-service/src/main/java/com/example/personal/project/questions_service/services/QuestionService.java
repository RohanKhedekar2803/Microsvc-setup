package com.example.personal.project.questions_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personal.project.questions_service.entities.QuestionEntity;
import com.example.personal.project.questions_service.repos.QuestionRepo;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;
	
	public QuestionEntity create(QuestionEntity questionEntity) {
		return questionRepo.save(questionEntity);
	}
	
	public QuestionEntity getone(Long id) {
		return questionRepo.findById(id).orElseThrow( () -> new RuntimeException("question not found") );
	}
	
	public List<QuestionEntity> getAll() {
		return questionRepo.findAll();
	}
}
