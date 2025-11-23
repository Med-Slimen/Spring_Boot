package com.slimen.projet.restcontrollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slimen.projet.entities.Projet;
import com.slimen.projet.service.ProjetService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProjetRESTController {
	@Autowired
	ProjetService projetService;
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping()
	public List<Projet> getAllProjets() {
		return projetService.getAllProjets();
	}
	//@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@GetMapping("/{id}")
	public Projet getProduitById(@PathVariable("id") Long id) {
		return projetService.getProjet(id);
	}
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping()
	public Projet createProjet(@RequestBody Projet projet) {
	return projetService.saveProjet(projet);
	}
	//@RequestMapping(method = RequestMethod.PUT)
	@PutMapping()
	public Projet updateProduit(@RequestBody Projet projet) {
	return projetService.updateProjet(projet);
	}
	//@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id)
	{
		projetService.deleteProjetById(id);
	}
	//@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	@GetMapping("/projDeps/{idDepart}")
	public List<Projet> getProjetsByDepId(@PathVariable("idDepart") Long idDepart) {
	return projetService.findByDepartementIdDepart(idDepart);
	}


}
