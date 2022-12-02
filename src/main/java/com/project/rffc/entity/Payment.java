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
public class Payment implements Serializable{
	

	private int id;
	
	private int userId;
	
	private String paidFor;
	
	private int amount;
	
	private LocalDateTime paidOn ;

}
