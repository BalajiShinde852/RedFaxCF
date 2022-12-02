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
public class Trainer implements Serializable{
	

	private int id ;
	

	private String name ;
	

	private String eventType ;

}
