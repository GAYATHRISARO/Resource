package org.arm.resource.mngt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Project {
	@Id
	@GeneratedValue(generator = "project_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "project_gen",sequenceName = "project_seq",initialValue = 1,allocationSize = 1) 
	private int projectId;

	private String projectName;

}
