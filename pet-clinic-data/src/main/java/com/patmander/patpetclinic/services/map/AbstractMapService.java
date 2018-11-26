package com.patmander.patpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

  protected Map<ID, T> map = new HashMap<>();

  public Set<T> findAll() {
    return new HashSet<T>(map.values());
  }

  public T findById(ID id) {
    return map.get(id);
  }

  public void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  public void deleteById(ID id) {
    map.remove(id);
  }

  public T save(T object, ID id) {
    map.put(id, object);
    return object;
  }

  public T update(T object, ID id) {
    return save(object, id);
  }

}
