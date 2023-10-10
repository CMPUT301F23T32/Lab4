package com.example.testapplication;

public class Triangle extends Shape {
    private String triangle;

    public Triangle(String triangle){
        this.triangle = triangle;
    }

    public String getTriangle() {

        return triangle;
    }

    public void setTriangle(String triangle) {

        this.triangle = triangle;
    }

    @Override
    public String toString(){

        return triangle;
    }
}
