package com.example.jwt.controller;

import com.example.jwt.dto.TamVangDTO;
import com.example.jwt.entity.TamVang;
import com.example.jwt.service.TamVangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tamvang")
public class TamVangController {
    @Autowired
    private TamVangService tamVangService;
    @GetMapping("")
    public ResponseEntity<Object> getTamVang(){
        List<TamVangDTO> result = tamVangService.getAllTamVang();
        return new ResponseEntity<>(result , HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTamVang(@PathVariable("id") int id){
        String mess = tamVangService.deleteTamvangById(id);
        return new ResponseEntity<>(mess, HttpStatus.NO_CONTENT);
    }
    @PostMapping("")
    public ResponseEntity<Object> addTamVang(@RequestBody TamVangDTO tamVangDTO){
        System.out.println(tamVangDTO);
        tamVangService.addTamVang( tamVangDTO);
        return new ResponseEntity<>("hello", HttpStatus.CREATED);
    }



}
