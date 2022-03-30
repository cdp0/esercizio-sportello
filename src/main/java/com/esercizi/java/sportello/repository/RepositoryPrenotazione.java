package com.esercizi.java.sportello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esercizi.java.sportello.entity.Prenotazione;

@Repository
public interface RepositoryPrenotazione extends JpaRepository <Prenotazione, Long>  {

	@Query(nativeQuery= true, value = "SELECT cognome FROM prenotazioni WHERE id_prenotazione= ?1")
	public String cercaPerId(Long idPrenotazione);
	
	@Query(nativeQuery= true, value = "SELECT id_prenotazione FROM prenotazioni WHERE cognome= ?1")
	public Long cercaIdPerCognome(String cognome);
	
	//nuova prenotazione
	@Query(nativeQuery= true, value = "INSERT INTO prenotazioni (nome, cognome) VALUE (?1, ?2)")
	public void prenota(String nome, String cognome);
	
	//tempo attesa
	@Query(nativeQuery= true, value = "SELECT COUNT(id_prenotazione) FROM prenotazioni WHERE id_prenotazione<?1")
	public int tempoAttesa(Long id);
	
}
