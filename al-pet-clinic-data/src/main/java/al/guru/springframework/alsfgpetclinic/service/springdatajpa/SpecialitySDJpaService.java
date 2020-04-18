package al.guru.springframework.alsfgpetclinic.service.springdatajpa;

import al.guru.springframework.alsfgpetclinic.model.Speciality;
import al.guru.springframework.alsfgpetclinic.repositories.SpecialtyRepository;
import al.guru.springframework.alsfgpetclinic.service.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

public class SpecialitySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> specialitySet = new HashSet<>();
        specialtyRepository.findAll().forEach(specialitySet::add);
        return specialitySet;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return  specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
