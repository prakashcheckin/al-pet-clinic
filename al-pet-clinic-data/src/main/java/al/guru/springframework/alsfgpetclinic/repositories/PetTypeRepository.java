package al.guru.springframework.alsfgpetclinic.repositories;

import al.guru.springframework.alsfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
