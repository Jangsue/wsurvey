package com.woongjin.pjt.wsurveycore.comon.code;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.client.HttpClientErrorException;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum ErrorCode {
    BUSINESS_EXCEPTION_ERROR(200,"E999","프로세스 진행 시 에러가 발생하였습니다."),
    BAD_REQUEST(400,"E001","잘못된 요청입니다."),
    UNAUTHORIZED(401,"E002","인증되지 않았습니다."),
    FORBIDDEN(403,"E003","접근 권한이 없습니다."),
    NOT_FOUND(404,"E004","요청한 페이지가 존재하지 않습니다. "),
    SERVER_ERROR(500,"E005","서버 문제로 연결되지 않습니다."),
        ;

    private String status;
    private String errorCode;
    private String errorMessage;

    ErrorCode(int status, String errorCode, String errorMessage) {
        this.status = String.valueOf(status);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
