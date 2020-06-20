package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void incraseCurrentVolume() {
        Radio radio = new Radio("name",25,5, true);
        radio.increaseCurrentVolume();
        assertEquals(26, radio.getCurrentVolume());
    }

    @Test
    public void decraseCurrentVolume() {
        Radio radio = new Radio("name",25,5, true);
        radio.decreaseCurrentVolume();
        assertEquals(24, radio.getCurrentVolume());
    }

    @Test
    public void incraseCurrentVolumeLimit() {
        Radio radio = new Radio("name",100,5, true);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void decraseCurrentVolumeLimit() {
        Radio radio = new Radio("name",0,5, true);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void previosStationFirst() {
            Radio radio = new Radio("name",100,1, true);
            radio.previosStation();
            assertEquals(10, radio.getCurrentStation());
        }

    @Test
    public void nextStationLast() {
        Radio radio = new Radio("name",100,10, true);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void nextstation() {
        Radio radio = new Radio("name",100,5, true);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());    }

    @Test
    public void previosStation() {
        Radio radio = new Radio("name",100,5, true);
        radio.previosStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void editCurrentStation(){
        Radio radio = new Radio("name",100,5, true);
        radio.editcurrentstation(7);
        assertEquals(7,radio.getCurrentStation());

    }
    @Test
    public void editCurrentStationMaxLimit() {
        Radio radio = new Radio("name",  100, 5,   true);
        radio.editcurrentstation(17);
        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void editCurrentStationMinLimit() {
        Radio radio = new Radio("name",  100, 5,   true);
        radio.editcurrentstation(0);
        assertEquals(5, radio.getCurrentStation());
    }
}
