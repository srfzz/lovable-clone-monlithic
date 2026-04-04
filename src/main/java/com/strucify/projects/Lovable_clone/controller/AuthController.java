package com.strucify.projects.Lovable_clone.controller;

import com.strucify.projects.Lovable_clone.dto.auth.*;
import com.strucify.projects.Lovable_clone.service.auth.AuthService;
import com.strucify.projects.Lovable_clone.service.auth.AuthServiceImpl;
import com.strucify.projects.Lovable_clone.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Slf4j
public class AuthController {

  private final AuthService authService;
  private final UserService userService;

    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }


    @PostMapping("/signup")
    public ResponseEntity<AuthResponseDto> signup(SignUpRequestDto signUpRequestDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(authService.signup(signUpRequestDto));
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthResponseDto> signin(SigninRequestDto signinRequestDto)
    {
        return ResponseEntity.ok().body(authService.signin(signinRequestDto));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponseDto> getProfileData()
    {
        return ResponseEntity.ok().body(userService.me());
    }
}
