package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void incraseCurrentVolume() {
        Radio radio = new Radio("name",100,0,25,5,1,10,5, true);
        radio.increaseCurrentVolume();
        assertEquals(26, radio.getCurrentVolume());
    }

    @Test
    public void decraseCurrentVolume() {
        Radio radio = new Radio("name",100,0,25,5,1,10, 5,true);
        radio.decreaseCurrentVolume();
        assertEquals(24, radio.getCurrentVolume());
    }

    @Test
    public void incraseCurrentVolumeLimit() {
        Radio radio = new Radio("name",100,0,100,5,1,10, 5,true);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void decraseCurrentVolumeLimit() {
        Radio radio = new Radio("name",100,0,0,5,1,10, 5,true);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void previosStationFirst() {
            Radio radio = new Radio("name",100,0,100,1,1,10, 1,true);
            radio.previosStation();
            assertEquals(10, radio.getCurrentStation());
        }

    @Test
    public void nextStationLast() {
        Radio radio = new Radio("name",100,0,100,10,1,10, 10,true);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void nextstation() {
        Radio radio = new Radio("name",100,0,100,5,1,10, 5,true);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());    }

    @Test
    public void previosStation() {
        Radio radio = new Radio("name",100,0,100,5,1,10, 5,true);
        radio.previosStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void editCurrentStation(){
        Radio radio = new Radio("name",100,0,100,5,1,10, 7,true);
        radio.editcurrentstation();
        assertEquals(7,radio.getCurrentStation());

    }
    @Test
    public void editCurrentStationMaxLimit() {
        Radio radio = new Radio("name", 100, 0, 100, 5, 1, 10, 17, true);
        radio.editcurrentstation();
        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void editCurrentStationMinLimit() {
        Radio radio = new Radio("name", 100, 0, 100, 5, 1, 10, 0, true);
        radio.editcurrentstation();
        assertEquals(5, radio.getCurrentStation());
    }
}
