package com.yitzhak.exercice;

import static java.lang.StringTemplate.STR;

@SuppressWarnings("unused")
public class User {
  public static void main(String[] args) {
    SmartTV smartTV = new SmartTV();

    System.out.println(STR."Tv esta ligada? \{smartTV.isOn}");
    System.out.println(STR."Canal: \{smartTV.channel}");
    System.out.println(STR."Volume: \{smartTV.volume}");

    smartTV.turnOn();
    System.out.println(STR."Tv esta ligada? \{smartTV.isOn}");

    smartTV.changeChannel(5);
    System.out.println(STR."Canal Atual: \{smartTV.channel}");

    smartTV.turnOff();
    System.out.println(STR."Tv esta ligada? \{smartTV.isOn}");

    smartTV.volumeUp();
    System.out.println(STR."Volume Atual: \{smartTV.volume}");
    smartTV.volumeDown();
    smartTV.volumeDown();
    smartTV.volumeDown();
    System.out.println(STR."Volume Atual: \{smartTV.volume}");
  }
}
