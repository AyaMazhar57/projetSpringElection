package com.example.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ResultatElection 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int idResultat;
	int nbVote;
	
	@ManyToOne
    @JoinColumn(name = "idCandidat")
     Candidat candidats;
    
    @ManyToOne
    @JoinColumn(name = "idElection")
     Election elections;
}
