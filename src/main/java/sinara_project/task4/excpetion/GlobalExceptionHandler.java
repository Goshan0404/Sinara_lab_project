package sinara_project.task4.excpetion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TestException.class)
    public ResponseEntity<Map<String, Object>> handleGatewayException(TestException exception) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", 502);
        body.put("error", "Bad Gateway");
        body.put("message", exception.getMessage());
        body.put("path", exception.getPath());

        return new ResponseEntity<>(body, HttpStatus.BAD_GATEWAY);
    }
}
