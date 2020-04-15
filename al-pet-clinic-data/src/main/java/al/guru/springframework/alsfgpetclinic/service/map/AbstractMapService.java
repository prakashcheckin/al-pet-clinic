package al.guru.springframework.alsfgpetclinic.service.map;

import al.guru.springframework.alsfgpetclinic.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId() == null){
                map.put(getNextId(), object);
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId(){

        Long nextId = null;

        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NullPointerException ex){
            nextId = 1L;
        }catch (NoSuchElementException ex){
            nextId = 1L;
        }

        return nextId;
    }
}
