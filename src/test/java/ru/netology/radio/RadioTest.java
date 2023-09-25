package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class RadioTest {
    @Test
    public void setRadioStation0 () {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(0);
         int expected = 0;
         int atual = RadioStation.getCurrentRadioStationNumber();

         Assertions.assertEquals(expected, atual);
    }
    @Test
    public void setRadioStation1 () {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(1);
        int expected = 1;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void setRadioStation9 () {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(9);
        int expected = 9;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void setRadioStation8 () {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(8);
        int expected = 8;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void setRadioStation10 () {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(10);

        int expected = 0;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void setRadioStationNegativeNumber () {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void changingStationsNext9to0 () {
        Radio RadioStation = new Radio();
        RadioStation.setCurrentRadioStationNumber(9);
        RadioStation.nextRadioStationNumber();

        int expected = 0;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void changingStationsNext0to1 () {
        Radio RadioStation = new Radio();
        RadioStation.setCurrentRadioStationNumber(0);
        RadioStation.nextRadioStationNumber();

        int expected = 1;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void changingStationsNext5to6 () {
        Radio RadioStation = new Radio();
        RadioStation.setCurrentRadioStationNumber(5);
        RadioStation.nextRadioStationNumber();

        int expected = 6;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void changingStationsPrevt0to9 () {
        Radio RadioStation = new Radio();
        RadioStation.setCurrentRadioStationNumber(0);
        RadioStation.prevRadioStationNumber();

        int expected = 9;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void changingStationsPrevt9to8 () {
        Radio RadioStation = new Radio();
        RadioStation.setCurrentRadioStationNumber(9);
        RadioStation.prevRadioStationNumber();

        int expected = 8;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void changingStationsPrevt5to4 () {
        Radio RadioStation = new Radio();
        RadioStation.setCurrentRadioStationNumber(5);
        RadioStation.prevRadioStationNumber();

        int expected = 4;
        int atual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }
    @Test
    public void  setVolume0 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(0);
        int exprxted = 0;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void  setVolume1 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(1);
        int exprxted = 1;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void  setVolumeNegativeNumber (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(-1);
        int exprxted = 0;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void  setVolume99 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(99);
        int exprxted = 99;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void  setVolume100 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(100);
        int exprxted = 100;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void  setVolume101 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(101);
        int exprxted = 0;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void increaseVolume0to1 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(0);
        Volume.increaseVolume();
        int exprxted = 1;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void increaseVolume99to100 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(99);
        Volume.increaseVolume();
        int exprxted = 100;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void increaseVolume100to101 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(100);
        Volume.increaseVolume();
        int exprxted = 100;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void decreaseVolume0tonegativenumber (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(0);
        Volume.decreaseVolume();
        int exprxted = 0;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void decreaseVolume1to0 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(1);
        Volume.decreaseVolume();
        int exprxted = 0;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
    @Test
    public void decreaseVolume100to99 (){
        Radio Volume = new Radio();
        Volume.setCurenntvolume(100);
        Volume.decreaseVolume();
        int exprxted = 99;
        int atual = Volume.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
}
