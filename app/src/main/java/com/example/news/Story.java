package com.example.news;

public class Story {
    private String section;
    private String time;
    private String title;
    private String url;
    private String author;

    public Story(String section, String time, String title, String url, String author) {
        this.section = section;
        this.time = time;
        this.title = title;
        this.url = url;
        this.author = author;
    }

    public String getSection() {
        return section;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }

}
