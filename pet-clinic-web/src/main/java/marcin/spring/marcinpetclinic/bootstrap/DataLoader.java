package marcin.spring.marcinpetclinic.bootstrap;

import marcin.spring.marcinpetclinic.model.Owner;
import marcin.spring.marcinpetclinic.model.Vet;
import marcin.spring.marcinpetclinic.services.OwnerService;
import marcin.spring.marcinpetclinic.services.VetService;
import marcin.spring.marcinpetclinic.services.map.OwnerServiceMap;
import marcin.spring.marcinpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Maniek");
        owner1.setLastName("Zbidniewksi");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Zbigniew");
        owner2.setLastName("Maniek");
        ownerService.save(owner2);

        System.out.println("Load owner..");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Puszek");
        vet1.setLastName("Okruszek");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Okruszek");
        vet2.setLastName("Puszek");
        vetService.save(vet2);

        System.out.println("Vet owner..");

    }
}
