package com.example.jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TamVangDTO {
    private int matamvang;
    private int manhankhau;
    private String hoten;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaydi;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayve;
    private String lido;
    private String noitamtru;
}
