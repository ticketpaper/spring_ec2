package com.example.demo.post;

class Post {
    private int id;
    private String title;
    private String body;
    private String author_name;

    public Post(int id, String title, String body, String author_name) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author_name = author_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}

