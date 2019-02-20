package marcin.spring.marcinpetclinic.services;

import marcin.spring.marcinpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
