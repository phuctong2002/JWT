package com.example.jwt.repository;

import com.example.jwt.entity.HoKhau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoKhauRepository extends JpaRepository<HoKhau, Integer> {

    HoKhau findByMahokhau(int id);
}
