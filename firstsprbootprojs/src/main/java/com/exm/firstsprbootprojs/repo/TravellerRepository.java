package com.exm.firstsprbootprojs.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exm.firstsprbootprojs.entity.Traveller;


@Repository
public interface TravellerRepository extends CrudRepository<Traveller, Long> {

}
