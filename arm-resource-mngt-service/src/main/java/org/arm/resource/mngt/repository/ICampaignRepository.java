package org.arm.resource.mngt.repository;

import org.arm.resource.mngt.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICampaignRepository extends JpaRepository<Campaign, Integer>{
	
	

}
