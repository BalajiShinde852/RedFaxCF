package com.project.rffc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanEnrolled implements Serializable{
	

	private int id;
	
	private int userId;
	
	private int planId;
	
	private int enrollOn;
	
	private LocalDateTime validTill ;

	private String status ;

}
