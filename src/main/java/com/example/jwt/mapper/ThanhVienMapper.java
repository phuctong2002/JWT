package com.example.jwt.mapper;

import com.example.jwt.dto.ThanhVienDTO;
import com.example.jwt.entity.ThanhVien;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ThanhVienMapper {
    public ThanhVienDTO convertDTO(ThanhVien thanhVien){
        ThanhVienDTO res = new ThanhVienDTO();
        ModelMapper mapper = new ModelMapper();
        res = mapper.map( thanhVien.getNhankhau(), ThanhVienDTO.class);
        res.setQuanhe(thanhVien.getQuanhe());
        res.setGhichu(thanhVien.getGhichu());
        return res;
    }
}
