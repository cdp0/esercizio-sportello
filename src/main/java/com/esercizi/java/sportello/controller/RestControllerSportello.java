package com.esercizi.java.sportello.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esercizi.java.sportello.entity.Prenotazione;
import com.esercizi.java.sportello.service.ServicePrenotazione;



@RestController
public class RestControllerSportello {

	@Autowired
	private ServicePrenotazione p;
	
	@PostMapping("/nuovaPrenotazione")
	public void nuovaPrenotazione(@RequestBody Prenotazione prenotazione){
		p.nuovaPrenotazione(prenotazione);
	}
	
	@GetMapping("/cercaCognome/{id}")
	public String cercaPerId(@PathVariable Long id){
		return p.cercaPerId(id);
	}
		
	@GetMapping("/cercaId/{cognome}")
	public Long cercaIdPerCognome(@PathVariable String cognome){
		return p.cercaIdPerCognome(cognome);
	}
	
	@PostMapping("/prenota/{nome}/{cognome}")
	public Long prenota(@PathVariable String nome, @PathVariable String cognome){
		return p.prenota(nome, cognome);
	}
	
	@DeleteMapping("/rinuncia/{id}")
	public void rinuncia(@PathVariable Long id){
		p.rinuncia(id);
	}
	
	@GetMapping("/tempoAttesa/{id}")
	public int tempoAttesa(@PathVariable Long id){
		return p.tempoAttesa(id);
	}
	
	@GetMapping("/estrai/{id}")
	public Optional<Prenotazione> estrai(@PathVariable Long id){
		return p.estrai(id);
	}
	
	@PostMapping("/prenota1/{cognome}")
	public Long prenota1(@RequestBody Prenotazione prenotazione, @PathVariable String cognome) {
		return p.prenota1(prenotazione, cognome);
	}
}
