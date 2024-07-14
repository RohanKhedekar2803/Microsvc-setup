package com.example.personal.project.quiz_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personal.project.quiz_service.entities.Quiz;
import com.example.personal.project.quiz_service.services.quizService;

@RestController
@RequestMapping("/quiz/")
public class QuizController {
	
	@Autowired
	private quizService quizservice;
	
	@PostMapping("/data")
	public Quiz addquize(@RequestBody Quiz quiz) {
		return quizservice.addQuiz(quiz);
	}
	
	@GetMapping("/data")
	public List<Quiz> getAll() {
		return quizservice.getquizes();
	}
	
	@GetMapping("/{id}")
	public Quiz getquiz(@PathVariable Long id) {
		return quizservice.getQuiz(id);
	}
}
