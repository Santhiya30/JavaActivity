package com.exm.firstsprbootprojs.service;

import java.util.List;

import com.exm.firstsprbootprojs.entity.ForeignTour;
import com.exm.firstsprbootprojs.entity.LocalTour;
import com.exm.firstsprbootprojs.entity.Traveller;

public interface TravellerService {

	public Traveller addTraveller(Traveller traveller);
	
	public LocalTour saveLocalTourRequest(LocalTour localTour);
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
	
	public List<Traveller> listAllTravellers();
}
