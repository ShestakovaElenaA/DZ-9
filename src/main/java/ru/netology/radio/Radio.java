package ru.netology.radio;

public class Radio {
    private int quantityRadioStation = 10;
    private int maxRadioStationNumber = quantityRadioStation - 1;
    private int minRadioStationNumber = 0;
    private int currentRadioStationNumber = minRadioStationNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int curenntVolume = minVolume;

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxRadioStationNumber = quantityRadioStation - 1;
    }

    public Radio() {

    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurenntVolume() {
        return curenntVolume;
    }

    public void setCurenntvolume(int newcurenntVolume) {
        if (newcurenntVolume < minVolume) {
            return;
        }
        if (newcurenntVolume > maxVolume) {
            return;
        }
        curenntVolume = newcurenntVolume;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            setCurrentRadioStationNumber(0);
            {
                return;
            }
        }
        currentRadioStationNumber = currentRadioStationNumber + 1;
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxRadioStationNumber;
            {
                return;
            }
        }
        currentRadioStationNumber = currentRadioStationNumber - 1;
    }

    public void increaseVolume() {
        if (curenntVolume < maxVolume) {
            curenntVolume = curenntVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (curenntVolume > minVolume) {
            curenntVolume = curenntVolume - 1;
        }
    }
}
