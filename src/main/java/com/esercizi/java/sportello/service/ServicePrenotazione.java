package com.esercizi.java.sportello.service;

import java.util.Optional;

import com.esercizi.java.sportello.entity.Prenotazione;

public interface ServicePrenotazione {

	//servizi prenotazione
	public void nuovaPrenotazione(Prenotazione prenotazione);
	public String cercaPerId(Long id);
	public Long cercaIdPerCognome(String cognome);
	
	//servizi sportello
	public Long prenota(String nome, String cognome);
	public Long prenota1 (Prenotazione prenotazione, String cognome);
	public Optional<Prenotazione> estrai (Long idPrenotazione);
	public void rinuncia(Long idPrenotazione);
	public int tempoAttesa(Long idPrenotazione);
	
}
