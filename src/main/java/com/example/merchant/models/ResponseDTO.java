package com.example.merchant.models;

public class ResponseDTO {
    private  Boolean status;
    private String message;

    public ResponseDTO() {
    }

    public ResponseDTO(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
