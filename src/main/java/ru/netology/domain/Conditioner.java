package ru.netology.domain;

public class Conditioner {

    String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on = true;


    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int inputMaxTemperature) {

        this.maxTemperature = inputMaxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int inputMinTemperature) {
        this.minTemperature = inputMinTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

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


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}