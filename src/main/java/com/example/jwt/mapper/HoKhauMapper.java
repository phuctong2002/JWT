package com.example.jwt.mapper;

import com.example.jwt.dto.HoKhauDTO;
import com.example.jwt.entity.HoKhau;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class HoKhauMapper {
    public HoKhauDTO convertHoKhauDTO(HoKhau hoKhau){
        HoKhauDTO res = new HoKhauDTO();
        res.setMahokhau(hoKhau.getMahokhau());
        res.setDiachi(hoKhau.getDiachi());
        res.setHoten(hoKhau.getNhanKhau().getHoten());
        res.setManhankhau(hoKhau.getNhanKhau().getManhankhau());
        return res;
    }
}
