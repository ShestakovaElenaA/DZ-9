package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio Radio = new Radio();

    @Test
    public void getQuantityRadioStation10() {
        Radio Radio = new Radio();
        Assertions.assertEquals(10, Radio.getQuantityRadioStation());
        Assertions.assertEquals(0, Radio.getMinRadioStationNumber());
        Assertions.assertEquals(100, Radio.getMaxVolume());
        Assertions.assertEquals(0, Radio.getMinVolume());
    }

    @Test
    public void getQuantityRadioStation11() {
        Radio Radio = new Radio(11);
        Assertions.assertEquals(11, Radio.getQuantityRadioStation());
        Assertions.assertEquals(10, Radio.getMaxRadioStationNumber());
        Assertions.assertEquals(100, Radio.getMaxVolume());
        Assertions.assertEquals(0, Radio.getMinVolume());
    }

    @Test
    public void setRadioStation0() {

        Radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void setRadioStation1() {

        Radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void setRadioStation9() {

        Radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void setRadioStation8() {

        Radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void setRadioStation10() {

        Radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void setRadioStationNegativeNumber() {

        Radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsNext9to0() {
        Radio.setCurrentRadioStationNumber(9);
        Radio.nextRadioStationNumber();

        int expected = 0;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsNext0to1() {

        Radio.setCurrentRadioStationNumber(0);
        Radio.nextRadioStationNumber();

        int expected = 1;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsNext5to6() {
        Radio.setCurrentRadioStationNumber(5);
        Radio.nextRadioStationNumber();

        int expected = 6;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsNext8to9() {
        Radio.setCurrentRadioStationNumber(8);
        Radio.nextRadioStationNumber();

        int expected = 9;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsNext10to1() {
        Radio.setCurrentRadioStationNumber(10);
        Radio.nextRadioStationNumber();

        int expected = 1;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsPrevt0to9() {
        Radio.setCurrentRadioStationNumber(0);
        Radio.prevRadioStationNumber();

        int expected = 9;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsPrevt9to8() {
        Radio.setCurrentRadioStationNumber(9);
        Radio.prevRadioStationNumber();

        int expected = 8;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsPrevt5to4() {
        Radio.setCurrentRadioStationNumber(5);
        Radio.prevRadioStationNumber();

        int expected = 4;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsPrevt1to0() {
        Radio.setCurrentRadioStationNumber(1);
        Radio.prevRadioStationNumber();

        int expected = 0;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void changingStationsPrevNegativeto9() {
        Radio.setCurrentRadioStationNumber(-1);
        Radio.prevRadioStationNumber();

        int expected = 9;
        int atual = Radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, atual);
    }

    @Test
    public void setVolume0() {
        Radio.setCurenntvolume(0);
        int exprxted = 0;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void setVolume1() {
        Radio.setCurenntvolume(1);
        int exprxted = 1;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void setVolumeNegativeNumber() {
        Radio.setCurenntvolume(-1);
        int exprxted = 0;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void setVolume99() {
        Radio.setCurenntvolume(99);
        int exprxted = 99;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void setVolume100() {
        Radio.setCurenntvolume(100);
        int exprxted = 100;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void setVolume101() {
        Radio.setCurenntvolume(101);
        int exprxted = 0;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void increaseVolume0to1() {
        Radio.setCurenntvolume(0);
        Radio.increaseVolume();
        int exprxted = 1;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void increaseVolume99to100() {
        Radio.setCurenntvolume(99);
        Radio.increaseVolume();
        int exprxted = 100;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void increaseVolume100to101() {
        Radio.setCurenntvolume(100);
        Radio.increaseVolume();
        int exprxted = 100;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void decreaseVolume0tonegativenumber() {
        Radio.setCurenntvolume(0);
        Radio.decreaseVolume();
        int exprxted = 0;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void decreaseVolume1to0() {
        Radio.setCurenntvolume(1);
        Radio.decreaseVolume();
        int exprxted = 0;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }

    @Test
    public void decreaseVolume100to99() {
        Radio.setCurenntvolume(100);
        Radio.decreaseVolume();
        int exprxted = 99;
        int atual = Radio.getCurenntVolume();

        Assertions.assertEquals(exprxted, atual);
    }
}
