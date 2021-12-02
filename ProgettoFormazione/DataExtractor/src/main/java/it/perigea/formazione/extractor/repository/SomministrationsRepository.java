package it.perigea.formazione.extractor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.perigea.formazione.extractor.entity.SomministrationsEntity;

@Repository
public interface SomministrationsRepository extends JpaRepository<SomministrationsEntity,Long> { 
	
	
	
}