package org.arm.resource.mngt.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.arm.resource.mngt.priority.Priority;
import org.arm.resource.mngt.status.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Campaign {
	@Id
	@GeneratedValue(generator = "campaign_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "campaign_gen", sequenceName = "campaign_seq", initialValue = 1, allocationSize = 1)
	private int campaignId;
	
	private String campaignName;
	
	private String campaignOwner;
	
	private Timestamp startDate;
	
	private Timestamp endDate;
	
	@Enumerated(EnumType.STRING)
	private Priority priority;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	private int isDeleted;

}
