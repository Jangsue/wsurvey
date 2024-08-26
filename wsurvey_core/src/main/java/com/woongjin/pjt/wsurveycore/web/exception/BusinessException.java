package com.woongjin.pjt.wsurveycore.web.exception;

import com.woongjin.pjt.wsurveycore.comon.code.ErrorCode;
import lombok.Getter;


public class BusinessException extends RuntimeException {
    @Getter
    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode  = errorCode;
    }
}
