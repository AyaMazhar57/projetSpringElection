package com.example.dao;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Electeur 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int idElecteur;
	String nomElecteur;
	String prenomElecteur;
	String cinElecteur;
	String emailElecteur;
	String mdpElecteur;
	
	@OneToMany(mappedBy = "electeur", fetch = FetchType.LAZY)
	List<Vote> voteList;
	

}
