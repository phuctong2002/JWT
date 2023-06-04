package com.example.jwt.mapper;

import com.example.jwt.dto.TamVangDTO;
import com.example.jwt.entity.TamVang;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TamVangMapper {
    public TamVangDTO convertToDto(TamVang tamvang){
        ModelMapper mapper = new ModelMapper();
        TamVangDTO res = new TamVangDTO();
        res = mapper.map( tamvang, TamVangDTO.class);
        res.setHoten( tamvang.getNhankhau().getHoten());
        res.setManhankhau( tamvang.getNhankhau().getManhankhau());
        return res;
    }
    public TamVang convert(TamVangDTO tamVangDTO){
        TamVang tamvang = new TamVang();
        ModelMapper mapper = new ModelMapper();
        int tmp = tamvang.getMatamvang();
        tamvang = mapper.map( tamVangDTO, TamVang.class );
        tamvang.setMatamvang(tmp);
        return tamvang;
    }

}
