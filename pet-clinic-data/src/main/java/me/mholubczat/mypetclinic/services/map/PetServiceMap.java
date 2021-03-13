package me.mholubczat.mypetclinic.services.map;

import me.mholubczat.mypetclinic.model.Pet;
import me.mholubczat.mypetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
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

    @Override
    public Pet save(Pet object) {
        return super.save(object, object.getId());
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
