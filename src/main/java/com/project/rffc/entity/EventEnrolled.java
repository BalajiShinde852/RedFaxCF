package com.project.rffc.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEnrolled implements Serializable{
	
	private int id;
	
	private int userId;
	
	private int eventId;
	
	private LocalDate enrolledOn;

}
