package com.example.jwt.repository;

import com.example.jwt.entity.TamTru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TamTruRepository extends JpaRepository<TamTru, Integer> {
    List<TamTru> findAll();

}
