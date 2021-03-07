package me.mholubczat.mypetclinic.services;

import me.mholubczat.mypetclinic.model.Vet;

public interface VetService extends CrudService <Vet,Long>{

    Vet findByLastName(String lastName);

}
