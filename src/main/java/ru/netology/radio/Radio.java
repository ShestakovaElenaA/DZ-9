package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int curenntVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurenntVolume() {
        return curenntVolume;
    }

    public void setCurenntvolume(int newcurenntVolume) {
        if (newcurenntVolume < 0) {
            return;
        }
        if (newcurenntVolume > 100) {
            return;
        }
        curenntVolume = newcurenntVolume;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber >= 9) {
            setCurrentRadioStationNumber(0);
            {
                return;
            }
        }
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber <= 0) {
            currentRadioStationNumber = 9;
            {
                return;
            }
        }
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public void increaseVolume() {
        if (curenntVolume < 100) {
            curenntVolume = curenntVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (curenntVolume > 0) {
            curenntVolume = curenntVolume - 1;
        }
    }
}
