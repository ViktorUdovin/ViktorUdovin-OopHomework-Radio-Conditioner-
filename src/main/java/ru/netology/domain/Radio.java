package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int currentStation;
    private int firstStation;
    private int lastStation;
    private int editCurrentStation;
    private boolean on = true;




    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            System.out.println("Максимальная громкость");
            return;
        }
        setCurrentVolume(this.currentVolume + 1);
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            System.out.println("Минимальная громкость");
            return;
        }
        setCurrentVolume(this.currentVolume - 1);
    }

    public void nextStation() {
        if (currentStation == lastStation) {
            currentStation = firstStation;
            System.out.println("Включена станция #" + currentStation);
            return;
        }
        setCurrentStation(this.currentStation + 1);
        System.out.println("Включена станция #" + currentStation);
    }

    public void previosStation() {
        if (currentStation == firstStation) {
            currentStation = lastStation;
            System.out.println("Включена станция #" + currentStation);
            return;
        }
        setCurrentStation(this.currentStation - 1);
        System.out.println("Включена станция #" + currentStation);
    }

    public void editcurrentstation() {
        if (editCurrentStation < firstStation) {
            setCurrentStation(this.currentStation);
            System.out.println("Невозможно выбрать станцию #" + editCurrentStation);
            System.out.println("Включена станция #" + currentStation);
            return;
        }
        if (editCurrentStation > lastStation) {
            setCurrentStation(this.currentStation);
            System.out.println("Невозможно выбрать станцию #" + editCurrentStation);
            System.out.println("Включена станция #" + currentStation);
            return;
        }
        currentStation = editCurrentStation;
        System.out.println("Включена станция #" + currentStation);
    }

}

