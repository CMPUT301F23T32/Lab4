package com.example.testapplication;

public class Hexagon extends Shape {

    private String hexagon;

    public Hexagon(String hexagon){
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
