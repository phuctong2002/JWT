package com.example.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table( name = "tamvang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TamVang {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int matamvang;
    @Temporal(TemporalType.DATE)
    private Date ngaydi;
    @Temporal(TemporalType.DATE)
    private Date ngayve;
    private String lido;
    private String noitamtru;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "manhankhau")
    private NhanKhau nhankhau;
}
