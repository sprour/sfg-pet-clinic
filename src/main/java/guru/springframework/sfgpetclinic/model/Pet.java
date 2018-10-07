package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
public class Pet {

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;

    private Set<Visit> visits = new LinkedHashSet<>();



}
