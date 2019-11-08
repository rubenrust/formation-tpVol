package tpVol;

import java.util.ArrayList;
import java.util.Date;

public class Vol {

	private Long id;
	private Date dtDepart;
	private Date dtArrivee;
	private int capacite;
	private String statut;
	private Aeroport depart;
	private Aeroport arrivee;
	private ArrayList<Escale> escales = new ArrayList<Escale>();
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	private ArrayList<CompagnieVol> compagniesVols = new ArrayList<CompagnieVol>();
	
	public Aeroport getDepart() {
		return depart;
	}
	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}
	public Aeroport getArrivee() {
		return arrivee;
	}
	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}
	public ArrayList<Escale> getEscales() {
		return escales;
	}
	public void setEscales(ArrayList<Escale> escales) {
		this.escales = escales;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	public ArrayList<CompagnieVol> getCompagnies() {
		return compagniesVols;
	}
	public void setCompagnies(ArrayList<CompagnieVol> compagnies) {
		this.compagniesVols = compagnies;
	}
	public Date getDtDepart() {
		return dtDepart;
	}
	public void setDtDepart(Date dtDepart) {
		this.dtDepart = dtDepart;
	}
	public Date getDtArrivee() {
		return dtArrivee;
	}
	public void setDtArrivee(Date dtArrivee) {
		this.dtArrivee = dtArrivee;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
