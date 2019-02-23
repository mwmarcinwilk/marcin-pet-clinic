package marcin.spring.marcinpetclinic.services.map;

import marcin.spring.marcinpetclinic.model.Pet;
import marcin.spring.marcinpetclinic.services.CrudService;
import marcin.spring.marcinpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }


}
