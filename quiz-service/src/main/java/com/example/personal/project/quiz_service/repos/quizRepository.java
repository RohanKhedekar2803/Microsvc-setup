package com.example.personal.project.quiz_service.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personal.project.quiz_service.entities.Quiz;

@Repository
public interface quizRepository extends JpaRepository<Quiz,Long>{
	
	Quiz save(Quiz quiz);
	List<Quiz> findAll();
	Optional<Quiz> findById(Long id);
}
