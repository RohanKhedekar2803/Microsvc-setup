package com.example.personal.project.questions_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personal.project.questions_service.entities.QuestionEntity;
import com.example.personal.project.questions_service.services.QuestionService;



@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("")
	public QuestionEntity addquize(@RequestBody QuestionEntity question) {
		return questionService.create(question);
	}
	
	@GetMapping("")
	public List<QuestionEntity> getAll() {
		return questionService.getAll();
	}
	
	@GetMapping("/{id}")
	public QuestionEntity getquestion(@PathVariable Long id) {
		return questionService.getone(id);
	}
}
