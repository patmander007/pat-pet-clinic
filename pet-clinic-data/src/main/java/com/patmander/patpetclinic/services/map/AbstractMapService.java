package com.patmander.patpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.patmander.patpetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity> {

  protected Map<Long, T> map = new HashMap<>();

  public Set<T> findAll() {
    return new HashSet<T>(map.values());
  }

  public T findById(Long id) {
    return map.get(id);
  }

  public void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  public void deleteById(Long id) {
    map.remove(id);
  }

  public T save(T object) {

    if (object != null) {
      if (object.getId() == null) {
        object.setId(getNextId());
      }
      map.put(object.getId(), object);
    } else {
      throw new IllegalArgumentException("Object cannot be null when saving");
    }

    return object;
  }

  public T update(T object) {

    if (object != null) {
      if (object.getId() == null) {
        throw new IllegalArgumentException("Id cannot be null when updating");
      }
      map.put(object.getId(), object);
    } else {
      throw new IllegalArgumentException("Object cannot be null when updating");
    }

    return object;
  }

  private Long getNextId() {
    return map.keySet().isEmpty() ? 1L : Collections.max(map.keySet()) + 1L;
  }


}
