package com.exm.firstsprbootprojs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exm.firstsprbootprojs.entity.ForeignTour;
import com.exm.firstsprbootprojs.entity.LocalTour;
import com.exm.firstsprbootprojs.entity.Traveller;
import com.exm.firstsprbootprojs.repo.TravellerRepository;
import com.exm.firstsprbootprojs.service.TravellerService;
//import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class TravellerRestController {
	
	@Autowired
	TravellerService TravellerService;
	
	@Autowired
	TravellerRepository travellerRepository;
	
	@GetMapping("/welcome")
	public String helloAppln() {
		return "Hello santhiya";
	}
	
	
	@PostMapping("/addTraveller")	
	public Traveller addTraveller(@RequestBody Traveller traveller) {
		return TravellerService.addTraveller(traveller);
	}
	
	@PostMapping("/requestlocaltour")
	public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
		return TravellerService.saveLocalTourRequest(localTour);
	}

	
	@PostMapping("/requestforeigntour")	
	public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
		System.out.println("****** From Controller Foreign ******" + foreignTour);
		return TravellerService.saveForeignTourRequest(foreignTour);
	}
	
	@GetMapping("/listtravellers")

	public List<Traveller> listAllTravellers() {

		return TravellerService.listAllTravellers();
	}
}
