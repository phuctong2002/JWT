package com.example.jwt.service;

import com.example.jwt.dto.TamVangDTO;
import com.example.jwt.entity.NhanKhau;
import com.example.jwt.entity.TamVang;
import com.example.jwt.mapper.TamVangMapper;
import com.example.jwt.repository.NhanKhauRepository;
import com.example.jwt.repository.TamTruRepository;
import com.example.jwt.repository.TamVangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TamVangService {
    @Autowired
    private TamVangRepository tamVangRepository;

    @Autowired
    private NhanKhauRepository nhanKhauRepository;
    @Autowired
    private TamVangMapper mapper;
    public List<TamVangDTO> getAllTamVang(){
        List<TamVang> list = tamVangRepository.findAll();
        return list.stream().map( tamvang -> mapper.convertToDto(tamvang)).collect(Collectors.toList());
    }
    public String deleteTamvangById(int id){
        tamVangRepository.deleteById(id);
        return "Thanh cong";
    }

    public String addTamVang(TamVangDTO tamVangDTO){
        TamVang tamvang = mapper.convert(tamVangDTO);
        NhanKhau nhanKhau = nhanKhauRepository.findById( tamVangDTO.getManhankhau());
        tamvang.setNhankhau(nhanKhau);
        tamVangRepository.save(tamvang);
        return "Add thanh cong";
    }
}
