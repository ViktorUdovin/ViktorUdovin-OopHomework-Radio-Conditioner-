package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void incraseCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.getMaxVolume();
        radio.setMinVolume(0);
        radio.getMinVolume();
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void decraseCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.getMaxVolume();
        radio.setMinVolume(0);
        radio.getMinVolume();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void incraseCurrentVolumeLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.getMaxVolume();
        radio.setMinVolume(0);
        radio.getMinVolume();
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decraseCurrentVolumeLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.getMaxVolume();
        radio.setMinVolume(0);
        radio.getMinVolume();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void previosStationFirst() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setLastStation(9);
        radio.getLastStation();
        radio.setFirstStation(1);
        radio.getFirstStation();
        radio.setCurrentStation(1);
        radio.previosStation();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextStationLast() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setLastStation(9);
        radio.getLastStation();
        radio.setFirstStation(1);
        radio.getFirstStation();
        radio.setCurrentStation(9);
        radio.nextStation();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void nextstation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setLastStation(9);
        radio.getLastStation();
        radio.setFirstStation(1);
        radio.getFirstStation();
        radio.setCurrentStation(6);
        radio.nextStation();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void previosStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setLastStation(9);
        radio.getLastStation();
        radio.setFirstStation(1);
        radio.getFirstStation();
        radio.setCurrentStation(5);
        radio.previosStation();
        radio.setName(toString());
        radio.getName();
        radio.isOn();
        radio.setOn(true);
        assertEquals(4, radio.getCurrentStation());
    }
}
