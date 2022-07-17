package com.petclinic.app.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petclinic.app.model.Owner;
import com.petclinic.app.model.Pet;

public interface Petservice extends Crud<Pet, Long> {

}
