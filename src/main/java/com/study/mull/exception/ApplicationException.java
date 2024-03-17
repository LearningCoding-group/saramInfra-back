package com.study.mull.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApplicationException extends RuntimeException {

    private ErrorCode errorCode;
    private String message;

    //asdfasdfasdf
    public ApplicationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = null;
    }

    @Override
    public String getMessage() {

        if (message == null) {
            return errorCode.getStatus().toString();
        }

        return String.format("%s, %s", errorCode, message);
    }
}