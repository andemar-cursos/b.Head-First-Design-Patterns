package com.andemar.service;

import com.andemar.model.Weather;

public interface Observer {
  void update(Weather weather);
}
