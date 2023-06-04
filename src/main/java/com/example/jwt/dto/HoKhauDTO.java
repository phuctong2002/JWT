package com.example.jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoKhauDTO {
    private int mahokhau;
    private int manhankhau;
    private String hoten;
    private String diachi;
}
