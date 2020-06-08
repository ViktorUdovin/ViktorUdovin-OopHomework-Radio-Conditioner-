package ru.netology.domain;

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

    public Radio(String name, int maxVolume, int minVolume, int currentVolume, int currentStation, int firstStation,  int lastStation, int editCurrentStation, boolean on) {
        this.name = name;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;
        this.firstStation = firstStation;
        this.lastStation = lastStation;
        this.editCurrentStation = editCurrentStation;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int inputMaxVolume) {

        this.maxVolume = inputMaxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int inputMinVolume) {
        this.minVolume = inputMinVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;

        System.out.println("текущая громкость - " + this.currentVolume);

    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }


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
        if (editCurrentStation > lastStation){
            setCurrentStation(this.currentStation);
            System.out.println("Невозможно выбрать станцию #" + editCurrentStation);
            System.out.println("Включена станция #" + currentStation);
            return;
        }
        currentStation = editCurrentStation;
        System.out.println("Включена станция #" + currentStation);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}

