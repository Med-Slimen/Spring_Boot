package com.slimen.projet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slimen.projet.entities.Departement;
import com.slimen.projet.entities.Projet;
import com.slimen.projet.repos.ProjetRepository;
@Service
public class ProjetServiceImpl implements ProjetService{
	@Autowired
	ProjetRepository projetRepository;
	@Override
	public Projet saveProjet(Projet p) {
		// TODO Auto-generated method stub
		return projetRepository.save(p);
	}

	@Override
	public Projet updateProjet(Projet p) {
		// TODO Auto-generated method stub
		return projetRepository.save(p);
	}

	@Override
	public void deleteProjet(Projet p) {
		// TODO Auto-generated method stub
		projetRepository.delete(p);
	}

	@Override
	public void deleteProjetById(Long id) {
		// TODO Auto-generated method stub
		projetRepository.deleteById(id);
	}

	@Override
	public Projet getProjet(Long id) {
		// TODO Auto-generated method stub
		return projetRepository.findById(id).get();
	}

	@Override
	public List<Projet> getAllProjets() {
		// TODO Auto-generated method stub
		return projetRepository.findAll();
	}

	@Override
	public List<Projet> findByNomProjet(String nom) {
		// TODO Auto-generated method stub
		return projetRepository.findByNomProjet(nom);
	}

	@Override
	public List<Projet> findByNomProjetContains(String nom) {
		// TODO Auto-generated method stub
		return projetRepository.findByNomProjetContains(nom);
	}

	@Override
	public List<Projet> findByNomDate(String nom, Date date) {
		// TODO Auto-generated method stub
		return projetRepository.findByNomDate(nom,date);
	}

	@Override
	public List<Projet> findByDepartement(Departement departement) {
		// TODO Auto-generated method stub
		return projetRepository.findByDepartement(departement);
	}

	@Override
	public List<Projet> findByDepartementIdDepart(Long id) {
		// TODO Auto-generated method stub
		return projetRepository.findByDepartementIdDepart(id);
	}

	@Override
	public List<Projet> findByOrderByNomProjetAsc() {
		// TODO Auto-generated method stub
		return projetRepository.findByOrderByNomProjetAsc();
	}

	@Override
	public List<Projet> trierProjetsNomsDate() {
		// TODO Auto-generated method stub
		return projetRepository.trierProjetsNomsDate();
	}
	
}
