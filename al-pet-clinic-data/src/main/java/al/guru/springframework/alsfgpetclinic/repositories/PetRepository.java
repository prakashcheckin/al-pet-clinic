package al.guru.springframework.alsfgpetclinic.repositories;

import al.guru.springframework.alsfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
