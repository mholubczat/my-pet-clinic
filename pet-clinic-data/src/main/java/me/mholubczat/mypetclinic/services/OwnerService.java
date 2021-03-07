package me.mholubczat.mypetclinic.services;

import me.mholubczat.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
