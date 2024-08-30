package TRaMis8khae.starbucks.auth.presentation;

import TRaMis8khae.starbucks.auth.application.AuthService;
import TRaMis8khae.starbucks.auth.dto.SignInRequestDto;
import TRaMis8khae.starbucks.auth.dto.SignUpRequestDto;
import TRaMis8khae.starbucks.auth.vo.SignInRequestVo;
import TRaMis8khae.starbucks.auth.vo.SignInResponseVo;
import TRaMis8khae.starbucks.auth.vo.SignUpRequestVo;
import TRaMis8khae.starbucks.common.entity.CommonResponseEntity;
import TRaMis8khae.starbucks.common.entity.CommonResponseMessage;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth") // 임시
public class AuthController {

    private final AuthService authService;

    @Operation(summary = "SignUp API", description = "SignUp API", tags = {"Auth"})
    @PostMapping("/sign-up")
    public CommonResponseEntity<Void> signUp(
            @RequestBody SignUpRequestVo signUpRequestVo) {
        log.info("!!!!!!!!!signUpRequestVo : {}", signUpRequestVo);
        authService.signUp(new ModelMapper().map(signUpRequestVo, SignUpRequestDto.class));
        return new CommonResponseEntity<>(HttpStatus.OK, CommonResponseMessage.SUCCESS.getMessage(), null);
    }

    @Operation(summary = "SignIn API", description = "SignIn API", tags = {"Auth"})
    @PostMapping("/sign-in")
    public CommonResponseEntity<SignInResponseVo> signIn(
            @RequestBody SignInRequestVo signInRequestVo) {
        ModelMapper modelMapper = new ModelMapper();
        SignInRequestDto signInRequestDto = SignInRequestDto.builder().
                loginId(signInRequestVo.getLoginId()).
                password(signInRequestVo.getPassword()).
                build();
        SignInResponseVo signInResponseVo = modelMapper.map(authService.signIn(signInRequestDto), SignInResponseVo.class);
        log.info("signInResponseVo : {}", signInResponseVo);

        return new CommonResponseEntity<>(
                HttpStatus.OK,
                CommonResponseMessage.SUCCESS.getMessage(),
                signInResponseVo);
    }
}
