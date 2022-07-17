package com.petclinic.app.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petclinic.app.model.Vet;
import com.petclinic.app.service.Crud;
import com.petclinic.app.service.Vetservice;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements Vetservice {

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

}
