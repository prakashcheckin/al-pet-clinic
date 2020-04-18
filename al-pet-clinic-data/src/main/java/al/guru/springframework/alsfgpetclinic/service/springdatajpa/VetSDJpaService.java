package al.guru.springframework.alsfgpetclinic.service.springdatajpa;

import al.guru.springframework.alsfgpetclinic.model.Vet;
import al.guru.springframework.alsfgpetclinic.repositories.VetRepository;
import al.guru.springframework.alsfgpetclinic.service.VetService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {

        Set<Vet> vetSet = new HashSet<>();
        vetRepository.findAll().forEach(vetSet::add);
        return vetSet;
    }

    @Override
    public Vet findById(Long aLong) {

        Optional<Vet> vetOptional = vetRepository.findById(aLong);
        return vetOptional.orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
