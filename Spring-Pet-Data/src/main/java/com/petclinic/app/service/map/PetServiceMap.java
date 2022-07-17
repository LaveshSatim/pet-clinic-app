package com.petclinic.app.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petclinic.app.model.Pet;
import com.petclinic.app.service.Crud;
import com.petclinic.app.service.Petservice;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements Petservice{

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	

}
