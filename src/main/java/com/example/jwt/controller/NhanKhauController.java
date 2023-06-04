package com.example.jwt.controller;

import com.example.jwt.service.NhanKhauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.oauth2.client.OAuth2ClientSecurityMarker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/nhankhau")
public class NhanKhauController {
    @Autowired
    private NhanKhauService nhanKhauService;
    @GetMapping("")
    public ResponseEntity<Object> getNhanKhau(){
        return new ResponseEntity<>( nhanKhauService.getNhanKhau(), HttpStatus.OK);
    }
}
