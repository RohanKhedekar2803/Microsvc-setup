package com.example.personal.project.quiz_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personal.project.quiz_service.Clients.QuestionClient;
import com.example.personal.project.quiz_service.entities.Quiz;
import com.example.personal.project.quiz_service.repos.quizRepository;

@Service
public class quizService {
	
	@Autowired
	private quizRepository quizrepository;
	
	@Autowired
	private QuestionClient questionClient;
	
	public List<Quiz> getquizes(){
		
		List<Quiz> quizList = quizrepository.findAll();
        for (Quiz quiz : quizList) {
        	
            quiz.setQuestions(questionClient.getAllQuestion());
            
        }
        return quizList;
	}
	
	public Quiz getQuiz(Long id){
		Quiz quiz = quizrepository.findById(id).orElseThrow( () -> new RuntimeException("user not found") );
		quiz.setQuestions(questionClient.getAllQuestion());
		return quiz;
	}
	
	public Quiz addQuiz(Quiz quiz){
		return quizrepository.save(quiz);
	}
	
}
