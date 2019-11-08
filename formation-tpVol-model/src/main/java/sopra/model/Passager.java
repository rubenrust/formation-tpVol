package tpVol;

import java.util.Date;

public class Passager {

	private String nom;
	private String prenom;
	private Date dtNaissance;
	private String nationalite;
	private String nbIdentite;
	private String specificite;
	private Coordonnee coordonnees;
	private Reservation reservation;
	
	
	
	
	
	@Override
	public String toString() {
		return "Passager [nom=" + nom + ", prenom=" + prenom + ", dtNaissance=" + dtNaissance + ", nationalite="
				+ nationalite + ", nbIdentite=" + nbIdentite + ", specificite=" + specificite + ", coordonnees="
				+ coordonnees + "]";
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDtNaissance() {
		return dtNaissance;
	}
	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getNbIdentite() {
		return nbIdentite;
	}
	public void setNbIdentite(String nbIdentite) {
		this.nbIdentite = nbIdentite;
	}
	public String getSpecificite() {
		return specificite;
	}
	public void setSpecificite(String specificite) {
		this.specificite = specificite;
	}
	public Coordonnee getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(Coordonnee coordonnees) {
		this.coordonnees = coordonnees;
	}
	
	
}
