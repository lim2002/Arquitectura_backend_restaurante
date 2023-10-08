package com.example.msmenu.dto;

public class ResponseDto<T> {
    private String code;
    private T response;
    private String message;
    public ResponseDto() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "code='" + code + '\'' +
                ", response=" + response +
                ", message='" + message + '\'' +
                '}';
    }
}
