package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Campaign;
import org.arm.resource.mngt.repository.ICampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamapaignServiceImpl implements ICampaignService {

	@Autowired
	private ICampaignRepository campaignRepository;

	@Override
	public String addCampaign(Campaign campaign) {
		campaignRepository.save(campaign);
		return "Campaign added";
	}

	@Override
	public String updateCampaign(Campaign campaign) {
		campaignRepository.save(campaign);
		return "Updated Successfully";
	}

	@Override
	public String deleteCampaign(int campaignId) {
		campaignRepository.deleteById(campaignId);
		return "Deleted Successfully";
	}

	@Override
	public Campaign getById(int campaignId) {
		return campaignRepository.findById(campaignId).get();
	}

	@Override
	public List<Campaign> getAll() {
		return campaignRepository.findAll();
	}

}
