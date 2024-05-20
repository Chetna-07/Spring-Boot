package com.learnSpringBoot.LearnrestApi;

public class Course {

    private long id;
    private String bookName;
    private String authour;

    public Course(long id, String bookName, String authour) {
        this.id = id;
        this.bookName = bookName;
        this.authour = authour;
    }

    public long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthour() {
        return authour;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authour='" + authour + '\'' +
                '}';
    }
}
