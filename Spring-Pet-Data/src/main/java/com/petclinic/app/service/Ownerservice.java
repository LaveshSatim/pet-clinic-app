package com.petclinic.app.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petclinic.app.model.Owner;

public interface Ownerservice extends Crud<Owner, Long>{

	Owner findByLastName(String lastName);

}
