package com.example.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int idAdmin;
	String nomAdmin;
	String prenomAdmin;
	String emailAdmin;
	String mdpAdmin;
	
	

}
