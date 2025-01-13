package com.andemar.service;

import com.andemar.model.Weather;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
