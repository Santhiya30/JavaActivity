package com.exm.firstsprbootprojs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exm.firstsprbootprojs.entity.LocalTour;

@Repository
public interface LocalTourRepository extends JpaRepository<LocalTour, Long> {

}
