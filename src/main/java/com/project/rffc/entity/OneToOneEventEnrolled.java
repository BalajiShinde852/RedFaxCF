package com.project.rffc.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OneToOneEventEnrolled implements Serializable {

	private int id;
	
	private int userId;
	
	private int trainerId;
	
	private String event;
	
	private int points ;
}
