package org.arm.resource.mngt.controller;

import org.arm.resource.mngt.model.Campaign;
import org.arm.resource.mngt.service.ICampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignController {
	
	@Autowired
	private ICampaignService campaignService;
	
	@PostMapping("/campaign")
	public String addCampaign(@RequestBody Campaign campaign){
		return campaignService.addCampaign(campaign);
		
	}
//
//	public String updateCampaign(@RequestBodyCampaign campaign){
//		
//	}
//
//	public String deleteCampaign(int campaignId){
//		
//	}

	@GetMapping("/campaign/{campaignId}")
	Campaign getById(@PathVariable("campaignId") int campaingId){
		return campaignService.getById(campaingId);
		
	}

//	@GetMapping("/campaign")
//	List<Campaign> getAll(){
//		return campaignService.getAll();
//		
//	}

}
