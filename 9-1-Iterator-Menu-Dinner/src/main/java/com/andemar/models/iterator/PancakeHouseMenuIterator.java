package com.andemar.models.iterator;

import com.andemar.models.MenuItem;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{

  private final List<MenuItem> menuItems;
  private int position = 0;

  public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.size();
  }

  @Override
  public Object next() {
    return menuItems.get(position++);
  }
}
