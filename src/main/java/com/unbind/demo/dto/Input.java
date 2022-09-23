package com.unbind.demo.dto;

import java.io.Serializable;

public class Input implements Serializable {
    private static final long serialVersionUID = 1L;
    private String thirdPartyUserId;

    public Input(){}
    public Input(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
    }

    public String getThirdPartyUserId() {
        return thirdPartyUserId;
    }

    public void setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
    }
}
