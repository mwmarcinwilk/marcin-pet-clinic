package marcin.spring.marcinpetclinic.services.map;

import marcin.spring.marcinpetclinic.model.Owner;
import marcin.spring.marcinpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {


    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Owner object) {

    }
}
