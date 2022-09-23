package com.unbind.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class ApiError {
    private String code;
    private String message;
    private List<ErrorParameters> parameters;
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ErrorParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<ErrorParameters> parameters) {
        this.parameters = parameters;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
