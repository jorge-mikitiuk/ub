package ar.com.jnm.p41;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class SelectionModel implements ListModel<String> {

  private List<ListDataListener> listeners = new ArrayList<>();

  private Map<String, Item> elements = new TreeMap<>();

  @Override
  public int getSize() {
    return getElements().size();
  }

  @Override
  public String getElementAt(int index) {
    Entry<String, Item> entry = new ArrayList<>(getElements().entrySet()).get(index);
    return entry.getValue().getProduct().getName() + ":" + entry.getValue().getQuantity();
  }

  @Override
  public void addListDataListener(ListDataListener l) {
    listeners.add(l);
  }

  @Override
  public void removeListDataListener(ListDataListener l) {
    listeners.remove(l);
  }

  public Map<String, Item> getElements() {
    return elements;
  }

  public void addElement(Item item) {
    getElements().put(item.getProduct().getName(), item);
    notifyListeners();
  }

  public void removeElement(String name) {
    getElements().remove(name);
    notifyListeners();
  }

  private void notifyListeners() {
    ListDataEvent even = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, getSize());
    for (ListDataListener listener : listeners) {
      listener.contentsChanged(even);
    }
  }

}
