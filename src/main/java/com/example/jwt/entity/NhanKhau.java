package com.example.jwt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table( name = "nhankhau")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanKhau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manhankhau;
    private String hoten;
    private String bidanh;
    private String cccd;
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    private String noicap;
    private String noilamviec;
    private String nghenghiep;
    private String dantoc;
    private String nguyenquan;
    private String noisinh;
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
}
