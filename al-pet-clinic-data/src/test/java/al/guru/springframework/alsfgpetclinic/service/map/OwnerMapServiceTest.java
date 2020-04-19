package al.guru.springframework.alsfgpetclinic.service.map;

import al.guru.springframework.alsfgpetclinic.model.Owner;
import al.guru.springframework.alsfgpetclinic.service.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerService ownerService;

    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() {
        ownerService = new OwnerMapService(new PetMapService(), new PetTypeMapService());
        ownerService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner byId = ownerService.findById(ownerId);
        assertEquals(ownerId, byId.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner savedOwner = ownerService.save(owner2);
        assertEquals(id, savedOwner.getId());
    }

    @Test
    void delete() {
        ownerService.delete(ownerService.findById(ownerId));
        assertEquals(0, ownerService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerService.deleteById(ownerId);
        assertEquals(0, ownerService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner smith = ownerService.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId, smith.getId());

    }

    @Test
    void findByLastNameNotFound() {
        Owner smith = ownerService.findByLastName("foo");
        assertNull(smith);
    }
}