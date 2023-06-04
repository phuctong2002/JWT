package com.example.jwt.service;

import com.example.jwt.dto.ThanhVienDTO;
import com.example.jwt.entity.HoKhau;
import com.example.jwt.entity.NhanKhau;
import com.example.jwt.entity.ThanhVien;
import com.example.jwt.mapper.ThanhVienMapper;
import com.example.jwt.repository.HoKhauRepository;
import com.example.jwt.repository.NhanKhauRepository;
import com.example.jwt.repository.ThanhVienRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ThanhVienService {
    @Autowired
    private NhanKhauRepository nhanKhauRepository;
    @Autowired
    private HoKhauRepository hoKhauRepository;
    @Autowired
    private ThanhVienRepository thanhVienRepository;
    @Autowired
    private ThanhVienMapper mapper;
    public List<ThanhVienDTO> getThanhVienDTOs(int hokhau) {
        return thanhVienRepository.findByHokhau(hokhau).stream().map(thanhvien -> mapper.convertDTO(thanhvien)).collect(Collectors.toList());
    }
    public String addThanhVien( int id, ThanhVienDTO thanhVienDTO){
        HoKhau hokhau = hoKhauRepository.findByMahokhau(id);
        NhanKhau newNhanKhau = new NhanKhau();
        ModelMapper mapper = new ModelMapper();
        newNhanKhau = mapper.map(thanhVienDTO, NhanKhau.class);
        System.out.println(newNhanKhau);
        System.out.println(hokhau);
        NhanKhau result = nhanKhauRepository.save(newNhanKhau);
        ThanhVien tv = new ThanhVien();
        tv.setQuanhe( thanhVienDTO.getQuanhe());
        tv.setGhichu(thanhVienDTO.getGhichu());
        tv.setHokhau(hokhau);
        tv.setNhankhau(result);
        thanhVienRepository.save(tv);
        return "Thanh Cong nhe";
    }
}
