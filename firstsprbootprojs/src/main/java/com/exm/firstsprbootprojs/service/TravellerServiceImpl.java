package com.exm.firstsprbootprojs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exm.firstsprbootprojs.entity.ForeignTour;
import com.exm.firstsprbootprojs.entity.LocalTour;
import com.exm.firstsprbootprojs.entity.Traveller;
import com.exm.firstsprbootprojs.repo.ForeignTourRepository;
import com.exm.firstsprbootprojs.repo.LocalTourRepository;
import com.exm.firstsprbootprojs.repo.TravellerRepository;

@Service
public class TravellerServiceImpl implements TravellerService {
	
	@Autowired
	private TravellerRepository travellerRepository;
	

	@Autowired
	private LocalTourRepository localTourRepository;
	@Autowired
	private ForeignTourRepository foreignTourRepository;
	

	@Override
	public Traveller addTraveller(Traveller traveller) {
		// TODO Auto-generated method stub		
		return travellerRepository.save(traveller);
	}
	
	@Override
	public LocalTour saveLocalTourRequest(LocalTour localTour) {

		Traveller traveller = localTour.getTrtourist();
		localTour.setTrtourist(traveller);
		return localTourRepository.save(localTour);
	}

	@Override
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
		System.out.println("-----------foreign Tour -------" +foreignTour);
		Traveller traveller = foreignTour.getTrtourist();
		foreignTour.setTrtourist(traveller);
		return foreignTourRepository.save(foreignTour);
	}
	
	@Override
	public List<Traveller> listAllTravellers() {

		return (List<Traveller>) travellerRepository.findAll();
	}


}
