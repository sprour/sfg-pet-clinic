package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


public class Pet {

    private Long id;

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;

    private Set<Visit> visits = new LinkedHashSet<>();



}
