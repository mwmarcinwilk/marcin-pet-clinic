package marcin.spring.marcinpetclinic.services.map;

import marcin.spring.marcinpetclinic.model.Pet;
import marcin.spring.marcinpetclinic.model.Vet;
import marcin.spring.marcinpetclinic.services.CrudService;
import marcin.spring.marcinpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }


}
