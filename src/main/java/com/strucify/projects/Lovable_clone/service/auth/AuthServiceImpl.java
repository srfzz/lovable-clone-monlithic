package com.strucify.projects.Lovable_clone.service.auth;


import com.strucify.projects.Lovable_clone.dto.auth.AuthResponseDto;
import com.strucify.projects.Lovable_clone.dto.auth.SignUpRequestDto;
import com.strucify.projects.Lovable_clone.dto.auth.SigninRequestDto;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponseDto signin(SigninRequestDto signinRequestDto) {
        return null;
    }

    @Override
    public AuthResponseDto signup(SignUpRequestDto signUpRequestDto) {
        return null;
    }

}
