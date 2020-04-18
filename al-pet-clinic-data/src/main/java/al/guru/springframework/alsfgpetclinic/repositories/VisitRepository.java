package al.guru.springframework.alsfgpetclinic.repositories;

import al.guru.springframework.alsfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
