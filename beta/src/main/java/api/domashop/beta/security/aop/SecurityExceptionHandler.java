package api.domashop.beta.security.aop;

import api.domashop.beta.security.domain.Messenger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j // 로그안의 e의 내용을 출력
@ControllerAdvice // 글로벌 예외처리기로 사용, 예외처리기만을 위한 어노테이션은 아니다.
public class SecurityExceptionHandler { // 보안 예외 처리기

    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<Messenger> handleRuntimeException(RuntimeException e){
        log.info("handleRuntimeException", e);

        Messenger response = Messenger.builder()
                .code("test")
                .message(e.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value()) // 500 내부 서버 에러
                .build();

        return  new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(SecurityException.class)
    protected  ResponseEntity<Messenger> handleCustomAuthenticationException(SecurityException e) {
        return null;
    }
}
