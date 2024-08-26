package com.woongjin.pjt.wsurveycore.web.response;

import lombok.Builder;

public class ApiResponse<T> {
    private T result;
    private String resultMessage;
    private String resultCode;

    @Builder
    public ApiResponse(T result, String resultCode, String resultMessage) {
        this.result = result;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }
}
