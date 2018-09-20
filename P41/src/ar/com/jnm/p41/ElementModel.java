package ar.com.jnm.p41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class ElementModel implements ListModel<Producto> {

  private Map<String, List<Producto>> elements;

  private List<ListDataListener> listeners = new ArrayList<>();

  @SuppressWarnings("unchecked")
  private List<Producto> currentList = (List<Producto>) Collections.EMPTY_LIST;

  public ElementModel(Map<String, List<Producto>> elements) {
    setElements(elements);
  }

  @Override
  public void addListDataListener(ListDataListener l) {
    listeners.add(l);
  }

  @Override
  public void removeListDataListener(ListDataListener l) {
    listeners.remove(l);
  }

  @Override
  public int getSize() {
    return currentList.size();
  }

  @Override
  public Producto getElementAt(int index) {
    return currentList.get(index);
  }

  public void setCurrentList(String name) {
    currentList = getElements().get(name);
    ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, getSize());
    for (ListDataListener listener : listeners)
      listener.contentsChanged(event);
  }

  private Map<String, List<Producto>> getElements() {
    return elements;
  }

  private void setElements(Map<String, List<Producto>> elements) {
    this.elements = elements;
  }
}
