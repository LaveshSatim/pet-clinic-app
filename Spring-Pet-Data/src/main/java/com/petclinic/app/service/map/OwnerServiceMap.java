package com.petclinic.app.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petclinic.app.model.Owner;
import com.petclinic.app.service.Crud;
import com.petclinic.app.service.Ownerservice;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements Ownerservice {

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}


	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
