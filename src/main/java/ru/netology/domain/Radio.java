package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private String name;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentStation;
    private int firstStation = 1;
    private int lastStation = 10;


    public Radio(String name, int currentVolume, int currentStation, boolean on) {
        this.name = name;
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;
        this.on = on;
    }



    private boolean on = true;




    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void nextStation() {
        if (currentStation == lastStation) {
            currentStation = firstStation;
            return;
        }
        currentStation++;
    }

    public void previosStation() {
        if (currentStation == firstStation) {
            currentStation = lastStation;
            return;
        }
        currentStation--;
    }

    public void editcurrentstation(int newStation) {
        if (newStation < firstStation) {
            return;
        }
        if (newStation > lastStation) {
            return;
        }
        currentStation = newStation;
    }

}

