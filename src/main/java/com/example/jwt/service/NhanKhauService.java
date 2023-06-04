package com.example.jwt.service;

import com.example.jwt.entity.NhanKhau;
import com.example.jwt.repository.NhanKhauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanKhauService {
    @Autowired
    private NhanKhauRepository nhanKhauRepository;
    public List<NhanKhau> getNhanKhau(){
        return nhanKhauRepository.findAll();
    }

}
