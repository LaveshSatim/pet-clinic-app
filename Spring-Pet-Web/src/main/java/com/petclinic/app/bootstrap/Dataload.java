package com.petclinic.app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.petclinic.app.model.Owner;
import com.petclinic.app.model.Vet;
import com.petclinic.app.service.Ownerservice;
import com.petclinic.app.service.Vetservice;
import com.petclinic.app.service.map.OwnerServiceMap;
import com.petclinic.app.service.map.VetServiceMap;

@Component
public class Dataload implements CommandLineRunner {

	private final Ownerservice ownerservice;
	private final Vetservice vetservice;

	public Dataload(Ownerservice ownerservice, Vetservice vetservice) {
		super();
		this.ownerservice = ownerservice;
		this.vetservice = vetservice;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setFirstName("lavesh");
		owner1.setLastName("satim");

		ownerservice.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("tanmay");
		owner2.setLastName("satim");

		ownerservice.save(owner2);

		System.out.println("Loaded owner");

		Vet vet1 = new Vet();
		vet1.setFirstName("moshe");
		vet1.setLastName("bubu");

		Vet vet2 = new Vet();
		vet2.setFirstName("lusiya");
		vet2.setLastName("dostovaski");

		vetservice.save(vet1);
		vetservice.save(vet2);
		System.out.println("Loaded vet");
	}

}
