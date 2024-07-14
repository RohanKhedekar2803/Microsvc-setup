package com.example.personal.project.questions_service.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personal.project.questions_service.entities.QuestionEntity;

@Repository
public interface QuestionRepo extends JpaRepository<QuestionEntity, Long>{
	
	QuestionEntity save(QuestionEntity questionEntity);
	
	List<QuestionEntity> findAll();
	
	Optional<QuestionEntity> findById(Long id);
}
