package com.marcohnp.dev1lista2.repository;

import com.marcohnp.dev1lista2.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Integer> {
}
