package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Campaign;

public interface ICampaignService {
	public String addCampaign(Campaign campaign);

	public String updateCampaign(Campaign campaign);

	public String deleteCampaign(int campaignId);

	Campaign getById(int campaignId);

	List<Campaign> getAll();
}
