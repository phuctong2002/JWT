package com.example.jwt.controller;

import com.example.jwt.dto.HoKhauDTO;
import com.example.jwt.entity.HoKhau;
import com.example.jwt.mapper.HoKhauMapper;
import com.example.jwt.repository.*;
import com.example.jwt.service.TamTruService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private HoKhauMapper hoKhauMapper;
    @Autowired
    private HoKhauRepository hoKhauRepository;
    @Autowired
    private NhanKhauRepository nhanKhauRepository;
    @Autowired
    private TamTruService tamTruService;
    @Autowired
    private ThanhVienRepository thanhVienRepository;

    @GetMapping("/api/v1/test")
    public String test(){
        System.out.println(tamTruService.getAllTamTru());
        return "test nhe anh em";
    }
}
