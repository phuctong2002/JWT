package com.example.jwt.repository;

import com.example.jwt.entity.TamVang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TamVangRepository extends JpaRepository<TamVang, Integer> {
    List<TamVang> findAll();
}
