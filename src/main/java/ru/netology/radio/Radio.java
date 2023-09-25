package ru.netology.radio;
public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
      if (newCurrentRadioStationNumber <0) {
          return;
      }
      if (newCurrentRadioStationNumber >9) {
          return;
      }
      currentRadioStationNumber = newCurrentRadioStationNumber;
    }
    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < 9){
            currentRadioStationNumber = currentRadioStationNumber +1;
        }
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        }
    }
    public void prevRadioStationNumber(){
        if (currentRadioStationNumber > 0){
            currentRadioStationNumber = currentRadioStationNumber -1;
        }
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        }
    }
    private int curenntVolume;
public int getCurenntVolume() {
    return curenntVolume;
}
    public void setCurenntvolume(int newcurenntVolume) {
        if (newcurenntVolume <0) {
            return;
        }
        if (newcurenntVolume >100){
            return;
        }
        curenntVolume = newcurenntVolume;
    }
    public void increaseVolume() {
        if (curenntVolume < 100) {
            curenntVolume = curenntVolume + 1;
        }
    }
    public void decreaseVolume() {
    if (curenntVolume >0) {
        curenntVolume = curenntVolume - 1;
    }
    }
}
