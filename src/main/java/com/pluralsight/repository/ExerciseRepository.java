package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

/*
public interface ExerciseRepository {

	Exercise save (Exercise exercise);
	
}

*/

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{

   //	Exercise save (Exercise exercise);  // No need of this
	
}
