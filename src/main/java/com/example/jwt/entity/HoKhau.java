package com.example.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hokhau")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoKhau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mahokhau;
    private String diachi;
    @OneToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "chuho")
    private NhanKhau nhanKhau;
}
