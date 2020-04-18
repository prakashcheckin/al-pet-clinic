package al.guru.springframework.alsfgpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @Builder
    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate, Set<Visit> vists) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;

        if(vists != null || vists.size() > 0){
            this.vists = vists;
        }
    }

    @Column(name = "pet_name")
    private String name;

    @ManyToOne
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit> vists = new HashSet<>();

}
