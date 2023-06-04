package com.example.jwt.controller;

import com.example.jwt.service.HoKhauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hokhau")
public class HoKhauController {
    @Autowired
    private HoKhauService hoKhauService;
    @GetMapping("")
    public ResponseEntity<Object> getAllHoKhau(){
        return new ResponseEntity<>(hoKhauService.getAllHoKhauDTO(), HttpStatus.OK);
    }
}
