package al.guru.springframework.alsfgpetclinic.service;

import al.guru.springframework.alsfgpetclinic.model.Owner;

public interface OwnerService extends CurdService<Owner, Long>{

    Owner findByLastName(String lastName);

}
