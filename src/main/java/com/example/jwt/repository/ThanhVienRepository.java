package com.example.jwt.repository;

import com.example.jwt.entity.ThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ThanhVienRepository extends JpaRepository<ThanhVien, Integer> {
    List<ThanhVien> findAll();
    @Query(value = "SELECT * FROM thanhvien WHERE mahokhau = :hokhau", nativeQuery = true)
    List<ThanhVien> findByHokhau(@Param("hokhau") int mahokhau);
}
