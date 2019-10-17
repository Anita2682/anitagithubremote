package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;
    private String engine;

    public void setModel(String model) {

        String validModel = model;
        if (validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;


    }
}