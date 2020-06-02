package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {


    @Test
    public void increaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setMaxTemperature(9);
        conditioner.getMaxTemperature();
        conditioner.setMinTemperature(0);
        conditioner.getMinTemperature();
        conditioner.setCurrentTemperature(5);
        conditioner.increaseCurrentTemperature();
        conditioner.setOn(true);
        conditioner.isOn();
        conditioner.setName(toString());
        conditioner.getName();
        assertEquals(6, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        conditioner.setOn(true);
        conditioner.isOn();
        conditioner.setName(toString());
        conditioner.getName();
        assertEquals(4, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseTemperatureLimit() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(9);
        conditioner.increaseCurrentTemperature();
        conditioner.setOn(true);
        conditioner.isOn();
        conditioner.setName(toString());
        conditioner.getName();
        assertEquals(9, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseTemperatureLimit() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        conditioner.setOn(true);
        conditioner.isOn();
        conditioner.setName(toString());
        conditioner.getName();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

}










