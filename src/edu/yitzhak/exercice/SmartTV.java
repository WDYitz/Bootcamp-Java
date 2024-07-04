package edu.yitzhak.exercice;

public class SmartTV {
  boolean isOn = false;
  int channel = 1;
  int volume = 50;

  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    this.isOn = false;
  }

  public void volumeUp() {
    this.volume++;
  }

  public void volumeDown() {
    this.volume--;
  }

  public int changeChannel(int channelNumber) {
    return this.channel = channelNumber;
  }

  public int channelUp() {
    return this.channel++;
  }

  public int channelDown() {
    return this.channel--;
  }
}
