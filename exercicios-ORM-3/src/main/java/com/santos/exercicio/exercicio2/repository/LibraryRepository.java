package com.santos.exercicio.exercicio2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santos.exercicio.exercicio2.domain.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
