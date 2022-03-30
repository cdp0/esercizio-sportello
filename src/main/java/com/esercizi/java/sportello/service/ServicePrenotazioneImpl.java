package com.esercizi.java.sportello.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercizi.java.sportello.entity.Prenotazione;
import com.esercizi.java.sportello.repository.RepositoryPrenotazione;

@Service
public class ServicePrenotazioneImpl implements ServicePrenotazione{

	@Autowired
	private RepositoryPrenotazione p;
	
	@Override
	public void nuovaPrenotazione(Prenotazione prenotazione) {
		p.save(prenotazione);		
	}

	@Override
	public String cercaPerId(Long id) {
		return p.cercaPerId(id);
	}

	@Override
	public Long cercaIdPerCognome(String cognome) {
		return p.cercaIdPerCognome(cognome);
	}

	@Override
	public Long prenota (String nome, String cognome) {
		p.prenota(nome, cognome);
		return cercaIdPerCognome(cognome);
	}

	@Override
	public Optional<Prenotazione> estrai(Long idPrenotazione) {
		Long idRicerca=idPrenotazione+1;
		return p.findById(idRicerca);
	}

	@Override
	public void rinuncia(Long idPrenotazione) {
		p.deleteById(idPrenotazione);
	}

	@Override
	public int tempoAttesa(Long idPrenotazione) {
		return p.tempoAttesa(idPrenotazione);
	}

	@Override
	public Long prenota1(Prenotazione prenotazione, String cognome) {
		nuovaPrenotazione(prenotazione);
		return cercaIdPerCognome(cognome);
	}

	

}
