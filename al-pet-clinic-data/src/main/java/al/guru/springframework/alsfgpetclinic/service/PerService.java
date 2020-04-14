package al.guru.springframework.alsfgpetclinic.service;

import al.guru.springframework.alsfgpetclinic.model.Pet;

import java.util.Set;

public interface PerService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
