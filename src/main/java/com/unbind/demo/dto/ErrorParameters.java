package com.unbind.demo.dto;

public class ErrorParameters {
    private String name;

    public ErrorParameters(){ }

    public ErrorParameters(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
