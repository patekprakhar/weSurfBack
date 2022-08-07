package com.example.finalWesurf.userData;

import com.example.finalWesurf.userData.users;
import java.util.List;


public class customized {
    private String message;
    private List body;


    public customized()
    {

    }

    public customized(String message, List body) {
        this.message = message;
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getBody() {
        return body;
    }

    public void setBody(List body) {
        this.body = body;
    }
}