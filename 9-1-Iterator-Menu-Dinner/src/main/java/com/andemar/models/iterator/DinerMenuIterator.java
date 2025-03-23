package com.andemar.models.iterator;

import com.andemar.models.MenuItem;

public class DinerMenuIterator implements Iterator {

  private final MenuItem[] items;
  private int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }

  @Override
  public Object next() {
    MenuItem item = items[position];
    position = position + 1;
    return item;
  }
}
