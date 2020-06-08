package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Conditioner {
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