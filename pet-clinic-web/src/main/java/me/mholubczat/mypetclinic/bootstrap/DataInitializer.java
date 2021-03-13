package me.mholubczat.mypetclinic.bootstrap;

import me.mholubczat.mypetclinic.model.Owner;
import me.mholubczat.mypetclinic.model.Vet;
import me.mholubczat.mypetclinic.services.OwnerService;
import me.mholubczat.mypetclinic.services.VetService;
import me.mholubczat.mypetclinic.services.map.OwnerServiceMap;
import me.mholubczat.mypetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Barbara");
        owner1.setLastName("Liskov");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Robert C.");
        owner2.setLastName("Martin");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("James");
        vet1.setLastName("Gosling");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Gavin");
        vet2.setLastName("King");

        vetService.save(vet2);

        System.out.println("Loaded vets....");


    }
}
