package com.example.jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ThanhVienDTO {
    private int manhankhau;
    private String hoten;
    private String bidanh;
    private String cccd;
    private Date ngaycap;
    private String noicap;
    private String nghenghiep;
    private String dantoc;
    private String nguyenquan;
    private String noisinh;
    private Date ngaysinh;
    private String ghichu;
    private String quanhe;
}
