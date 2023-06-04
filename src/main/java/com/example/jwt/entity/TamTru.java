package com.example.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tamtru")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TamTru {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int matamtru;
    @Temporal( TemporalType.DATE)
    private Date ngayden;
    @Temporal(TemporalType.DATE)
    private Date ngaydi;
    private String lido;
    private String noitamtru;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "manhankhau")
    private NhanKhau nhanKhau;
}
