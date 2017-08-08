package br.com.analitics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.analitics.utils.exception.ResourceException;
import br.com.analitics.vo.ErrorVO;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ErrorController {

	@ExceptionHandler(ResourceException.class)
    public ResponseEntity<ErrorVO> handleException(ResourceException e) {
        return new ResponseEntity<ErrorVO>(new ErrorVO(e.getMessage(), e.getHttpStatus().value()), e.getHttpStatus());
    }
}
