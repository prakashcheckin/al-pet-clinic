package al.guru.springframework.alsfgpetclinic.service;

import al.guru.springframework.alsfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
