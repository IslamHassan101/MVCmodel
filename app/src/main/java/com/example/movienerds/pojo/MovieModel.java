package com.example.movienerds.pojo;

public class MovieModel {
    String name;
    String date;
    String descripion;
    int id;


    public MovieModel(String name, String date, String descripion, int id) {
        this.name = name;
        this.date = date;
        this.descripion = descripion;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
