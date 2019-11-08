package sopra.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Vol {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Date dtDepart;
	private Date dtArrivee;
	private int capacite;
	private String statut;
	@ManyToOne
	@JoinColumn(name = "depart_id")
	private Aeroport depart;
	@ManyToOne
	@JoinColumn(name = "arrivee_id")
	private Aeroport arrivee;
	@OneToMany(mappedBy = "vol")
	private ArrayList<Escale> escales = new ArrayList<Escale>();
	@OneToMany(mappedBy = "vol")
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	@ManyToOne
	@JoinColumn(name = "compagnieVol_id")
	private CompagnieVol compagnieVol;
	
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
	
	public CompagnieVol getCompagnieVol() {
		return compagnieVol;
	}
	public void setCompagnieVol(CompagnieVol compagnieVol) {
		this.compagnieVol = compagnieVol;
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
