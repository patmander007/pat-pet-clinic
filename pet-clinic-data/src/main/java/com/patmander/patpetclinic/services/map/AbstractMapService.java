package com.patmander.patpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.patmander.patpetclinic.services.CrudService;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

  protected Map<ID, T> map = new HashMap<>();

  @Override
  public Set<T> findAll() {
    return new HashSet<T>(map.values());
  }

  @Override
  public T findById(ID id) {
    return map.get(id);
  }

  @Override
  public void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  @Override
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
