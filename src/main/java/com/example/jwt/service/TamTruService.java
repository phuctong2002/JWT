package com.example.jwt.service;

import com.example.jwt.entity.TamTru;
import com.example.jwt.repository.TamTruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TamTruService {
    @Autowired
    private TamTruRepository tamTruRepository;

    public List<TamTru> getAllTamTru(){
        return tamTruRepository.findAll();
    }
}
