package com.example.springboot_containarize;

public class DataRequest {
    private int id;
    private String name;
    private String email;
    private int age;
    private String message;

    // Default constructor
    public DataRequest() {}

    // All-args constructor
    public DataRequest(int id, String name, String email, int age, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.message = message;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    // For debugging / logging
    @Override
    public String toString() {
        return "DataRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", message='" + message + '\'' +
                '}';
    }
}
//commit2