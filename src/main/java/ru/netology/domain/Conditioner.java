package ru.netology.domain;

public class Conditioner {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on = true;




    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            System.out.println("Максимальная температура = " + currentTemperature);
            return;
        }
        setCurrentTemperature(this.currentTemperature + 1);
        System.out.println("Текущая температура = " + currentTemperature);
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            System.out.println("Минимальная температура = " + currentTemperature);
            return;
        }

        setCurrentTemperature(this.currentTemperature - 1);
        System.out.println("Текущая температура = " + currentTemperature);
    }
}