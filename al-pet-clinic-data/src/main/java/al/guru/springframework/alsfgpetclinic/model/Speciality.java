package al.guru.springframework.alsfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    @Column(name = "description")
    private String description;

}
