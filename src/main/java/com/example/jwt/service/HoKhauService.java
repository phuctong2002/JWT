package com.example.jwt.service;

import com.example.jwt.dto.HoKhauDTO;
import com.example.jwt.entity.HoKhau;
import com.example.jwt.mapper.HoKhauMapper;
import com.example.jwt.repository.HoKhauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HoKhauService {
    @Autowired
    private HoKhauMapper mapper;
    @Autowired
    private HoKhauRepository hoKhauRepository;
    public List<HoKhauDTO> getAllHoKhauDTO(){
        List<HoKhau> hokhaus = hoKhauRepository.findAll();
        return hokhaus.stream().map( hokhau -> mapper.convertHoKhauDTO(hokhau)).collect(Collectors.toList());
    }
}
