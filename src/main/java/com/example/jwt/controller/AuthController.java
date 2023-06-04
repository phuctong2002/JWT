package com.example.jwt.controller;

import com.example.jwt.config.JwtService;
import com.example.jwt.dto.AuthDTO;
import com.example.jwt.entity.User;
import com.example.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private JwtService jwtService;
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @PostMapping("/sign-up")
    public ResponseEntity<Object> register(@RequestBody User user){
        String msg = userService.addUser(user);
        return new ResponseEntity<>( msg, HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<Object> authenticate(@RequestBody AuthDTO authDTO){
        try{
            Authentication authentication = authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(authDTO.getName(), authDTO.getPassword()));
            if( authentication.isAuthenticated()){
                return new ResponseEntity<>( jwtService.generateToken(authDTO.getName()), HttpStatus.OK);
            }else{
                throw new UsernameNotFoundException("invalid user request !");
            }
        }catch ( AuthenticationException e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error", HttpStatus.UNAUTHORIZED);
    }
}
