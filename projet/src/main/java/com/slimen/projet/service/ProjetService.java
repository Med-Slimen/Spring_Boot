package com.slimen.projet.service;

import java.util.Date;
import java.util.List;

import com.slimen.projet.entities.Departement;
import com.slimen.projet.entities.Projet;

public interface ProjetService {
	Projet saveProjet(Projet p);
	Projet updateProjet(Projet p);
	void deleteProjet(Projet p);
	 void deleteProjetById(Long id);
	 Projet getProjet(Long id);
	List<Projet> getAllProjets();
	List<Projet> findByNomProjet(String nom);
	List<Projet> findByNomProjetContains(String nom);
	List<Projet> findByNomDate (String nom, Date date);
	List<Projet> findByDepartement (Departement departement);
	List<Projet> findByDepartementIdDepart(Long id);
	List<Projet> findByOrderByNomProjetAsc();
	List<Projet> trierProjetsNomsDate();


}
