package ru.netology.domane;


public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int numberOfStations = 10;

    public Radio () {}

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    // ГРОМКОСТЬ
// Максимальная громкость
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = 100;
    }
    // Минимальная  громкость
    public int getMinVolume() {
        return minVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = 0;
    }
    // Текущая громкость
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;}
    //Увеличение громкости +
    public void upVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }
    //Уменьшение громкости -
    public void downVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }
    // СТАНЦИИ
    // Максимальная станция
    public int getMaxStation() {
        return maxStation;
    }
    public void setMaxStation(int maxStation) {
        this.maxStation = 9;
    }
    // Минимальная  станция
    public int getMinStation() {
        return minStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = 0;
    }
    // Текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    //Увеличение станции
    public void upStation() {
        if (currentStation < maxStation) {
            this.currentStation ++;
            return;
        }
        this.currentStation = minStation;
    }
    //Уменьшение станции
    public void downStation() {
        if (currentStation > minStation) {
            this.currentStation --;
            return;
        }
        this.currentStation = maxStation;
    }

    //Установка текущей станции
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //Количество станций
    public int getNumberOfStations () { return numberOfStations; }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }
}