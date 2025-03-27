package com.andemar.models.iterator;

import com.andemar.models.MenuItem;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

  private final MenuItem[] items;
  private int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public MenuItem next() {
    MenuItem item = items[position];
    position = position + 1;
    return item;
  }

  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
  }
}
