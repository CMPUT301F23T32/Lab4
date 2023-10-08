package com.example.testapplication;

public class MyShape extends Shape {

    private String hexagon;

    public MyShape(String hexagon){
        this.hexagon = hexagon;
    }

    public String getHexagon() {
        return hexagon;
    }

    public void setHexagon(String hexagon) {
        this.hexagon = hexagon;
    }

    @Override
    public String toString(){
        return hexagon;
    }
}
