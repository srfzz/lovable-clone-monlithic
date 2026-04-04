package com.strucify.projects.Lovable_clone.service.auth;

import com.strucify.projects.Lovable_clone.dto.auth.AuthResponseDto;
import com.strucify.projects.Lovable_clone.dto.auth.SignUpRequestDto;
import com.strucify.projects.Lovable_clone.dto.auth.SigninRequestDto;

public interface AuthService {
   AuthResponseDto signin(SigninRequestDto signinRequestDto);

    AuthResponseDto signup(SignUpRequestDto signUpRequestDto);

}
