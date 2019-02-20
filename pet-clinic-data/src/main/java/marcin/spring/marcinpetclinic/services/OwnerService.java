package marcin.spring.marcinpetclinic.services;

import marcin.spring.marcinpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
