package com.example.jwt.repository;

import com.example.jwt.entity.NhanKhau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NhanKhauRepository  extends JpaRepository<NhanKhau, Integer> {
    List<NhanKhau> findAll();
    NhanKhau findById(int id);

}
