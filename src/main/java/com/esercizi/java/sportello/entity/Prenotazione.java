package com.esercizi.java.sportello.entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table (name="prenotazioni")
public class Prenotazione implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="id_prenotazione")
	private Long idPrenotazione;
	@Column (name="nome")
	private String nome;
	@Column (name="cognome")
	private String cognome;
	
	//costruttori
	public Prenotazione(Long idPrenotazione, String nome, String cognome) {
		this.idPrenotazione = idPrenotazione;
		this.nome = nome;
		this.cognome = cognome;
	}
	public Prenotazione(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public Prenotazione() {
	}
	
	//getters e setters
	public Long getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(Long idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//toString
	@Override
	public String toString() {
		return "Prenotazione [idPrenotazione=" + idPrenotazione + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}
