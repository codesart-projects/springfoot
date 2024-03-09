package com.codesart.springfoot.common.api.exception;

import com.codesart.springfoot.common.api.util.R;
import com.codesart.springfoot.common.core.exception.CheckedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Order
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数校验
     */
    @ExceptionHandler({BindException.class})
    public R bindExceptionHandler(BindException e) {
        String detail = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> Optional.ofNullable(x.getDefaultMessage()).orElse(x.getField()))
                .collect(Collectors.joining(", "));
        return R.fail("参数校验异常: " + detail);
    }

    /**
     * 校验 (assert)
     */
    @ExceptionHandler({IllegalArgumentException.class})
    public R illegalArgumentExceptionHandler(IllegalArgumentException e) {
        return R.fail(e.getMessage());
    }

    /**
     * 业务异常
     */
    @ExceptionHandler({CheckedException.class})
    public ResponseEntity<R> exception(CheckedException e) {
        return ResponseEntity.status(e.getHttpStatus()).body(R.init(e.getCode(), e.getMessage(), null));
    }

    /**
     * 全局异常
     */
    @ExceptionHandler({Exception.class})
    public R exception(Exception e) {
        log.error("globalException: {}", e.getMessage(), e);
        return R.fail(e.getMessage());
    }

}

