package com.pojo;

import java.util.List;

public class Question {
    private Integer id;
    private String name;
    private List<Answer> answers;

    public Question() {
    }

    public Question(String name) {
        this.name = name;
    }

    public Question(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Question(Integer id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", answers=" + answers +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
