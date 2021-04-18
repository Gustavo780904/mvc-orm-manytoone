package com.santos.exercicio.exercicio3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santos.exercicio.exercicio3.domain.PostComment;

public interface PostCommentRepository extends JpaRepository<PostComment, Integer>{

}
