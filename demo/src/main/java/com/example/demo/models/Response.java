package com.example.demo.models;

public class Response {
    private boolean Success;

    public Response(boolean success) {
        Success = success;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }
}
