package com.woongjin.pjt.wsurveycore.web.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {
    private int status;

    private String errorMessage; //에러 메서지

    private String errorCode; //에러 코드 값

    private String errorReason; //에러사유
}
