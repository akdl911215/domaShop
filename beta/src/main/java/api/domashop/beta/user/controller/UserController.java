package api.domashop.beta.user.controller;

import api.domashop.beta.user.domain.dto.UserDto;
import api.domashop.beta.user.service.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Log4j2
@RequestMapping(value = "/users", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/signup")
    @ApiOperation(value = "회원가입 등록", notes = "회원 정보를 등록 합니다.")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Somthing went wrong"),
            @ApiResponse(code = 403, message = "Access Denied"),
            @ApiResponse(code = 422, message = "User - Username is alredy is use")})
    public ResponseEntity<String> signup(UserDto userDto) throws IOException {
        log.info("Sign Up 작동");

//        return null;
        return new ResponseEntity<>(userService.signup(userDto), HttpStatus.OK);
    }

    @PostMapping("/signin")
    @ApiOperation(value = "로그인", notes = "로그인을 시작 합니다")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Somthing went wrong"),
            @ApiResponse(code = 422, message = "Invalid Artist-Username / Password supplied")})
    public ResponseEntity<UserDto> signin
            (@ApiParam("Signin User") @RequestBody UserDto userDto) throws IOException{
        log.info("User Siginin 작동 :::: " + userDto);

        return ResponseEntity.ok(userService.signin(userDto));
    }
}
