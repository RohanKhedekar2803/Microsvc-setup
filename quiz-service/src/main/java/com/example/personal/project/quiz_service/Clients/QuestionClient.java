package com.example.personal.project.quiz_service.Clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.personal.project.quiz_service.entities.Question;


@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {
	
	@GetMapping("question/{id}")
	Question getQuestion(Long id);
	
	@GetMapping("question")
	List<Question> getAllQuestion();

}
