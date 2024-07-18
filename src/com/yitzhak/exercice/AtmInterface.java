package com.yitzhak.exercice;

public interface AtmInterface {
  String deposit(double depositValue);

  String withdraw(double withdrawValue);

  String transfer(double transferValue, AtmInterface account);

  String getBalance();

  String getName();
}
