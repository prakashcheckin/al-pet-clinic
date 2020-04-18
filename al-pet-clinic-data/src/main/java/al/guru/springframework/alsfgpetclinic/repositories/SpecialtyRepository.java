package al.guru.springframework.alsfgpetclinic.repositories;

import al.guru.springframework.alsfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
