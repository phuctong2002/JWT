package com.example.jwt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "thanhvien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThanhVien {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String quanhe;
    private String ghichu;

    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "mahokhau")
    private HoKhau hokhau;
    @JsonIgnore
    @OneToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "manhankhau")
    private NhanKhau nhankhau;

}
