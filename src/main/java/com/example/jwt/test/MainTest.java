package com.example.jwt.test;

import com.example.jwt.dto.HoKhauDTO;
import com.example.jwt.entity.HoKhau;
import com.example.jwt.entity.NhanKhau;
import com.example.jwt.mapper.HoKhauMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,10,4,12);
        Stream<Integer> stream = numbers.stream();
//        List<Integer> newList = stream.map(n -> n * 2).collect(Collectors.toList());
//        List<Integer> newList2 = stream.filter(n -> (n > 2)).collect(Collectors.toList());
//        newList2.forEach((value)-> System.out.println(value));
        List<Integer> newList = stream.sorted().collect(Collectors.toList());
//        newList.forEach( value -> System.out.println(value));

        List<HoKhau> a = new ArrayList<>();
        HoKhauMapper mapper = new HoKhauMapper();
        a.add( new HoKhau());
        a.add( new HoKhau());
        List<HoKhauDTO> b = a.stream().map( hokhau -> mapper.convertHoKhauDTO(hokhau)).collect(Collectors.toList());

    }
}
