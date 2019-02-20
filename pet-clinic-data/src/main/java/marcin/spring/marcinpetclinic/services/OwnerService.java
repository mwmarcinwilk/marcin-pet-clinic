package marcin.spring.marcinpetclinic.services;

import marcin.spring.marcinpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}