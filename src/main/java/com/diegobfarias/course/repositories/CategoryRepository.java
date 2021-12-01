package com.diegobfarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegobfarias.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
