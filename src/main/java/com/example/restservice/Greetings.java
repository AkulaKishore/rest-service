package com.example.restservice;

public class Greetings {
    private final Integer id;
    private final String content;

    public Greetings(Integer id, String content){
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
