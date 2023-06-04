package com.example.jwt.controller;

import com.example.jwt.dto.ThanhVienDTO;
import com.example.jwt.service.ThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/thanhvien")
public class ThanhVienController {
    @Autowired
    private ThanhVienService service;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAll(@PathVariable("id") int id){
        System.out.println(id);
        return new ResponseEntity<>( service.getThanhVienDTOs(id), HttpStatus.OK);
    }
    @PostMapping("/{id}")
    public ResponseEntity<Object> addThanhVien(@PathVariable("id") int id, @RequestBody ThanhVienDTO thanhVienDTO){
        service.addThanhVien(id, thanhVienDTO);
        return new ResponseEntity<>("message", HttpStatus.CREATED);
    }
}
