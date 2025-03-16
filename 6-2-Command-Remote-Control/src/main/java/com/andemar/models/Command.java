package com.andemar.models;

public interface Command {
  void execute();
  void undo();
}
