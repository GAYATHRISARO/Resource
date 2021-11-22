package org.arm.resource.mngt.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Resource {
	@Id
	@GeneratedValue(generator = "resource_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "resource_gen",sequenceName = "resource_seq",initialValue = 1,allocationSize = 1) 
	private int resourceId;

	private String resourceName;
	
	private String resourceType;
	
	private String availability;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	private int isDeleted;
	
	@ManyToOne
	private Task task;

}
