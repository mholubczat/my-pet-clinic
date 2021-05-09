package me.mholubczat.mypetclinic.bootstrap;

import me.mholubczat.mypetclinic.model.Owner;
import me.mholubczat.mypetclinic.model.PetType;
import me.mholubczat.mypetclinic.model.Vet;
import me.mholubczat.mypetclinic.services.OwnerService;
import me.mholubczat.mypetclinic.services.PetTypeService;
import me.mholubczat.mypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loaded pet types....");

        Owner owner1 = new Owner();
        owner1.setFirstName("Barbara");
        owner1.setLastName("Liskov");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Robert C.");
        owner2.setLastName("Martin");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("James");
        vet1.setLastName("Gosling");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Gavin");
        vet2.setLastName("King");

        vetService.save(vet2);

        System.out.println("Loaded vets....");


    }
}
