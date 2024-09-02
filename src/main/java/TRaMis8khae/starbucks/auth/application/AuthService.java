package TRaMis8khae.starbucks.auth.application;

import TRaMis8khae.starbucks.auth.dto.LogInRequestDto;
import TRaMis8khae.starbucks.auth.dto.LogInResponseDto;
import TRaMis8khae.starbucks.auth.dto.SignInRequestDto;
import TRaMis8khae.starbucks.auth.dto.SignInResponseDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface AuthService {
    SignInResponseDto signIn(SignInRequestDto signInRequestDto);
    LogInResponseDto logIn(LogInRequestDto logInRequestDto);
    void signOut(UUID memberUuid);
}

