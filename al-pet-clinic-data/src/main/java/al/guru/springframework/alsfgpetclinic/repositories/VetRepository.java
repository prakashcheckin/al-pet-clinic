package al.guru.springframework.alsfgpetclinic.repositories;

import al.guru.springframework.alsfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
