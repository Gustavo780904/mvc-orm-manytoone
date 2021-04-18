package com.santos.exercicio.exercicio3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santos.exercicio.exercicio3.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
